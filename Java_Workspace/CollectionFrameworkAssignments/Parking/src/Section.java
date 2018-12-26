import java.util.*;

public class Section {
	
	Parked_CarOwner_Details p1;
	private static  int token;
	{
		token=++token;
	}
	
	public Section(Parked_CarOwner_Details o) {

		this.p1=o; 
		token=getToken();
				
	}
	
	public int getToken() {
		return token;
	}


	//Section section1=new Section(p1);

	@Override
	public String toString() {
		return "Section [p1=" + p1 +" token No:"+getToken()+ "]";
	}


	
	
	
	
	
	

}
