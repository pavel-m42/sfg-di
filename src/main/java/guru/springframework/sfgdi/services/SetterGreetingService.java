package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Fhoenix on 2021/03/06.
 */
@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
