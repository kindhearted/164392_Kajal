package mapFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFunctionConcate {
	
	public static void main(String[] args) {
		
			Map<String,String> mapExample=new HashMap();
			
				mapExample.put("FirstName", "kajal");
				mapExample.put("LastName", "Kurhade");
				mapExample.put("Age", "21");
				mapExample.put("Education", "BE");
				
					
				
		
			/*mapExample.entrySet().stream()
			.map(entry->entry.getKey().concat(entry.getValue()))
		      .collect(Collectors.toList());
				System.out.println(mapExample);*/
				
				mapExample.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue, (a,b) -> a, HashMap::new));
				
				System.out.println(mapExample);
	}

}
