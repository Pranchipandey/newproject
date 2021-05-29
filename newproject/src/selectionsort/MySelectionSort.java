package selectionsort;

import java.util.Arrays;

public class MySelectionSort {
	public static void main(String[] args) {
		int arr[]= {12,8,16,5,2};
		MySelectionSort obj = new MySelectionSort();
		System.out.println("unsorted--->" + Arrays.toString(arr));
		obj.selectionSort(arr);
		System.out.println("sorted--->" + Arrays.toString(arr));
	}
	public void selectionSort(int[] arr) {
		int sortedIndex=arr.length;
		int maximumElement;
		int maximumElementIndex;
		
		for(int i = 0; i<arr.length; i++) {
			
			maximumElement = arr[0];
			maximumElementIndex = 0;
			
			for(int j=0; j<sortedIndex; j++) {
				if(maximumElement<arr[j]) {
					maximumElement = arr[j];
					maximumElementIndex = j;
				}
			}
			int temp = arr[maximumElementIndex];
			--sortedIndex;
			arr[maximumElementIndex] = arr[sortedIndex];
			arr[sortedIndex] = temp;
		}
	}

}
