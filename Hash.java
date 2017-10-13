package map;
//here we cretaed test as map which that organizes a set of related classes and interfaces.
import java.util.HashMap;
import java.util.Map;

public class Hash {

	static Map<String, String> hashmap = new HashMap<>();
	 
	private static void checkIfValueExist(String value) {
		// Let's checkout if Value exist
		String result = hashmap.containsValue(value) ? ("Value (" + value + ") exist")
				: ("Value (" + value + ") doesn't exist");
		log(result);
	}
 
	private static void checkIfKeyExist(String key) {
		// Let's checkout if Key exist
		String result = hashmap.containsKey(key) ? (hashmap.get(key))
				: ("Key (" + key + ") doesn't exist");
		log(result);
		//print result
	}
 
	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		//String[] args is actually an array of java.lang.String type and it's name is args here
//HashMap is a Map based collection class that is used for storing Key & 
//value pairs, it is denoted as HashMap<Key, Value> or HashMap<K, V>.			
		hashmap.put("Google", "Mountain View, CA");
		hashmap.put("Yahoo", "Santa Clara, CA");
		hashmap.put("Microsoft", "Redmond, WA");
 //checks whether the element in list or not
		
		checkIfKeyExist("Google");
		checkIfKeyExist("Facebook");
		checkIfKeyExist("Twitter");
		checkIfKeyExist("Yahoo");
 
		System.out.println("\n");
		checkIfValueExist("Mountain View, CA");
		checkIfValueExist("San Jose, CA");
	}
 
	private static void log(Object object) 
	//prints the object
	{
		System.out.println(object);
		//system : is a class in java language pacakge.
  		//out : static member of the system class.
  		//println : to print what is output.
	   
	}
}

