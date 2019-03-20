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
		
		/*forward（转发是服务器servers行为，地址栏不会变化，数据是servlet2的） 
		 * 
		 * && redirect（重定向是client客户端行为，都变）*/
		
		//创建转发器Dispatcher对象
		//不是同一个服务器对象是URL应该是
		//request.getRequestDispatcher("/Servlet见解之request转发ForwardAndRedirect/XX(Servlet-mapping Servlet-name)");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Demo2Servlet");
		//把Demo1Servlet的Request，Response转给Demo2Servlet
		requestDispatcher.forward(request, response);
	    //还有重定向是response行为，但转发是request行为
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
