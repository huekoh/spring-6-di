package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public interface EnvironmentService {
    String getEnv();
}
