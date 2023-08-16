package basicClosedLabBook;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,2,1,5};
//		int sortedArray[]=new int[arr.length];
		int temp=0;
		for(int i=0; i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array using For loop: ");
		for (int i:arr) {
			System.out.print(i);
		}
		System.out.println();
		
		Arrays.sort(arr);
		System.out.println("Sorted array using Arrays.sort() method: "+Arrays.toString(arr));

	}

}
