package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.data.Bar;
import dev.andrisul.myspringflower.data.Foo;
import dev.andrisul.myspringflower.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {
    @Primary
    @Bean
    public Foo fooFirst() {
        Foo foo = new Foo();
        return foo;
    }

    @Bean
    public Foo fooSecond() {
        Foo foo = new Foo();
        return foo;
    }

    @Bean
    public Bar bar() {
        Bar bar = new Bar();
        return bar;
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar) {
        FooBar fooBar = new FooBar(foo, bar);
        return fooBar;
    }
}
