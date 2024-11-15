package Tasks;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to print the Fcatorial");
	int input=sc.nextInt();
	factorial(input);
}

 static void factorial(int input) {
	 int fact=1;
	for(int i=input;i>=1;i--) {
		 fact=fact*i;
	}
	System.out.println("Factorial of "+input+" is : "+fact);
}
}
