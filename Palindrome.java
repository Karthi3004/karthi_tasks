package Tasks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 
        System.out.println(isPalindrome(number)); 
        sc.close(); 
    }
    
    static boolean isPalindrome(int input) {
        String inputStr = Integer.toString(input);
        String reversedStr = new StringBuilder(inputStr).reverse().toString();
        return inputStr.equals(reversedStr);
    }
}
