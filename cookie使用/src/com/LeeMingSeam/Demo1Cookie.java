package com.LeeMingSeam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo1Cookie
 * @author Seam
 */
public class Demo1Cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo1Cookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Cookie cookie=new Cookie("name", "zhangsan");
		//设置cookie的存活时间 单位/秒  时间到自动删除
		cookie.setMaxAge(10*60);
		//writer Cookie in browser
		response.addCookie(cookie); 	
		//确定Cookie位置(不同servlet)
		cookie.setPath("/cookie使用/Demo1Cookie");
		//删除,重写流程一遍
		cookie.setMaxAge(0);
		//获取cookie里面信息
		//cookie数组
		Cookie[] cookies = request.getCookies();
		//先判断cookie里面有没有值
		if(cookies!=null) {
			//取出所有信息
			for (Cookie ck:cookies) {
				ck.getName();
				ck.getValue();
			}
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
