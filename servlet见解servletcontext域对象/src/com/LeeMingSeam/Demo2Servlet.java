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
		//ԭ��servlet  init��config������ɵ���getservletContext��ServletConfig��������getservletContext()��
		String string = servletContext.getInitParameter("lmq");
		System.out.println(string);
		/*servletContext.getRealPath(arg0)*///tomcat�����ļ�·��
		servletContext.getInitParameter("lmq");//web.xml��������Context-param��Ϣ��һ����Ŀֻһ��ServletContext
		servletContext.setAttribute("name", "lmq");//�������Ϣ
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
