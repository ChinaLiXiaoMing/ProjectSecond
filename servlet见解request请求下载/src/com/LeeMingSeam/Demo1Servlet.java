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
	
		//�õ������ļ�������
	String string = request.getParameter("filename");
		//�������������֣��ǵ�utf-8
	String s1="ISO8859-1";
	//ת����ʽ
	string=new String(s1.getBytes(), "utf-8");
	
	//ȡ��������汾��Ϣ
	request.getHeader("");
	//����ͷ����Ϣʵ�ֱ���ı�
	//contains����
	//MINE��ʽ��Ҫ����һ��ҪMINE��ʽ��
	response.setHeader("Conten-Type", this.getServletContext().getMimeType(string));
	//ǿ�������browser����download
	response.setHeader("Content-Disposition:attachment;filename=",string);
	//�Զ�������
	/*response.setHeader("Content-Disposition:attachment;filename="+string,filename);*/
		//�Ҵ��ļ�����·��Tomcat
	String path = request.getServletContext().getRealPath("/download/"+string);
		//�½������
	ServletOutputStream outputStream = response.getOutputStream();
		//�½�������������·�������
	InputStream inputStream = new FileInputStream(path);
		//��������װ������
	byte []by=new byte[1024];
	
	int b=0;
	while((b=inputStream.read(by))>0){
		//д�������
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
