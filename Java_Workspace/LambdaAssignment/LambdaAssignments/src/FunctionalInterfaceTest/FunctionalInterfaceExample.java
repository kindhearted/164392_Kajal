package FunctionalInterfaceTest;


import java.util.function.Consumer;

import orderPackage.Order;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		Consumer<Order> updatePrice= o->o.getPrice();
		System.out.println(updatePrice);
	}

}
