package practice_HashMap_question;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		
		
		  /*HashMap<String, String> map = new HashMap<>(); map.put("Raushan", "India");
		  System.out.println(map.get("Raushan"));
		 */
		
		
		/*
		 * HashMap<Student, String> map = new HashMap<>();
		 * 
		 * Student student = new Student("Raushan");
		 * 
		 * map.put(student, "India");
		 * 
		 * // now creating one more object of student. Student student2 = new
		 * Student("Ravi"); map.put(student2, "India,Delhi");
		 * 
		 * System.out.println(map.get(student)); System.out.println(map.get(student2));
		 */
		
		//now delete newly createa object "Ravi"
		
				HashMap<Student, String> map = new HashMap<>();

				Student student = new Student("Raushan");

				map.put(student, "India");
				
				System.out.println(map.get(student));
				System.out.println("******************");
		
		//Now delete the newly created object and setName of old object and  the hapshmap is giving null..  but aspect correct output
		
	}
}
