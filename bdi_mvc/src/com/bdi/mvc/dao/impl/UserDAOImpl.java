package com.bdi.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.bdi.mvc.common.DBCon;
import com.bdi.mvc.dao.UserDAO;
import com.bdi.mvc.vo.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<User> SelectUserList(User us) {
		List<User> list = new ArrayList<User>();
		Connection con = DBCon.getCon();
		PreparedStatement ps= null;
		ResultSet rs = null;
		String sql = "select uiNo,uiName,uiId,uiPwd,uiDesc,uiAge,diNo from user_info";
		try {
			ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				us=new User(rs.getInt("uiNo"), 
						rs.getString("uiName"), 
						rs.getString("uiId"),
						rs.getString("uiPwd"), 
						rs.getString("uiDesc"), 
						rs.getInt("uiAge"),
						rs.getInt("diNo"));
				list.add(us);
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
	public User SelectUser(int uiNo) {
		Connection con = DBCon.getCon();
		PreparedStatement ps= null;
		ResultSet rs = null;
		String sql = "select uiNo,uiName,uiId,uiPwd,uiDesc,uiAge,diNo from user_info where uiNo=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, uiNo);
			rs = ps.executeQuery();
			if(rs.next()) {
				User us = new User(rs.getInt("uiNo"),
						rs.getString("uiName"),
						rs.getString("uiId"),
						rs.getString("uiPwd"),
						rs.getString("uiDesc"),
						rs.getInt("uiAge"),
						rs.getInt("diNo"));
				return us;
			}
		} catch (SQLException e) {
			e.getStackTrace();
		}finally {
			try {
				if(rs==null) {
					rs.close();
				}else if(ps==null) {
					ps.close();
				}
			} catch (SQLException e) {
				
			}
			DBCon.close();
		}
		return null;
	}

	@Override
	public int insertUser(User us) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int UpdateUser(User us) {
		Connection con = DBCon.getCon();
		String sql = "update user_info\r\n" +
				"set uiName=?, "+
				"uiId=?," +
				"uiPwd=?," +
				"uiDesc=?," +
				"uiAge=?," +
				"diNo=?";
		try {
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1, us.getUiname());
			ps.setString(2, us.getUiid());
			ps.setString(3, us.getUipwd());
			ps.setString(4, us.getUidesc());
			ps.setInt(5, us.getUiage());
			ps.setInt(6, us.getDino());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
		return 0;
	}

	@Override
	public int deleteUser(User us) {
		// TODO Auto-generated method stub
		return 0;
	}

}
