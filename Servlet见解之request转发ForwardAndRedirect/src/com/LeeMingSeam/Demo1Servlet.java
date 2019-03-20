package com.LeeMingSeam;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Saem
 */
public class Demo1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Demo1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*forward��ת���Ƿ�����servers��Ϊ����ַ������仯��������servlet2�ģ� 
		 * 
		 * && redirect���ض�����client�ͻ�����Ϊ�����䣩*/
		
		//����ת����Dispatcher����
		//����ͬһ��������������URLӦ����
		//request.getRequestDispatcher("/Servlet����֮requestת��ForwardAndRedirect/XX(Servlet-mapping Servlet-name)");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Demo2Servlet");
		//��Demo1Servlet��Request��Responseת��Demo2Servlet
		requestDispatcher.forward(request, response);
	    //�����ض�����response��Ϊ����ת����request��Ϊ
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
