package com.eddies_practice.eddiespractice.controller;

// import java.util.ArrayList;
import java.util.List;

import com.eddies_practice.eddiespractice.model.GraphData;
import com.eddies_practice.eddiespractice.service.GraphDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@RequestMapping("/api/graph-data")
public class GraphController {

    private final GraphDataService graphDataService;

    @Autowired
    public GraphController(GraphDataService graphDataService) {
        this.graphDataService = graphDataService;
    }

    @CrossOrigin(origins = "http://localhost:8082")
    @GetMapping("/{day}")
    public List<GraphData> getGraphDataByDay(@PathVariable("day") String day) {
        List<GraphData> graphDataList = graphDataService.getGraphDataByDay(day);
        return graphDataList;
    }
}