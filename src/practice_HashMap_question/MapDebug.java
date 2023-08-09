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
		/*
		 * String s1 = "FB"; String s2 = "Ea"; System.out.println(s1.hashCode() + " " +
		 * s2.hashCode());
		 */
		
		Map<String, Integer> map = new HashMap<>();
		//HashMap Duplicate Key
		/*
		 * here i have both put have same key so here when i debug this then first get the value 1 and
		 *  when i go with second then the value = 2 simply update the value...because the hashcode is same...
		 */
		map.put("aa", 1);
		map.put("aa", 2);
	}

}
