package com.aegis.platform.controller;

import com.aegis.platform.common.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/api/v1/health")
    public ApiResponse<Map<String, Object>> health() {

        Map<String, Object> healthData = Map.of(
                "status", "UP",
                "service", "AEGIS Platform",
                "version", "1.0.0"
        );

        return new ApiResponse<>(
                true,
                "Health check successful",
                healthData
        );
    }
}