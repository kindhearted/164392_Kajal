package orderPackage;

import java.util.*;
import java.util.stream.Collectors;

public class TestOrders {

	public static void main(String[] args) {
		
		Order order1=new Order(101, 10000, "Accepted");
		Order order2=new Order(102, 15000, "Completed");		
		Order order3=new Order(103, 20000, "Rejected");		
		Order order4=new Order(104, 12000, "Accepted");		
		Order order5=new Order(105, 19000, "Completed");		
		Order order6=new Order(106, 18000, "Rejected");		
		Order order7=new Order(107, 25000, "Accepted");		
		Order order8=new Order(108, 9000, "Rejected");
		
		
		List<Order> listOrder=new ArrayList();
		listOrder.add(order1);
		listOrder.add(order2);
		listOrder.add(order3);
		listOrder.add(order4);
		listOrder.add(order5);
		listOrder.add(order6);
		listOrder.add(order7);
		listOrder.add(order8);
		
		
		List<Order> listStream=listOrder.stream()
				.filter(o->o.getPrice()>1000)
				.filter(o->o.getStatus()=="Accepted" || o.getStatus()=="Completed")
				.collect(Collectors.toList());
		
		System.out.println(listStream);
				
	}

}
