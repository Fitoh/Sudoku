package org.univoulu.tol.sqatlab.sudoku;
import static java.lang.System.out;

public class SudokuVerifier {
	

	static boolean hasNegativeValues = false;
	static boolean hasRepeatingValuesInGrid = false;
	static boolean hasRepeatingValuesInRow = false;
	static boolean hasRepeatingValuesInColumn = false;
	public static int verify(String candidateSolution) {
		
		if (candidateSolution.contains("-")){
			hasNegativeValues = true;
		}
		if (candidateSolution.contains("-")){

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
		return 0;
	}
}
