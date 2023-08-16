package basicClosedLabBook;

public class CmdLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To access command line arguments we can provide the value as
		//(Eclipse) Run Configuration->Main(Check the package and main)-> Arguments-> Program Arguments(eg: 1 2 ABC Arshath %%$$)
		for(String i:args) {
			System.out.print(i+" ");
		}
	}

}
