package com.krao.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.krao.example2.ShoppingCart;

public class CollectionExample2 {

	private static List<ShoppingCart> scList;

	public static void main(String[] args) {

		System.out.println("This Example shows the functionality of Comparator interface");

		scList = new ArrayList<>();

		scList.add(new ShoppingCart("mouse", 5, 200));
		scList.add(new ShoppingCart("cabinet", 10, 1500));
		scList.add(new ShoppingCart("keyboard", 2, 400));

		Comparator<ShoppingCart> scComparator = new Comparator<ShoppingCart>() {

			@Override
			public int compare(ShoppingCart sc1, ShoppingCart sc2) {

				if(sc1.getPrice() > sc2.getPrice()) 
					return 1;
				else if(sc1.getPrice() < sc2.getPrice())
					return -1;
				else 
					return 0;
			}
		};
		
		System.out.println("****Before Sort****");
		printList();
		Collections.sort(scList, scComparator);
		System.out.println("****After Sort****");
		printList();
	}

	private static void printList() {
		for (ShoppingCart tempSc : scList) {
			System.out.println(tempSc);
		}
	}
}
