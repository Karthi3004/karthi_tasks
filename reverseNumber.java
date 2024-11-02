package Tasks;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Reverse:");
		int input=sc.nextInt();
		System.out.println("Reversed Number:"+numReverse(input));
	}

	static String numReverse(int input) {
		String str=Integer.toString(input);
		String rev = " ";
		char[] carr = str.toCharArray();
		for (int i = 0; i < str.length(); i++)
			rev = carr[i] + rev;
		return rev;
	}


}
