package dev.andrisul.myspringflower.configuration;

import dev.andrisul.myspringflower.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    @Bean
    public Bar bar() {
        return new Bar();
    }
}
