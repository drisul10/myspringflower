package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.service.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class AwareTest {
    private ConfigurableApplicationContext applicationContext;

    @Configuration
    @Import({
            AuthService.class,
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
        AuthService authService = applicationContext.getBean(AuthService.class);

        Assertions.assertEquals("dev.andrisul.myspringflower.service.AuthService", authService.getBeanName());
        Assertions.assertNotNull(authService.getApplicationContext());
        Assertions.assertEquals(applicationContext, authService.getApplicationContext());
    }
}
