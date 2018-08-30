package com.bdi.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bdi.mvc.common.DBCon;
import com.bdi.mvc.dao.GameChartDAO;
import com.bdi.mvc.vo.GameChart;
import com.bdi.mvc.vo.User;

public class GameChartDAOImpl implements GameChartDAO {

	@Override
	public List<GameChart> SelectGameChartList(GameChart gc) {
		List<GameChart> list = new ArrayList<GameChart>();
		Connection con = DBCon.getCon();
		PreparedStatement ps = null; 
		ResultSet rs = null;
		String sql= "select gcNum,gcName,gcPrice,gcVendor,gcOrder,gcDesc,gcImg from game_Chart";
		try {
			ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				gc=new GameChart(rs.getInt("gcNum"), 
						rs.getString("gcName"), 
						rs.getInt("gcPrice"),
						rs.getInt("gcVendor"), 
						rs.getInt("gcOrder"), 
						rs.getString("gcDesc"),
						rs.getString("gcImg"));
				list.add(gc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}else if(ps!=null) {
					ps.close();
				}
			} catch (SQLException e) {
				
			}
			DBCon.close();
		}
		return list;
	}

	@Override
	public User SelectGameChart(int gcNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertGameChart(GameChart gc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int UpdateGameChart(GameChart gc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteGameChart(GameChart gc) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
