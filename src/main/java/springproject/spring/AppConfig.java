package springproject.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springproject.spring")
public class AppConfig {

    @Bean
    public Customer customer() {
        Customer customer = new Customer();
        customer.setFirstName("Shivam");
        customer.setLastName("Bisht");
        customer.setEmail("Shivam12b@gmail.com");
        customer.setPhone("9354159886");
        customer.setGender("Male");
        return customer;
    }
}