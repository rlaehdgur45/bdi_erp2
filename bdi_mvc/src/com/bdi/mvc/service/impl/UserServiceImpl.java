package com.bdi.mvc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bdi.mvc.dao.UserDAO;
import com.bdi.mvc.dao.impl.UserDAOImpl;
import com.bdi.mvc.service.UserService;
import com.bdi.mvc.vo.User;

public class UserServiceImpl implements UserService {

	private UserDAO udao =  new UserDAOImpl();
	
	@Override
	public List<User> getUserList(User us) {
		// TODO Auto-generated method stub
		return udao.SelectUserList(us);
	}

	@Override
	public User getUser(int uiNo) {
		// TODO Auto-generated method stub
		return udao.SelectUser(uiNo);
	}

	@Override
	public Map<String, Object> insertUser(User us) {
		Map<String, Object> rMap = new HashMap<String,Object>();
		rMap.put("msg", "메이커 등록 오류!");
		rMap.put("success", "false");
		if(udao.insertUser(us)==1) {
			rMap.put("msg", "정상적으로 등록 되었습니다.");
			rMap.put("success", "true");
		}
		return rMap;
	}

	@Override
	public Map<String, Object> UpdateUser(User us) {
		Map<String, Object> rMap = new HashMap<String, Object>();
		rMap.put("msg", "수정실패!");
		rMap.put("success", "false");
		int cnt = udao.UpdateUser(us);
		if(cnt==1) {
			rMap.put("msg", "수정성공!");
			rMap.put("success", "true");
		}
		return rMap;
	}

	@Override
	public Map<String, Object> deleteUser(User us) {
		Map<String,Object> rMap = new HashMap<String,Object>();
		rMap.put("msg", "수정실패!");
		rMap.put("success", "false");
		int cnt = udao.deleteUser(us);
		if(cnt==1) {
			rMap.put("msg", "수정성공!");
			rMap.put("success", "true");
			
		}
		return rMap;
	}

}
