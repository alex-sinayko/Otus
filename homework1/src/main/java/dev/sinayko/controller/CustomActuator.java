package dev.sinayko.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.sinayko.dto.HealthStatus;

@RequestMapping("/health")
@RestController
public class CustomActuator {

    @RequestMapping("/")
    public HealthStatus getStatus(){
        var result = new HealthStatus();
        result.setStatus("OK");
        return result;
    }
}
