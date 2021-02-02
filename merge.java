package assignment2;

import java.util.Arrays;

public class merge {

	public static void main(String[] args) {
		
		int a[] = {2,5,8,9};        
		int b[] = {15,3,7,12};   
		int alength = a.length;          
		int blength = b.length;     
		int[] result = new int[alength + blength];    
		System.arraycopy(a, 0, result, 0, alength);  
		System.arraycopy(b, 0, result, alength, blength);  
		System.out.println(Arrays.toString(result));

	}

}
