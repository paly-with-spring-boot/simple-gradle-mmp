package hello.services;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("book-service")
public class ServiceProperties {
    private String welcomeMessage;

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}
