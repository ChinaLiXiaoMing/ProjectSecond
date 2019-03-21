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
		//Session是个域对象 Key<String>-value<Object>
		session.setAttribute("1", "");
		//得到SessionID,多次请求id不会变，因为GetSession()会查找此Servlet有没有Session
		String id = session.getId();
		//得到Session信息
		Object object = session.getAttribute("1");
		//删除
		session.removeAttribute("1");
		//session销毁
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
