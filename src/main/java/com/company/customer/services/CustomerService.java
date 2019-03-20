package com.company.customer.services;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerService {


	public List<Integer> fillArrayList(int cap){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < cap; i++) {
			list.add(i);
		}
		return list;
	}
	public List<Integer> fillArrayListNoBoxing(int cap){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < cap; i++) {
			list.add(new Integer(i));
		}
		return list;
	}
	public List<Integer> fillLinkedList(int cap){
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < cap; i++) {
			list.add(i);
		}
		return list;
	}
	public List fillLinkedListNoBoxing(int cap){
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < cap; i++) {
			list.add(new Integer(i));
		}
		return list;
	}

	public List<Integer> insertInHead(int cap, List<Integer> list){
		for (int i = 0; i < cap; i++) {
			list.add(0,i);
		}
		return list;
	}

	public List<Integer> insertInTail(int cap, List<Integer> list){
		for (int i = 0; i < cap; i++) {
			list.add(i);
		}
		return list;
	}

}