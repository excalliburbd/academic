//02/09/15
//Sk. Imtiaz Ahmed: excalliburbd@gmail.com
//Practice lab tasks before start of semester
//Lab 1: Review of CSE110
// PROBLEM 1) Star Line
// Print as many stars as given in input
// Sample input:
// 6
// Sample output
// ******
import static java.lang.System.*;
import java.util.*;

public class Prob01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(in);

		out.println("Enther a number of stars: ");
		int n = input.nextInt();

		//simple for loop
		for(int i=0; i<n; i++) {

			out.print("*");
		}

		out.println("--------------------------Done----------------------");
	}
	
}