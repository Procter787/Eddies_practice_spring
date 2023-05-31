package com.eddies_practice.eddiespractice.service;

import com.eddies_practice.eddiespractice.model.GraphData;

import java.util.List;

public interface GraphDataService {
    List<GraphData> getAllGraphData();
    List<GraphData> getGraphDataByDay(String day);
}