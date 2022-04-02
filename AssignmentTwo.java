package pack;
import java.util.Scanner;

//Christopher Rogers
//CSCI 2315.01 9/30/2021
//I apologize for the messy code, lots of midterms coming.

public class AssignmentTwo {
	
	public static void main(String [] args) {
		//ugly main method
		String p = "";
		Scanner input = new Scanner(System.in);
		System.out.println("value of n to sum: ");
		int answer = input.nextInt();
		System.out.print(r(answer));
		System.out.println();
		
		System.out.println("number of asterisks to print: ");
		int asterisks = input.nextInt();
		printTriangleUp(asterisks);
		printTriangleDown(asterisks, p);
		input.close();
	}
	public static double r(double n){
		//rational
		double total = 0.0;
		
		if(n == 1)
			//base case
			total += n;
		else 
			//if we have not reached base case
			total += (1/n) + r(n-1);
		return total;
	}
	
	public static String printTriangleUp(int n) {
		
	    if( n <= 0 ) 
	    	return "";

	    String p = printTriangleUp(n-1);
	    p += "*";
	    System.out.println(p);

	    return p;
	 }
	
	public static String printTriangleDown(int n, String p) {
		
		if( n <= 0)
			return "";
		
		p += "*";
		printTriangleDown(n-1, p);
		System.out.println(p);
		
		return p;	
	}
}

