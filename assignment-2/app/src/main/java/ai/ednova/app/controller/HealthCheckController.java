package ai.ednova.app.controller;

import ai.ednova.app.dtos.HealthCheckResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheckController {
    @GetMapping("/v1/health")
    public ResponseEntity<HealthCheckResponse> healthCheck() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(HealthCheckResponse.builder().message("OK").build());
    }
}
