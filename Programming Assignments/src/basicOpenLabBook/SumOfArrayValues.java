package basicOpenLabBook;

public class SumOfArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,11,12,13,14};
		int sum=0;
		
		for(int num:arr) {
			sum+=num;
		}
		System.out.println("Sum of an array element is : "+sum);
	}

}
