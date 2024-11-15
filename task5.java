package Tasks;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int[] arr = {3,9};             
        task5(arr);
    }

    static void task5(int[] arr) {
    	

        StringBuilder strBuilder = new StringBuilder();
        for (int num : arr) {
            strBuilder.append(num);
        }
        System.out.println(strBuilder);

        int value = Integer.parseInt(strBuilder.toString());
        int result = value + 1;
        String strResult = Integer.toString(result);

        char[] output = strResult.toCharArray();
        System.out.println(Arrays.toString(output)); 
    }
}
