package bubblesort;

import java.util.Arrays;

public class MyBubbleSort {
	public static void main(String[] args) {
		int[] arr = {15,20,5,8,10};
		MyBubbleSort obj = new MyBubbleSort();
		System.out.println("Sorted array");
		obj.bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	public void bubbleSort(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;

					}
			
				
			}
			
		
	}
	}
}


