package com.removingxml.removingcompletexmp_project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dominoz")
public class Pizza 
{
	@Value("cheese and corn")
	private String pname;
	@Value("100.00")
	private double price;
	
   public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

public void deliver()
   {
	   System.out.println("pizza delivered");
   }

@Override
public String toString() {
	return "Pizza [pname=" + pname + ", price=" + price + "]";
}

}
