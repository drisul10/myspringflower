package dev.andrisul.myspringflower;

import dev.andrisul.myspringflower.service.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
