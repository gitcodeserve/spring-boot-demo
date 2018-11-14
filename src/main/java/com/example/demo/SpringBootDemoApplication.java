package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDemoApplication {
	static List<Employee> empList = new ArrayList<>();
	
	static{
		Employee employee1 = new Employee(101, "XYZ", new Date(1981, 9, 9).toString());empList.add(employee1);
		Employee employee2 = new Employee(102, "PQR", new Date(1981, 9, 9).toString());empList.add(employee2);
		Employee employee3 = new Employee(103, "ABC", new Date(1981, 9, 9).toString());empList.add(employee3);
		Employee employee4 = new Employee(104, "LMN", new Date(1981, 9, 9).toString());empList.add(employee4);
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
	@RequestMapping("/hello")
	 @ResponseBody
     String hello(@RequestParam("name") String name){
		System.out.println("Hello from the sts ..." + name);
             return "Hello  " + name;
     } 
	
	@RequestMapping("/pathparam/{name}")
	 @ResponseBody
    String hi(@PathVariable("name") String name){
		System.out.println("path param ..." + name);
            return "Hello  " + name;
    } 
	
	
	@RequestMapping(value="/emp", method = RequestMethod.GET)
	List<Employee> empDetails() {
		return empList;
	}
}
