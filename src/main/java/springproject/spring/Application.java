package springproject.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Customer customer = (Customer) context.getBean(Customer.class);

		System.out.println("Customer Details:");
		System.out.println("First Name: " + customer.getFirstName());
		System.out.println("Last Name: " + customer.getLastName());
		System.out.println("Email: " + customer.getEmail());
		System.out.println("Phone: " + customer.getPhone());
		System.out.println("Gender: " + customer.getGender());
	}

}
