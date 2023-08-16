package basicOpenLabBook;

import java.util.Scanner;

public class PyramidExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int i=0;
		while(i<rows) {
			int j=0;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
		ReversePyramidExample reversePyramid=new ReversePyramidExample();
		reversePyramid.run();
		FloydTriangle floydTriangle= new FloydTriangle();
		floydTriangle.run();

	}

}
 class ReversePyramidExample {

	public void run() {
		// TODO Auto-generated method stub
		int rows=5;
		int i=0;
		while(i<rows) {
			int j=rows-1;
			while(j>i) {
				System.out.print("* ");
				j--;
			}
			System.out.println();
			i++;
		}

	}
}
 class FloydTriangle{
	 public void run() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter no.of rows for Floys's Triangle");
		 int rows= scan.nextInt();
		 scan.close();
		 System.out.println("Floyd's Triangle /n ****************");
		 int counter=1;
		 int i=0;
		 while(i<rows) {
			 int j=0;
			 while(j<=i) {
				 System.out.print(counter+" ");
				 counter++;
				 j++;
			 }
			 System.out.println();
			 i++;
		 }
	 }
 }
