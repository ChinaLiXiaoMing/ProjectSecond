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
		ServletOutputStream outputStream = response.getOutputStream();//�½������
		String string = this.getServletContext().getRealPath("timg.jpg");//�õ�ͼƬλ�÷����ַ���
		InputStream inputStream = new FileInputStream(string);//�ѵ�ֵַд������������
		int a=0;
		byte[] b=new byte[1024];//����һ��������õ�ֵַ
		while((a=inputStream.read(b))>0) {
			outputStream.write(b,0,a);
		}
		//�Ȱ���Դ��ַ�����������ٰ����������������飬��output���õ������ַ��
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
