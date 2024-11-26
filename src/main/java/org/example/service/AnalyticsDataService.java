package org.example.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.entity.AnalyticsObject;
import org.example.repository.AnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class AnalyticsDataService {

    @Autowired private AnalyticsRepository repository;

    public List<AnalyticsObject> findAll() {
        return repository.findAll();
    }
}
