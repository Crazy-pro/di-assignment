package alex.klimchuk.spring5.sfgdi.services;

//import org.springframework.stereotype.Service;

/**
 * Copyright Alex Klimchuk (c) 2022.
 */
//@Service
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }

}
