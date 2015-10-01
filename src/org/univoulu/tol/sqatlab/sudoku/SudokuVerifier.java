package org.univoulu.tol.sqatlab.sudoku;
import static java.lang.System.out;

public class SudokuVerifier {
	
	static boolean isCorrect = false;
	static boolean hasNegativeValues = false;
	static boolean hasRepeatingValuesInGrid = false;
	static boolean hasRepeatingValuesInRow = false;
	static boolean hasRepeatingValuesInColumn = false;
	public static int verify(String candidateSolution) {
		
		if (candidateSolution.equals("123456789912345678891234567789123456678912345567891234456789123345678912234567891")){
			System.out.println("TROLOLOLOLOO");
		}
		
		
		
		if (isCorrect == true){
			return 0;
		}
		
		if (hasNegativeValues == true){
			return -1;
		}
		
		if (hasRepeatingValuesInGrid == true){
			return -2;
		}
		
		if (hasRepeatingValuesInRow == true){
			return -3;
		}
		
		if (hasRepeatingValuesInColumn == true){
			return -4;
		}
		return 1; //something went wrong
	}
}
