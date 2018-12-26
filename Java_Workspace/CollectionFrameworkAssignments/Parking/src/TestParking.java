import java.util.*;

public class TestParking {
	
	public static void main(String[] args) {
		
		
		List<Floor> rmall=new ArrayList(3); 
		
		List<Section> floor1List=new ArrayList<Section>(4);
		List<Section> floor2List=new ArrayList<Section>(4);
		List<Section> floor3List=new ArrayList<Section>(4);
		List<Section> floor4List=new ArrayList<Section>(4);

		List<Section> section1List = new ArrayList(20);
		List<Section> section2List = new ArrayList(20);
		List<Section> section3List = new ArrayList(20);
		List<Section> section4List = new ArrayList(20);
		
		Section p1=(new Section(new Parked_CarOwner_Details("Kajal", "Swift", "MH-12 Ak-1418", 546545421, "Pune")));
		Section p2=(new Section(new Parked_CarOwner_Details("Kajal", "Swift", "MH-12 Ak-1418", 546545421, "Pune")));
		Section p3=(new Section(new Parked_CarOwner_Details("Kajal", "Swift", "MH-12 Ak-1418", 546545421, "Pune")));
		Section p4=(new Section(new Parked_CarOwner_Details("Kajal", "Swift", "MH-12 Ak-1418", 546545421, "Pune")));
		Section p5=(new Section(new Parked_CarOwner_Details("Kajal", "Swift", "MH-12 Ak-1418", 546545421, "Pune")));
		section1List.add(p1);
		section1List.add(p2);
		section1List.add(p3);
		section1List.add(p4);
		section1List.add(p5);
		
		/*Section p6=(new Section(new Parked_CarOwner_Details("Kajal", "Swift", "MH-12 Ak-1418", 546545421, "Pune")));
		Section p7=(new Section(new Parked_CarOwner_Details("Kajal", "Swift", "MH-12 Ak-1418", 546545421, "Pune")));
		Section p8=(new Section(new Parked_CarOwner_Details("Kajal", "Swift", "MH-12 Ak-1418", 546545421, "Pune")));
		Section p9=(new Section(new Parked_CarOwner_Details("Kajal", "Swift", "MH-12 Ak-1418", 546545421, "Pune")));
		Section p10=(new Section(new Parked_CarOwner_Details("Kajal", "Swift", "MH-12 Ak-1418", 546545421, "Pune")));
		section2List.add(p6);
		section2List.add(p7);
		section2List.add(p8);
		section2List.add(p9);
		section2List.add(p10);
		
		*/
		
		
		System.out.println(section1List);
		System.out.println("=============================================================\n");
		//System.out.println(section2List);

	}

}
