package example.property.mapToProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MapToProperty {

	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<String, String>();

		myMap.put("Key_a", "val_a");
		myMap.put("Key_b", "val_b");
		myMap.put("Key_c", "val_c");

		System.out.println("MAP: " + myMap);

		
		Properties myProperties = new Properties();
		myProperties.putAll(myMap);
		
		System.out.println("Properties: "+myProperties);
		
		myProperties.clear();
		
		System.out.println("Properties after clear: "+myProperties);
		
	}

}
