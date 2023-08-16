package basicOpenLabBook;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[3];
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the elements :");
		for (int input=0; input<arr.length;input++) {
			arr[input]=scan.nextInt();
		}
		scan.close();
		for (int element:arr) {
			sum+=element;
		}
		System.out.println("Sum of an array element is : "+sum);
	}

}
