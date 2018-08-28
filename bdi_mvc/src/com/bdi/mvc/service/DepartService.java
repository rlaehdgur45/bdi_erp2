package com.bdi.mvc.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.bdi.mvc.vo.Depart;

public interface DepartService {
	public List<Depart> selectDepartList(Depart deart) throws SQLException;
	public Map<String,Object> insertDepart(Depart deart) throws SQLException;
	
}
