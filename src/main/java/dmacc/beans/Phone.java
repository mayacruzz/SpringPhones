package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Apr 5, 2024
 */
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
    
	public Phone() {
		super();
		this.brand = "Apple";
	}

	public Phone(String brand) {
		super();
		this.brand = brand;
	}

	public Phone(String brand, String model, int storageCapacity, String color, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.storageCapacity = storageCapacity;
		this.color = color;
		this.price = price;
	}

	public Phone(long id, String brand, String model, int storageCapacity, String color, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.storageCapacity = storageCapacity;
		this.color = color;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", model=" + model + ", storageCapacity=" + storageCapacity
				+ ", color=" + color + ", price=" + price + ", userInfo=" + userInfo + "]";
	}
    
}
