package com.krao.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample1 {

	private static List<ShoppingCart> scList;

	public static void main(String[] args) {

		System.out.println("This Example shows the functionality of Comparable interface");
		
		scList = new ArrayList<>();
		
		scList.add(new ShoppingCart("mouse" ,5,200));
		scList.add(new ShoppingCart("cabinet" ,10,1500));
		scList.add(new ShoppingCart("keyboard",2,400));

		System.out.println("****Before Sort****");
		printList();
		Collections.sort(scList);
		System.out.println("****After Sort****");
		printList();
	}

	private static void printList() {
		for(ShoppingCart tempSc : scList ) {
			System.out.println(tempSc);	
		}
	}
}
