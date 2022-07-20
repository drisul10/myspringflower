package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.configuration.BarConfiguration;
import dev.andrisul.myspringflower.configuration.FooConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "dev.andrisul.myspringflower.configuration"
})
public class ScanConfiguration {
}
