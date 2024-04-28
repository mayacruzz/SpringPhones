package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;



import dmacc.beans.Phone;
import dmacc.beans.UserInfo;
import dmacc.contoller.BeanConfiguration;
import dmacc.repository.PhoneRepository;

@SpringBootApplication
public class SpringPhonesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPhonesApplication.class, args);
	}

	/*@Autowired
	PhoneRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
		
		ApplicationContext appContext = new
	AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		
		//Using an existing bean
		Phone p = appContext.getBean("phone", Phone.class);
		p.setBrand("Google");
		repo.save(p);
		
		//Creating a bean to use – not managed by Spring
		Phone b = new Phone("Samsung", "S24 Ultra", 512, "Violet", 1419.99);
		UserInfo u = new UserInfo("Shelby Ramos", "444-543-6655", false);
		b.setUserInfo(u);
		repo.save(b);
		
		List<Phone> allMyPhones = repo.findAll();
		for(Phone people: allMyPhones) {
			System.out.println(people.toString());
		}
			((AbstractApplicationContext) appContext).close();
		}*/
}