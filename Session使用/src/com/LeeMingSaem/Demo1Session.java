package com.LeeMingSaem;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Demo1Session
 */
public class Demo1Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo1Session() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
/*		response.getWriter().append("Served at: ").append(request.getContextPath());
*/
		HttpSession session = request.getSession();
		//Session�Ǹ������ Key<String>-value<Object>
		session.setAttribute("1", "");
		//�õ�SessionID,�������id����䣬��ΪGetSession()����Ҵ�Servlet��û��Session
		String id = session.getId();
		//�õ�Session��Ϣ
		Object object = session.getAttribute("1");
		//ɾ��
		session.removeAttribute("1");
		//session����
		session.invalidate();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
