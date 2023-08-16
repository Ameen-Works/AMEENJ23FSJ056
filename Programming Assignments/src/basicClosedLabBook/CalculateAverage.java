package basicClosedLabBook;

import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of values");
		int n=scan.nextInt();
		
		int[] input= new int[n];
		System.out.println("Enter the values to find average: ");
		for(int i=0; i<n;i++) {
			input[i]=scan.nextInt();
		}
		scan.close();
		
		int average=average(input);
		System.out.print("The average of [");
		for(int i:input) {
			System.out.print(" "+i);
		}
		System.out.print("] is: "+average);
	}
	

	public static int average(int[] input) {
		// TODO Auto-generated method stub
		int avg=0;
		int sum=0;
		for(int i: input) {
			sum+=i;
		}
		avg=sum/input.length;
		
		return avg;
	}

}
