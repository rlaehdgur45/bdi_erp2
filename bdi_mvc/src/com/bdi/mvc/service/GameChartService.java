package com.bdi.mvc.service;

import java.util.List;
import java.util.Map;

import com.bdi.mvc.vo.GameChart;
import com.bdi.mvc.vo.User;

public interface GameChartService {
	List<GameChart> getGameChartList(GameChart gc);
	public GameChart getGameChartList(int gcNum);
	public Map<String,Object> insertGameChart(GameChart gc);
	public Map<String,Object> UpdateGameChart(GameChart gc);
	public Map<String,Object> deleteGameChart(GameChart gc);
}
