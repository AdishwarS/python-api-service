package pythonapiservice.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "service", "python-api-service");
    }

    @GetMapping("/info")
    public Map<String, Object> info() {
        return Map.of(
            "name", "python-api-service",
            "version", "1.0.0",
            "description", "&quot;Build a Python FastAPI microservice with MongoDB, JWT auth, and Docker for inventory management&quot;",
            "owner", "backstage-user"
        );
    }
}