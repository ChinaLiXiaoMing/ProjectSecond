package com.LeeMingSeam;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
		//创建时间
		Date date = new Date();
		//由于tomcat的版本比较高，所以在addCookie时是不能使用空格的 而在ASCII码中32对应的就是空格。只要把后台代码中的空格删掉就可以了。
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd||hh:mm:ss");
		String format = simpleDateFormat.format(date);
		//创建Cookie
		String s1="LoginTime";
		Cookie cookie=new Cookie(s1, format);
		//有效时间
		cookie.setMaxAge(60*10*100);
		//响应带上信息
		response.setContentType("text/html;charset=utf-8");
		response.addCookie(cookie);
		
		String value=null;
		//再次请求拿到Cookie
		Cookie[] cookies = request.getCookies();
		if(cookies !=null) {
			//拿出Cookie
			for(Cookie c:cookies) 
			{
				
				if(s1.equals(c.getName())) {
					 value = c.getValue();
				}
			}
		}
		
		//为空时证明request为第一次请求
		if(value==null) {
			response.getWriter().write("你是第一次访问此网站，访问时间为："+format);
		}
		else
		{
			response.getWriter().write("你上次访问时间为："+value);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
