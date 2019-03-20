package com.LeeMingSeam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo1Servlet
 * @anthor Lee
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
	
		//拿到请求文件的名字
	String string = request.getParameter("filename");
		//如果获得中文名字，记得utf-8
	String s1="ISO8859-1";
	//转换格式
	string=new String(s1.getBytes(), "utf-8");
	
	//取到浏览器版本信息
	request.getHeader("");
	//根据头部信息实现编码改变
	//contains包含
	//MINE格式（要下载一定要MINE格式）
	response.setHeader("Conten-Type", this.getServletContext().getMimeType(string));
	//强制浏览器browser下载download
	response.setHeader("Content-Disposition:attachment;filename=",string);
	//自定义名字
	/*response.setHeader("Content-Disposition:attachment;filename="+string,filename);*/
		//找打文件绝对路径Tomcat
	String path = request.getServletContext().getRealPath("/download/"+string);
		//新建输出流
	ServletOutputStream outputStream = response.getOutputStream();
		//新建输入流，放入路径获得流
	InputStream inputStream = new FileInputStream(path);
		//定义数组装载数据
	byte []by=new byte[1024];
	
	int b=0;
	while((b=inputStream.read(by))>0){
		//写出输出流
		outputStream.write(by, 0, b);
	}
		
		inputStream.close();
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
