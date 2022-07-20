package dev.andrisul.myspringflower.listener;

import dev.andrisul.myspringflower.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event) {
        log.info("Success login from userLister for user {}", event.getUser());
    }
}
