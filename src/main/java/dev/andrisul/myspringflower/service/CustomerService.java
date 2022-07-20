package dev.andrisul.myspringflower.service;

import dev.andrisul.myspringflower.repository.CategoryRepository;
import dev.andrisul.myspringflower.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    @Qualifier("normalCustomerRepository")
    @Autowired
    private CustomerRepository normalCustomerRepository;

    @Getter
    @Qualifier("premiumCustomerRepository")
    @Autowired
    private CustomerRepository premiumCustomerRepository;
}
