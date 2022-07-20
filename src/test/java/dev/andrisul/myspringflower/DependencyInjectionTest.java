package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.data.Bar;
import dev.andrisul.myspringflower.data.Foo;
import dev.andrisul.myspringflower.data.FooBar;
import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void seUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    void testNoDI() {
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }

    @Test
    void testDI() {
        var foo = applicationContext.getBean("fooSecond", Foo.class);
        var bar = applicationContext.getBean(Bar.class);
        var fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
