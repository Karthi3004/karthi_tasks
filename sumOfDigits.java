package Tasks;

import java.lang.reflect.Array;
import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find sum of digits:");
		int input = sc.nextInt();
		System.out.println("Sum of Digits is: "+sumOfDigits(input));

	}

	static int sumOfDigits(int input) {
		int sum = 0;
		String st = Integer.toString(input);
		for (char ch : st.toCharArray())
			sum += Character.getNumericValue(ch);
		return sum;
	}

}
