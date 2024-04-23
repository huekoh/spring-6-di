package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt, Spring Framework Guru.
 */
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello everyone from property injected greeting service!";
    }
}
