
public class Employee {

	
			int eid;
			String ename;
			int eage;
	
			Employee()
			{
				eid=111;
				ename="kajal";
				eage=21;
			}
			
			Employee(int id , String enm, int age)
			{
				this.eid=id;
				this.ename=ename;
				this.eage=age;
				
			}
			
			void printDetails()
			{
				System.out.println(eid);
				System.out.println(ename);
				System.out.println(eage);
				
			}
			
			
			
			
	
	

}
