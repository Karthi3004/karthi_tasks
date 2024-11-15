package Tasks;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 2, 2, 5, 3, 4};
        int l = arr.length;
        String[] result = dup(arr, l);
        System.out.println(Arrays.toString(result));
    }
    public static String[] dup(int arr[], int l) {
        String[] result = new String[l];
        
        
        boolean[] n = new boolean[l];
        int index = 0;
        
        for (int i = 0; i < l; i++) {
            if (!n[i]) {
            	
            	
                result[index++] = String.valueOf(arr[i]);
                n[i] = true;
                for (int j = i + 1; j < l; j++) {
                    if (arr[i] == arr[j]) {
                        n[j] = true;
                    }
                }
            }
        }

        for (int i = index; i < l; i++) {
            result[i] = "_";
        }

        return result;}
}