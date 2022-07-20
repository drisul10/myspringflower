package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.data.Connection;
import dev.andrisul.myspringflower.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void seUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
//        applicationContext.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        applicationContext.close();
    }

    @Test
    void testConnection() {
        Connection connection = applicationContext.getBean(Connection.class);
    }

    @Test
    void testServer() {
        Server server = applicationContext.getBean(Server.class);
    }
}
