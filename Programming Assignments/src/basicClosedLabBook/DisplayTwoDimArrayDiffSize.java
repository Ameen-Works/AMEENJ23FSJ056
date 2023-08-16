package basicClosedLabBook;

public class DisplayTwoDimArrayDiffSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] twoDarray= {{1},{2,3},{4,5,6},{7,8,9,10}};
		for(int[] i:twoDarray) {
			for(int j:i) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}

}
