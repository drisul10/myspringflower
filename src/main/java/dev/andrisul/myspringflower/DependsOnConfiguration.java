package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.data.Bar;
import dev.andrisul.myspringflower.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.*;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn({"bar"})
    public Foo foo() {
        Foo foo = new Foo();
        log.info("New foo is created!");
        return foo;
    }

    @Bean
    public Bar bar() {
        Bar bar = new Bar();
        log.info("New bar is created!");
        return bar;
    }
}
