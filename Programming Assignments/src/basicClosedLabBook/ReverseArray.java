package basicClosedLabBook;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,6};
		System.out.println("array= "+Arrays.toString(arr));
		int reverseArray[]=new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			reverseArray[i]=arr[arr.length-i-1];
		}
		System.out.println("Reversed Array= "+Arrays.toString(reverseArray));

	}

}
