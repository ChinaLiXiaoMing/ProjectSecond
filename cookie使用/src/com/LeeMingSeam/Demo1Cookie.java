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
		//����cookie�Ĵ��ʱ�� ��λ/��  ʱ�䵽�Զ�ɾ��
		cookie.setMaxAge(10*60);
		//writer Cookie in browser
		response.addCookie(cookie); 	
		//ȷ��Cookieλ��(��ͬservlet)
		cookie.setPath("/cookieʹ��/Demo1Cookie");
		//ɾ��,��д����һ��
		cookie.setMaxAge(0);
		//��ȡcookie������Ϣ
		//cookie����
		Cookie[] cookies = request.getCookies();
		//���ж�cookie������û��ֵ
		if(cookies!=null) {
			//ȡ��������Ϣ
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
