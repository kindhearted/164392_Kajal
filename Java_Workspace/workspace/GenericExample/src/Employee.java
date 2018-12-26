
public class Employee {
	int eid;
	String name;
	
	public Employee(int eid,String name) {
		
		this.eid=eid;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
