package com.LeeMingSeam;

import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo4Servlet
 */
public class Demo4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo4Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletOutputStream outputStream = response.getOutputStream();//新建输出流
		String string = this.getServletContext().getRealPath("timg.jpg");//得到图片位置返回字符串
		InputStream inputStream = new FileInputStream(string);//把地址值写到输入流里面
		int a=0;
		byte[] b=new byte[1024];//定义一组数组放置地址值
		while((a=inputStream.read(b))>0) {
			outputStream.write(b,0,a);
		}
		//先把资源地址给输入流，再把输入流遍历给数组，用output流拿到数组地址。
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
