package com.LeeMingSeam;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;
import com.pojo.User;

/**
 * Servlet implementation class LoginWindowsServlet
 */
public class LoginWindowsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginWindowsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String us = request.getParameter("username");
		String pw = request.getParameter("password");
		
		
		try {
			//注册驱动
			DriverManager.registerDriver(new Driver());
			
			//获取连接对象
			String url="jdbc:mysql://localhost:3306/login";
			String user="root";
			String password="123";
			
			Connection connection = DriverManager.getConnection(url, user, password);
			//使用连接对象创建 sql查询器（）
			Statement statement = connection.createStatement();
			
			//准备sql
			String sql="SELECT * FROM tb_user WHERE username='"+us+"'AND `password`='"+pw+"'";
			//接受查询后信息数据
			ResultSet query = statement.executeQuery(sql);
			
			User use=new User();
			
			while(query.next()) {
				//从结果集里取出对象
				String s1 = query.getString("username");
				String s2 = query.getString("password");
				//将数据塞给pojo
				use.setName(s1);	
				use.setPassword(s2);;
			}
			//判断
			if(use.getName()!=null) {
				System.out.println("登录成功！！！");
			}else {
				System.out.println("你还没有注册过请返回注册");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//遇到无法访问类主要先找web.xml文件上是否映射文件名一致
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
