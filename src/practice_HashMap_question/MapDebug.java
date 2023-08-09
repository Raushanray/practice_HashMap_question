package practice_HashMap_question;

import java.util.HashMap;
import java.util.Map;
/*
 * HashMap internally work.
 */

public class MapDebug {
	public static void main(String[] args) {
		/*
		 * hashcode collision because both s1 and s2 have same hashcode..
		 */
		String s1 = "FB";
		String s2 = "Ea";
		System.out.println(s1.hashCode() + " " + s2.hashCode());
		
		Map<String, Integer> map = new HashMap<>();
		map.put(s1, 1);
		map.put(s2, 2);
	}

}
