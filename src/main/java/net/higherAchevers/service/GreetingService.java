package net.higherAchevers.service;

import net.higherAchevers.entity.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String saveGreeting(Greeting greeting) {
        return "Greeting message <<" +
                greeting.getMsg()
                + ">> from: " +
                greeting.getFrom().toUpperCase() +
                " to: " +
                greeting.getTo().toUpperCase();
    }
}
