import java.io.*;
import java.util.*;

public class isUnique {

public static void main(String[] args) {



Map<String, String> name1Map = new TreeMap<String,String>();
boolean isTrue;

name1Map.put("Marty", "Stepp");
name1Map.put("Stuart", "Reges");
name1Map.put( "Jessica", "Miller");
name1Map.put("Amanda","Camp");
name1Map.put("Hal", "Perkins");

isTrue = Unique(name1Map);
System.out.println(isTrue + ":"+ name1Map);

Map<String, String> name2Map = new TreeMap<>();
name2Map.put("Kendrick", "Perkins");
name2Map.put("Stuart", "Reges");
name2Map.put( "Jessica", "Miller");
name2Map.put("Bruce","Reges");
name2Map.put("Hal", "Perkins");

isTrue=Unique(name2Map);
System.out.println((isTrue + ":" + name2Map));

	}

	private static boolean Unique(Map <String, String> name2Map) {
		
		Set<String>valueSet=new HashSet<String>();
		for(String value:name2Map.keySet())
		{
			String key = name2Map.get(value);
			valueSet.add(key);
		}
		return valueSet.size() == name2Map.size();
	}


}


