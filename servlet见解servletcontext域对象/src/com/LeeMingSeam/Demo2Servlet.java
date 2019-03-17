package com.LeeMingSeam;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo2Servlet
 */
public class Demo2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext servletContext = this.getServletContext();
		//原生servlet  init（config）里面可调用getservletContext（ServletConfig类里面有getservletContext()）
		String string = servletContext.getInitParameter("lmq");
		System.out.println(string);
		/*servletContext.getRealPath(arg0)*///tomcat里面文件路径
		servletContext.getInitParameter("lmq");//web.xml配置里面Context-param信息，一个项目只一个ServletContext
		servletContext.setAttribute("name", "lmq");//存对象信息
		servletContext.getAttribute("name");
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
