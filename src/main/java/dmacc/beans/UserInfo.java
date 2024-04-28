package dmacc.beans;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Apr 9, 2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class UserInfo {
	
	//instance variables
	private String userName;
	private String phoneNumber;
	private boolean esim;
}