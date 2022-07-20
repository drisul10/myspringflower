package dev.andrisul.myspringflower.service;

import dev.andrisul.myspringflower.data.User;
import dev.andrisul.myspringflower.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password) {
        if (isLoginSuccess(username, password)) {
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        }
        return false;
    }

    private boolean isLoginSuccess(String username, String password) {
        return "Andri".equals(username) && "secret!!".equals(password);
    }
}
