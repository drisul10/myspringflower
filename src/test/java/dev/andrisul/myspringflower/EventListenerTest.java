package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.listener.LoginSuccessAgainListener;
import dev.andrisul.myspringflower.listener.LoginSuccessListener;
import dev.andrisul.myspringflower.listener.UserListener;
import dev.andrisul.myspringflower.service.AuthService;
import dev.andrisul.myspringflower.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {
    private ConfigurableApplicationContext applicationContext;

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginSuccessAgainListener.class,
            UserListener.class,
    })
    public static class TestConfiguration {

    }

    @BeforeEach
    void seUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testAware() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("Andri", "secret!!");
        userService.login("Jono", "secret!!");
    }
}
