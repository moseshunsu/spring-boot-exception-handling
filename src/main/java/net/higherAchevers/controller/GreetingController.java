package net.higherAchevers.controller;

import lombok.RequiredArgsConstructor;
import net.higherAchevers.entity.Greeting;
import net.higherAchevers.service.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
@RequiredArgsConstructor
public class GreetingController {
    private final GreetingService service;

    @PostMapping
    public ResponseEntity<String> postGreeting (@RequestBody Greeting greeting) {
        final String greetingMsg = service.saveGreeting(greeting);
        return ResponseEntity.accepted().body(greetingMsg);
    }
}
