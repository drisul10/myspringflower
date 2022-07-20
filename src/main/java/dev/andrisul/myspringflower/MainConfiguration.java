package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.configuration.BarConfiguration;
import dev.andrisul.myspringflower.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
