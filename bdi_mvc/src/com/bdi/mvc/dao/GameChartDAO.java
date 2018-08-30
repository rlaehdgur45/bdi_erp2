package com.bdi.mvc.dao;

import java.util.List;

import com.bdi.mvc.vo.GameChart;
import com.bdi.mvc.vo.User;

public interface GameChartDAO {
	List<GameChart> SelectGameChartList(GameChart gc);
	public User SelectGameChart(int gcNum);
	public int insertGameChart(GameChart gc);
	public int UpdateGameChart(GameChart gc);
	public int deleteGameChart(GameChart gc);
}
