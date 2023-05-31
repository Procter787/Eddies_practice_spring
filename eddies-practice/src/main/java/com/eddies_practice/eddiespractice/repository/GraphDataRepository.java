package com.eddies_practice.eddiespractice.repository;

import com.eddies_practice.eddiespractice.model.GraphData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GraphDataRepository extends MongoRepository<GraphData, String> {
    List<GraphData> findByDay(String day);
}