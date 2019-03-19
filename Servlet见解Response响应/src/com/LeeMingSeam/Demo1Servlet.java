package com.LeeMingSeam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo1Servlet
 */
public class Demo1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		 * 状态码
		 * 200----0k
		 * 
		 * 404----not found
		 * 
		 * 500----servers error
		 * 
		 * 304------重定向
		*/
		
		//响应状态码设置
		//response.setStatus(404);
		//响应行修改
		response.addHeader("name", "zhangsan");
		//Date date = new Date();改变时间显示
		//long time = date.getTime();
		//response.addDateHeader(string , time);
		//response.addIntHeader("", 123);
		//response.setHeader(arg0, arg1);同add，set会覆盖，add叠加//(location，“”)重定向
		//response.setDateHeader(arg0, arg1);
		//response.setIntHeader(arg0, arg1);
		//response.sendRedirect("");重定向redirection（收到request ，response给他另个界面（servlet））
        //response.setHeader("refresh", "8,url=http://www.baidu.com");定时重定向
		//js：windows.location="http://www.baidu.com"
		//response.setCharacterEncoding("");设置编码格式
		//输入是一个格式 ，browser还是用别的编码格式
		//response.setHeader("Content-Type", "text/html;charset=utf-8");告知browser要用哪个编码格式
		//response.setContentType("text/html;charset=utf-8");
		/*PrintWriter writer = response.getWriter();
		writer.write("");*///write 在页面
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
