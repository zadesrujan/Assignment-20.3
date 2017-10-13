package map;
//here we cretaed test as map which that organizes a set of related classes and interfaces.
import java.util.HashMap;
import java.util.Iterator;

public class Hashexample {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub

		HashMap<Integer,String> hashmap=new HashMap<Integer,String>(); 
		// Adding values to HashMap as ("keys", "values")

		 hashmap.put(1,"sudha");
		 hashmap.put(2,"priya");
		 hashmap.put(3,"srujan");
		 hashmap.put(4,"uma");
		 hashmap.put(6,"nagaraj");
		//displays the set of hashMap 
		 System.out.println("Friends are:");
		 //creates an object 
			Iterator valueIterator=hashmap.values().iterator();
			while(valueIterator.hasNext())
			{
				System.out.println(valueIterator.next());	
			
			}
			//it will place the values in 
		 hashmap.put(5,"chintu");
		 System.out.println("\nFriends are:");
			Iterator valueIterator1=hashmap.values().iterator();
			while(valueIterator1.hasNext())
			{
				System.out.println(valueIterator1.next());
				//system : is a class in java language pacakge.
		  		//out : static member of the system class.
		  		//println : to print what is output.
			
			}
			
		
		 String val=hashmap.get(4);
		 //tries to get the value 4
		 System.out.println("\nThe value mapped to key 4 is:"+val);
	
		 String val2=hashmap.get(7);
		 //tries to get the value 7
		 System.out.println("\nThe value mapped to key 7 is:"+val2);
		 
		 
		 System.out.println("\nHashMap:");
		 //prints hashmap
		 System.out.println(hashmap);
		 System.out.println("\nclear HashMap:");
		 hashmap.clear();
		 //clears the hash map
		 System.out.println("After clearing hashmap:");
		 System.out.println(hashmap);
		//system : is a class in java language pacakge.
		 //out : static member of the system class.
	  	//println : to print what is output.
	
	
	
	}


	}


