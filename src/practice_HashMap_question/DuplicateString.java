package practice_HashMap_question;

import java.util.HashMap;

/*
 * Find and display the number of duplicate occurrences of each 
 * task 1> word
 * tast 2> character
 * of String.
 */
public class DuplicateString {
	
	 static void findDuplicateWord(String str) {

		 String[] s = str.split(" ");
		 for (String tempString: s) {
			 //just for debugging.
			System.out.println(tempString);
			 
		 }
	}
	
	public static void main(String[] args) {
		findDuplicateWord("i am am learning java java");
	}

	

}
