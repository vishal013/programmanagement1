package learnjava;

import java.util.HashSet;
import java.util.Set;

public class FindduplicateusingSet {
	
	public static void main(String[] args) {
		
		int[] a= {1,5,3,6,3,9,1,6,9,4};

	Set<Integer> s= new HashSet<>();
	System.out.println(s);
	for(int no:a) {
		if(s.add(no)==false) {
			System.out.print(no+" ");
		}
	}
	}

}
