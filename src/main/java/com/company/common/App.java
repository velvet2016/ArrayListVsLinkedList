package com.company.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.customer.services.CustomerService;

import java.util.List;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "Spring-Customer.xml" });

		CustomerService serv = (CustomerService) appContext.getBean("customerServiceProxy");

		int initCapacity =   100000;
		int insertCapacity = 100000;
		List<Integer> arraylist = serv.fillArrayList(initCapacity);
		List<Integer> linkedList = serv.fillLinkedList(initCapacity);
		serv.insertInHead(insertCapacity,arraylist);
		serv.insertInHead(insertCapacity,linkedList);
		serv.insertInTail(insertCapacity,arraylist);
		serv.insertInTail(insertCapacity,linkedList);


	}

	}
