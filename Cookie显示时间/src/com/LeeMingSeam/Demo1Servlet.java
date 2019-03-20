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
		//����ʱ��
		Date date = new Date();
		//����tomcat�İ汾�Ƚϸߣ�������addCookieʱ�ǲ���ʹ�ÿո�� ����ASCII����32��Ӧ�ľ��ǿո�ֻҪ�Ѻ�̨�����еĿո�ɾ���Ϳ����ˡ�
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd||hh:mm:ss");
		String format = simpleDateFormat.format(date);
		//����Cookie
		String s1="LoginTime";
		Cookie cookie=new Cookie(s1, format);
		//��Чʱ��
		cookie.setMaxAge(60*10*100);
		//��Ӧ������Ϣ
		response.setContentType("text/html;charset=utf-8");
		response.addCookie(cookie);
		
		String value=null;
		//�ٴ������õ�Cookie
		Cookie[] cookies = request.getCookies();
		if(cookies !=null) {
			//�ó�Cookie
			for(Cookie c:cookies) 
			{
				
				if(s1.equals(c.getName())) {
					 value = c.getValue();
				}
			}
		}
		
		//Ϊ��ʱ֤��requestΪ��һ������
		if(value==null) {
			response.getWriter().write("���ǵ�һ�η��ʴ���վ������ʱ��Ϊ��"+format);
		}
		else
		{
			response.getWriter().write("���ϴη���ʱ��Ϊ��"+value);
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
