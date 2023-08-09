package practice_HashMap_question;

import java.util.HashMap;

public class App1 {

	public static void main(String[] args) {
		
		FackStudentMutable studentutableObj = new FackStudentMutable("Raushan");
		
		Student studentImmutableObj = studentutableObj;
		
		HashMap<Student, String> map = new HashMap<>();
		
		map.put(studentImmutableObj, "India");
		
		studentutableObj.setFakeStudentName("Ravi");
		
		System.out.println(map.get(studentImmutableObj));
	}
}
