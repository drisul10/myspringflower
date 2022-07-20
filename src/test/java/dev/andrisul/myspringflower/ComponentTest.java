package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.data.MultiFoo;
import dev.andrisul.myspringflower.repository.CategoryRepository;
import dev.andrisul.myspringflower.repository.CustomerRepository;
import dev.andrisul.myspringflower.repository.ProductRepository;
import dev.andrisul.myspringflower.service.CategoryService;
import dev.andrisul.myspringflower.service.CustomerService;
import dev.andrisul.myspringflower.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void seUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testProductService() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDependencyInjection() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void testSetterDependencyInjection() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    @Test
    void testFieldDependencyInjection() {
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository", CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository", CustomerRepository.class);

        Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
    }

    @Test
    void testObjectProvider() {
        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);

        Assertions.assertEquals(3, multiFoo.getFoos().size());
    }
}
