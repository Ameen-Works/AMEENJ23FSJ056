package basicClosedLabBook;

import java.util.Arrays;

public class CalculateStudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] header= {"Stu.No", "Tamil", "English", "Maths", "Science", "Social","Moral Science"};
		int[][] marks= {{4101,95,99,96,93,92,91},{4102,95,99,84,93,98,91},{4103,95,75,96,93,88,91},{4104,98,99,96,93,65,91},{4105,77,99,88,67,92,65}};
		
		for(String i:header) {
			System.out.print(i+"  ");
		}
		System.out.println();
		for(int[] i:marks) {
			for(int j:i) {
				System.out.print(j+"      ");
			}
			System.out.println();
		}
		int[] result= result(marks);
		System.out.println("Result of the students: "+Arrays.toString(result));
	}

	public static int[] result(int[][] marks) {
		// TODO Auto-generated method stub
		int[] result=new int[marks.length];
		
		for(int i=0;i<marks.length;i++) {
			int sum=0;
			for(int j=1;j<marks[0].length;j++) {
				sum+=marks[i][j];
				
			}
			result[i]=sum;
//			System.out.println();
		}
		
		
		return result;
	}

	

}
