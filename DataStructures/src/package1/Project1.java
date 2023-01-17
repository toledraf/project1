//This file will add any 2 integers that you want and give their sum
package package1;
import java.util.*;

public class Project1 {
	public static void main(String[] args) {
		//Data Fields
		Scanner input = new Scanner (System.in);
		int num1, num2;
		
		//Input
		System.out.println("Input the numbers you want to add: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		//Output
		System.out.printf("Their sum is: %d", num1 + num2);
		
	}

}
