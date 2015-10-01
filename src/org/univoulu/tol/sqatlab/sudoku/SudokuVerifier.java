package org.univoulu.tol.sqatlab.sudoku;
import static java.lang.System.out;

public class SudokuVerifier {
	
	static boolean isCorrect = false;
	static boolean hasNegativeValues = false;
	static boolean hasRepeatingValuesInGrid = false;
	static boolean hasRepeatingValuesInRow = false;
	static boolean hasRepeatingValuesInColumn = false;
	public static int verify(String candidateSolution) {
		
		candidateSolution.equals(2);
		
		
		
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
