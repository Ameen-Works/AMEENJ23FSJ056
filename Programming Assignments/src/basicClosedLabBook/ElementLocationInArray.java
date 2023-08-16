package basicClosedLabBook;

import java.util.Arrays;
import java.util.Scanner;

public class ElementLocationInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,6,7,8,4,5,3,2,1};
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter any number between 1 to 9 to find the location of the number in the array :");
		int n=scan.nextInt();
		scan.close();
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				index=i;
			}
		}
		
		System.out.println("For Loop: The location/index of \""+n+"\" is "+index);
		System.out.println("Binary Search: The location/index of \""+n+"\" is "+Arrays.binarySearch(arr, n));
	}

}
