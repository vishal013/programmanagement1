package learnjava;

import java.util.Scanner;

public class ThrowExample {

	static int age;
	static int weight;
	//static String n;
	
	
	
	static void checkEligibility(int age,int weight) {
		/*Scanner n1= new Scanner(System.in);
				n=n1.next();*/
	if(age<12 && weight<40)
	{
		throw new ArithmeticException("Student is not eligible for registration");
	}
	else {
		System.out.println("Student entry is valid");
	}
	
	}
	
	
public static void main(String[] args) {
		  System.out.println("Welcome to the Registration process!!");
		checkEligibility(10,39);
		
		System.out.println("Have a nice day..!!");
	}

	
public void one() {
	
	try {
		
	} catch (ArithmeticException e) {
		// TODO: handle exception
	}
	
	catch(NullPointerException e) {
		
	}
}
	
	
}
