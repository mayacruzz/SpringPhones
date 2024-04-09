package dmacc.contoller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Phone;
import dmacc.beans.UserInfo;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Apr 8, 2024
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Phone phone() {
	Phone bean = new Phone();
	bean.setBrand("Google");
	bean.setModel("Pixel 8");
	bean.setStorageCapacity(128);
	bean.setColor("Mint");
	bean.setPrice(699);
	return bean;
	}
	
	@Bean
	public UserInfo userInfo() {
	UserInfo bean = new UserInfo("Jeff Scott", "555-234-3344", true);
	return bean;
	}
	
	/*
	@Bean
	public Phone phone() {
	Phone bean = new Phone( );
	return bean;
	}*/

}
