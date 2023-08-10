package practice_HashMap_question;

import java.util.HashMap;
import java.util.Iterator;

/*
 * Find and display the number of duplicate occurrences of each 
 * task 1> word
 * tast 2> character
 * of String.
 */
public class DuplicateString {
	
	 static void findDuplicateWord(String str) {

		 HashMap<String, Integer> hm = new HashMap<>();
		 String[] s = str.split(" ");
		 for (String tempString: s) {
			 //just for debugging.
//			System.out.println(tempString);
			 if (hm.get(tempString) != null) {
				 hm.put(tempString, hm.get(tempString) + 1);
			}else
			{
			hm.put(tempString, 1);
			}
		 
	}
//	 System.out.println(hm);
		 Iterator<String> tempString = hm.keySet().iterator();
		 while(tempString.hasNext())
		 {
			 String temp = tempString.next();
			 if (hm.get(temp) > 1) {
				System.out.println("The Word \""+ temp + "\" appred "+ hm.get(temp) + " no of times" );
			}
		 }
		 System.out.println("============================================================");
	}
	
	 
	  static void findDuplicateCharacters(String str) {
			HashMap<Character, Integer> hm = new HashMap<>();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (hm.get(c) != null) {
					hm.put(c, hm.get(c)+1);
				}else
				{
					hm.put(c, 1);
				}
			}
//			System.out.println(hm);
			 Iterator<Character> charString = hm.keySet().iterator();
			 while(charString.hasNext())
			 {
				 Character temp = charString.next();
				 if (hm.get(temp) > 1) {
					System.out.println("The Character \""+ temp + "\" appred "+ hm.get(temp) + " no of times" );
				}
			 }
		}
	 
	public static void main(String[] args) {
		findDuplicateWord("i am am learning java java");
		findDuplicateCharacters("javaj2ee");
	}

}
