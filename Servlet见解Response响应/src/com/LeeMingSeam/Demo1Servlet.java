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
		 * ״̬��
		 * 200----0k
		 * 
		 * 404----not found
		 * 
		 * 500----server err
		 * 
		 * 304------�ض���
		*/
		
		//��Ӧ״̬������
		//response.setStatus(404);
		//��Ӧ���޸�
		response.addHeader("name", "zhangsan");
		//Date date = new Date();�ı�ʱ����ʾ
		//long time = date.getTime();
		//response.addDateHeader(string , time);
		//response.addIntHeader("", 123);
		//response.setHeader(arg0, arg1);ͬadd��set�Ḳ�ǣ�add����//(location������)�ض���
		//response.setDateHeader(arg0, arg1);
		//response.setIntHeader(arg0, arg1);
		//response.sendRedirect("");�ض���redirection���յ�request ��response����������棨servlet����
        //response.setHeader("refresh", "8,url=http://www.baidu.com");��ʱ�ض���
		//js��windows.location="http://www.baidu.com"
		//response.setCharacterEncoding("");���ñ����ʽ
		//������һ����ʽ ��browser�����ñ�ı����ʽ
		//response.setHeader("Content-Type", "text/html;charset=utf-8");��֪browserҪ���ĸ������ʽ
		//response.setContentType("text/html;charset=utf-8");
		/*PrintWriter writer = response.getWriter();
		writer.write("");*///write ��ҳ��
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
