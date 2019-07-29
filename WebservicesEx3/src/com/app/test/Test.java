package com.app.test;

import org.codehaus.jackson.map.ObjectMapper;

import com.app.model.Address;
import com.app.model.Customer;

public class Test {

	public static void main(String[] args) {
		
		Address ad=new Address("45A","Dilshuk Nagar","Hyderabad","Telangana","India","540008");
		
		Customer cs=new Customer();
		cs.setCid(14);
		cs.setCname("Yogendra Dixit");
		cs.setMobile("8826400522");
		cs.setAddr(ad);
		try {
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(cs);
			System.out.println(json);
			
			Customer c2=om.readValue(json , Customer.class);
			System.out.println("==========================================");
			System.out.println(c2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
