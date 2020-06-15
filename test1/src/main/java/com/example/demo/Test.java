package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
//@component term converts this part into spring bean and enables singelton method (object in the spring container) 

//@Scope(value = "prototype")
/*@Scope(value = "prototype") in here like not @component we should always call the object in the main class 
to create an object. so that if we use this there is no bean in the spring container.*/

public class Test {
	
	private int aid;
	private String aname;
	private String tech;
	
	
	/*when use @Autowired keyword test class getting instance form the laptop class.
	(making connection between test class and laptop class.) it searches by type*/
	
	/*when use @Qualifier("lap1") it searches by lap1 name. it should be the the class name or component name
	 * of the laptop class*/
	
	@Autowired
//	@Qualifier("lap1")
	private Laptop laptop;
	
	
	public Test() {
		super();
		System.out.println("Object created..");
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	//laptop
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	
	public void show() {
		System.out.println("In the test class");
		laptop.compile();
	}

}
