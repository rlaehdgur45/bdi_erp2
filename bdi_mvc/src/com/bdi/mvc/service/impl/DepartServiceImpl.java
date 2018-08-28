package com.bdi.mvc.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bdi.mvc.common.DBCon;
import com.bdi.mvc.dao.DepartDAO;
import com.bdi.mvc.dao.impl.DepartDAOImpl;
import com.bdi.mvc.service.DepartService;
import com.bdi.mvc.vo.Depart;

public class DepartServiceImpl implements DepartService {
	public DepartDAO ddao = new DepartDAOImpl();
	@Override
	public List<Depart> selectDepartList(Depart deart) throws SQLException {
		
		ddao.setConnection(DBCon.getCon());
		try {
			return ddao.selectDepartList(null);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
		return null;
	}

	@Override
	public Map<String, Object> insertDepart(Depart deart) throws SQLException {
		ddao.setConnection(DBCon.getCon());
		try {
			int cnt = ddao.insertDepart(deart);
			Map<String, Object>rMap = new HashMap<String,Object>();
			rMap.put("cnt", cnt);
			rMap.put("msg", "저장에 실패했어요");
			if(cnt==1){
				rMap.put("msg", "저장에 성공했어요");
			}
			return rMap;
		} catch (Exception e) {
			throw e;
		}finally {
			DBCon.close();
		}
		
		
	}
	

}
