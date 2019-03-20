package com.LeeMingSeam;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author Seam
 * 
*/
@WebServlet("/Demo1Servlet")
public class Demo1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Demo1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//������ʽ
		String method = request.getMethod();
		//��ȡURL
		StringBuffer url = request.getRequestURL();
		//��ȡURI
		String uri = request.getRequestURI();
		//��ȡ��ǰ��Ŀ����
		String contextPath = request.getContextPath();
		System.out.println("��ȡ��ǰ��Ŀ����"+contextPath);
		//
		String contextPath2 = this.getServletContext().getContextPath();
		System.out.println(contextPath2);
		//��ȡ����ͷ��Ϣ ��ֵ��key-value
		String header = request.getHeader("");
		//��ȡ������������ݣ�
		String parameter = request.getParameter("");
		//��ȡ����ͷ��Ϣ������
		Enumeration<String> headerNames = request.getHeaderNames();
		//��ȡ�����������
		Enumeration<String> parameterNames = request.getParameterNames();
		//��ȡ����map����
		Map<String, String[]> parameterMap = request.getParameterMap();
		//request�Ǹ�����󣨣�
		//�洢������Ϣ
		request.setAttribute("", "");
		//�õ�������Ϣ
		request.getAttribute("");
		//�Ƴ�������Ϣ
		request.removeAttribute("");
		
		/*forward��ת���Ƿ�����servers��Ϊ����ַ������仯��������servlet2�ģ� 
		 * 
		 * && redirect���ض�����client�ͻ�����Ϊ�����䣩*/
		
		//request��
		//ÿ������request�������µģ������������ ��Ч��Χ�������һ��������ɺ�ʧЧ
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
