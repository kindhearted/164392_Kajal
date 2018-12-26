import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		Map<MyDate, Employee> mapexample = new HashMap<MyDate, Employee>();

		Employee emp1 = new Employee("Kajal");
		Employee emp2 = new Employee("Vaibhavi");
		Employee emp3 = new Employee("Akshay");

		MyDate date1 = new MyDate(16, 05, 1997);
		MyDate date2 = new MyDate(16, 05, 1991);
		MyDate date3 = new MyDate(28, 9, 1995);

		mapexample.put(date1, emp1);
		mapexample.put(date2, emp2);
		mapexample.put(date3, emp3);
	
		
				
		for (Map.Entry<MyDate, Employee> entry : mapexample.entrySet()) {
			MyDate date = entry.getKey();
			Employee employee = entry.getValue();
			System.out.println("Employee Name:" + employee + "  Date Of Birth: " + date);
		}
	}
}