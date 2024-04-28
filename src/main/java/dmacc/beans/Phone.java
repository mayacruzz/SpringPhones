package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Apr 5, 2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Phone {
	
	@Id
	@GeneratedValue
	private long id;
	private String brand;
    private String model;
    private int storageCapacity;
    private String color;
    private double price;
    @Autowired
    private UserInfo userInfo;
    
}