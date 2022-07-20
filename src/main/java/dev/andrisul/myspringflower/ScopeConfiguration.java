package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.data.Bar;
import dev.andrisul.myspringflower.data.Foo;
import dev.andrisul.myspringflower.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope("prototype")
    public Foo foo() {
        Foo foo = new Foo();
        log.info("New foo is created!");
        return foo;
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar() {
        log.info("New bar is created");
        return new Bar();
    }
}
