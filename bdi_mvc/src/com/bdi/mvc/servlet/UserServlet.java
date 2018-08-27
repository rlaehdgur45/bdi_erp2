package com.bdi.mvc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdi.mvc.service.UserService;
import com.bdi.mvc.service.impl.UserServiceImpl;
import com.bdi.mvc.vo.Maker;
import com.bdi.mvc.vo.User;


public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService us= new UserServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/")+1);
		
		if(cmd.equals("userList")) {
			List<User> userList = us.getUserList(null);
			request.setAttribute("list", userList);
			
		}else if(cmd.equals("userView")|| cmd.equals("userUpdate")) {
			String uiNostr = request.getParameter("uiNo");
			if(uiNostr==null) {
				request.setAttribute("msg", "사용자 번호 없이는 불가능합니다.");
				response.sendError(HttpServletResponse.SC_NOT_FOUND);
				return;
			}
			int uiNo= Integer.parseInt(uiNostr);
			request.setAttribute("user", us.getUser(uiNo));
			
		}else if(cmd.equals("userInsert")) {
			
		}else if(cmd.equals("userUpdate")) {
			
		}
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/")+1);
		
		request.setCharacterEncoding("utf-8");
		
		if(cmd.equals("userUpdate")) {
			String uiNo = request.getParameter("uiNo");
			String uiName = request.getParameter("uiName");
			String uiId = request.getParameter("uiId");
			String uiPwd = request.getParameter("uiPwd");
			String uiDesc = request.getParameter("uiDesc");
			String uiAge = request.getParameter("uiAge");
			String diNo = request.getParameter("diNo");
			
			User ur= new User(Integer.parseInt("uiNo"),
					uiName,
					uiId,
					uiPwd,
					uiDesc,
					Integer.parseInt("uiAge"),
					Integer.parseInt("diNo")
					);
			request.setAttribute("rMap",us.UpdateUser(ur));
		}else if(cmd.equals("userInsert")) {
			String uiName = request.getParameter("uiName");
			String uiId = request.getParameter("uiId");
			String uiPwd = request.getParameter("uiPwd");
			String uiDesc = request.getParameter("uiDesc");
			String uiAge = request.getParameter("uiAge");
			String diNo = request.getParameter("diNo");
			User ur = new User(0,
					uiName,
					uiId,
					uiPwd,
					uiDesc,
					Integer.parseInt("uiAge"),
					Integer.parseInt("diNo")
					);
			request.setAttribute("rMap", us.insertUser(ur));
		}else if(cmd.equals("makerDelete")) {
			String uiNo = request.getParameter("uiNo");
			User ur = new User(Integer.parseInt(uiNo),null,null,null,null,0,0);
			request.setAttribute("rMap", us.deleteUser(ur));
			uri = "/views/user/userView";
		}
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}
	

}
