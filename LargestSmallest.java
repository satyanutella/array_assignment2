package assignment2;

import java.util.Arrays;

public class LargestSmallest {

	public static void main(String[] args) {
		int arr[] = {77, 1, 8, 90, 34, 100, 82, 23, 47, 12};
	      System.out.println("Array = "+Arrays.toString(arr));
	      Arrays.sort(arr);
	      System.out.println("sorted array = "+Arrays.toString(arr));
	      System.out.println("smallest element = "+arr[0]);
	      System.out.println("second smallest element = "+arr[1]);
	      System.out.println("largest element = "+arr[9]);
	      System.out.println("second largest element = "+arr[8]);

	}

}
