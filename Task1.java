package Tasks;

import java.util.Arrays;

public class Task1 {
	public static void main(String[] args) {
		int[] arr= {0,23,1,0,6,0,25};
		
		System.out.println(Arrays.toString(task1(arr)));
		
	}
	static int[] task1(int[] arr) {
		int last=0;

		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]!=0) {
				arr[last]=arr[i];
				last++;
				
				
			}
			
		}
		for(int i=last;i<arr.length;i++) {
			arr[i]= 0;
		}
		
		
		return arr;
		
	}
}
