package com.bdi.mvc.service.impl;

import java.util.List;
import java.util.Map;

import com.bdi.mvc.dao.GameChartDAO;
import com.bdi.mvc.dao.impl.GameChartDAOImpl;
import com.bdi.mvc.service.GameChartService;
import com.bdi.mvc.vo.GameChart;

public class GameChartServiceImpl implements GameChartService {

	private GameChartDAO gdao =  new GameChartDAOImpl();
	
	@Override
	public List<GameChart> getGameChartList(GameChart gc) {
		// TODO Auto-generated method stub
		return gdao.SelectGameChartList(gc);
	}

	@Override
	public Map<String, Object> insertGameChart(GameChart gc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> UpdateGameChart(GameChart gc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> deleteGameChart(GameChart gc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameChart getGameChartList(int gcNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
