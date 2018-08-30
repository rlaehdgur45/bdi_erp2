package com.bdi.mvc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdi.mvc.service.GameChartService;
import com.bdi.mvc.service.impl.GameChartServiceImpl;
import com.bdi.mvc.vo.GameChart;



public class GameChartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GameChartService gc= new GameChartServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri= "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/")+1);
		
		if(cmd.equals("gameChartList")) {
			List<GameChart> gameChartList = gc.getGameChartList(null);
			request.setAttribute("list", gameChartList);
		}else if(cmd.equals("gameChartView")|| cmd.equals("gameChartUpdate")) {
			String gcNumstr = request.getParameter("gcNum");
			if(gcNumstr==null) {
				request.setAttribute("msg", "사용자 번호 없이는 불가능합니다.");
				response.sendError(HttpServletResponse.SC_NOT_FOUND);
				return;
			}
			int gcNum= Integer.parseInt(gcNumstr);
			request.setAttribute("gameChart", gc.getGameChartList(gcNum));
			
		}else if(cmd.equals("userInsert")) {
			
		}else if(cmd.equals("userUpdate")) {
			
		}
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

	}

}
