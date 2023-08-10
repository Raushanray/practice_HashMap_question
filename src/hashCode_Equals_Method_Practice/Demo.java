package hashCode_Equals_Method_Practice;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		/*
		 * here the map size is 2, because employee has not implement the hashcode and equals.
		 */
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp1, "jack");
		map.put(emp2, "jack");
		System.out.println(map.size()); //guess it 2
		
		//clue
		/*
		 * here the map size is 1, because Interger has default implementation of the hashcode and equals.
		 *  so when u enter the duplicate simply avoid it..
		 */
		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(i, "one");
		map1.put(i1, "one");
		
		System.out.println(map1.size()); //guess it 1
	}

}
class Employee{
	int id;
	
	public Employee(int id) {
		this.id = id;
	}
	
	
}
