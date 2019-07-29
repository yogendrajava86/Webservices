package com.app.test;

import org.codehaus.jackson.map.ObjectMapper;

import com.app.model.Product;

public class Test {

	public static void main(String[] args) {
		Product p=new Product();
		p.setProdId(10);
		p.setProdCode("Laptop");
		p.setProdCost(198700.50);
		p.setProdSceret("secret#wer$rgndf");
		try {
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(p);
			System.out.println(json);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
