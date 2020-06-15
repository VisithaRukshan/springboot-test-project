package com.example.demo;

import org.springframework.stereotype.Component;

/*we can change the component name like this @Component("lap1"). then this class searches by using this name.*/

@Component
//@Component("lap1")
public class Laptop {

	private int lid;
	private String brand;
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	public void compile() {
		System.out.println("Compiling......");
	}
	
	
}
