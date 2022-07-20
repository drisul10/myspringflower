package dev.andrisul.myspringflower.application;

import dev.andrisul.myspringflower.data.Foo;
import dev.andrisul.myspringflower.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class FooApplication {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    /*
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }
    */

//    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(Foo.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        application.setListeners(Collections.singletonList(new AppStartingListener()));
//
//        ConfigurableApplicationContext applicationContext = application.run(args);
//
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }
}
