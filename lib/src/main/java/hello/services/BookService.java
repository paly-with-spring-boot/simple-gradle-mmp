package hello.services;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class BookService {
    private final ServiceProperties serviceProperties;//construct inject

    public BookService(ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }
    public String getWelcomeMessage(){
        return serviceProperties.getWelcomeMessage();
    }
}
