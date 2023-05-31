package com.eddies_practice.eddiespractice.repository;

import com.eddies_practice.eddiespractice.model.GraphData;
import com.eddies_practice.eddiespractice.service.GraphDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraphDataServiceImpl implements GraphDataService {

    private final GraphDataRepository graphDataRepository;

    @Autowired
    public GraphDataServiceImpl(GraphDataRepository graphDataRepository) {
        this.graphDataRepository = graphDataRepository;
    }

    @Override
    public List<GraphData> getAllGraphData() {
        return graphDataRepository.findAll();
    }

    @Override
    public List<GraphData> getGraphDataByDay(String day) {
        List<GraphData> graphDataList = graphDataRepository.findByDay(day);

        return graphDataList;
    }
}