package com.company.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.customer.services.CustomerService;

import java.util.List;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "Spring-Customer.xml" });

		CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");

		int initCapacity =   100000;
		int insertCapacity = 100000;
		List<Integer> arraylist = cust.fillArrayList(initCapacity);
		List<Integer> linkedList = cust.fillLinkedList(initCapacity);
		cust.insertInHead(insertCapacity,arraylist);
		cust.insertInHead(insertCapacity,linkedList);
		cust.insertInTail(insertCapacity,arraylist);
		cust.insertInTail(insertCapacity,linkedList);


	}

	}
