package com.LeeMingSeam;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author Seam
 * 
*/
@WebServlet("/Demo1Servlet")
public class Demo1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Demo1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//得请求方式
		String method = request.getMethod();
		//获取URL
		StringBuffer url = request.getRequestURL();
		//获取URI
		String uri = request.getRequestURI();
		//获取当前项目名称
		String contextPath = request.getContextPath();
		System.out.println("获取当前项目名称"+contextPath);
		//
		String contextPath2 = this.getServletContext().getContextPath();
		System.out.println(contextPath2);
		//获取请求头信息 键值对key-value
		String header = request.getHeader("");
		//获取请求参数（数据）
		String parameter = request.getParameter("");
		//获取请求头信息的名字
		Enumeration<String> headerNames = request.getHeaderNames();
		//获取请求参数名字
		Enumeration<String> parameterNames = request.getParameterNames();
		//获取请求map数组
		Map<String, String[]> parameterMap = request.getParameterMap();
		//request是个域对象（）
		//存储对象信息
		request.setAttribute("", "");
		//得到对象信息
		request.getAttribute("");
		//移除对象信息
		request.removeAttribute("");
		
		/*forward（转发是服务器servers行为，地址栏不会变化，数据是servlet2的） 
		 * 
		 * && redirect（重定向是client客户端行为，都变）*/
		
		//request域
		//每次请求，request对象都是新的，往里面存数据 有效范围：在完成一次请求完成后失效
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
