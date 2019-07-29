package com.app.test;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.app.model.Student;

public class Test {
	public static void main(String[] args) {
		List<String> course=new ArrayList<>();
		course.add("Java");
		course.add("PHP");
		course.add("Spring Boot");
		Student s=new Student();
		s.setSid(12);
		s.setSname("Atharva");
		s.setSfee(4562.25);
		s.setCourse(course);
		try {
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(s);
			System.out.println(json);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
