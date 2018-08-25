package com.bdi.mvc.dao;

import java.util.List;
import java.util.Map;

import com.bdi.mvc.vo.User;

public interface UserDAO {
	public List<User> SelectUserList(User us);
	public User SelectUser(int uiNo);
	public int insertUser(User us);
	public int UpdateUser(User us);
	public int deleteUser(User us);
}
