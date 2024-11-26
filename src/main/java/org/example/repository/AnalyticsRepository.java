package org.example.repository;

import lombok.AllArgsConstructor;
import org.example.entity.AnalyticsObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnalyticsRepository extends CrudRepository<AnalyticsObject, Long> {
    List<AnalyticsObject> findAll();
}
