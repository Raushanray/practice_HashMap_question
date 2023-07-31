package practice_HashMap_question;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		
		
		  /*HashMap<String, String> map = new HashMap<>(); map.put("Raushan", "India");
		  System.out.println(map.get("Raushan"));
		 */
		
		
		  HashMap<Student, String> map = new HashMap<>();
		  
		  Student student = new Student("Raushan");
		  
		  map.put(student, "India");
		 
		  System.out.println(map.get(student)); 

		
		
	}
}
