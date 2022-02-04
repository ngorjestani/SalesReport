package edu.wctc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig {
    @Bean
    public SalesInput salesInput() {
        return new TextInput();
    }

    @Bean
    public ShippingPolicy shippingPolicy() {
        return new FlatRateShipping();
    }

    @Bean SalesReport salesReport() {
        return new SalesDetail();
    }
}
