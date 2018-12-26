
public class Employee {
	
	private String name;
	
	public Employee(String name)
	{
		this.name=name;
	}

	@Override
	public String toString() {
		return name;
	}

	public boolean after(Employee employee) {
		return false;
	}

}
