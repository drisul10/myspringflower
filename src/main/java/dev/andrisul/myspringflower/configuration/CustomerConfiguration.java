package dev.andrisul.myspringflower.configuration;

import dev.andrisul.myspringflower.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CustomerConfiguration {

    @Primary
    @Bean
    CustomerRepository normalCustomerRepository() {
        return new CustomerRepository();
    }

    @Bean
    CustomerRepository premiumCustomerRepository() {
        return new CustomerRepository();
    }
}
