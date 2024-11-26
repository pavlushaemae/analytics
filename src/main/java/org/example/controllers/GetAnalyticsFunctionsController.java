package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.entity.AnalyticsObject;
import org.example.service.AnalyticsDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/analytics")
public class GetAnalyticsFunctionsController {

    private final AnalyticsDataService analyticsDataService;

    @GetMapping("/all")
    public ResponseEntity<List<AnalyticsObject>> getAll() {
        List<AnalyticsObject> list = analyticsDataService.findAll();
        if (list != null) {
            return ResponseEntity.ok(list);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
