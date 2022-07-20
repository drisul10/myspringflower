package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.data.Bar;
import dev.andrisul.myspringflower.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationMainScanTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void seUp() {
        applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testScan() {
//        Foo foo = applicationContext.getBean(Foo.class);
//        Bar bar = applicationContext.getBean(Bar.class);
    }
}
