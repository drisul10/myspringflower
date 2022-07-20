package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
class BeanNameConfiguration {

    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1() {
        return new Foo();
    }

    @Bean(value = "fooSecond")
    public Foo foo2() {
        return new Foo();
    }
}