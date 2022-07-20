package dev.andrisul.myspringflower;

import com.sun.org.apache.xpath.internal.operations.Mult;
import dev.andrisul.myspringflower.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "dev.andrisul.myspringflower.service",
        "dev.andrisul.myspringflower.repository",
        "dev.andrisul.myspringflower.configuration",
})

@Import(MultiFoo.class)
public class ComponentConfiguration {
}
