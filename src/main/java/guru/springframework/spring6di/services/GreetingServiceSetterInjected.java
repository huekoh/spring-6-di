package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt, Spring Framework Guru.
 */
@Service("setterGreetingBean")
public class GreetingServiceSetterInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello everyone from setter injected greeting service!";
    }
}
