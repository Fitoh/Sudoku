package org.univoulu.tol.sqatlab.sudoku;
import static java.lang.System.out;

public class SudokuVerifier {
	
	boolean isCorrect = false;
	boolean hasNegativeValues = false;
	boolean hasRepeatingValuesInGrid = false;
	boolean hasRepeatingValuesInRow = false;
	boolean hasRepeatingValuesInColumn = false;
	public int verify(String) {
	
		String[] ary = candidateSolution.split("");
		out.println("print something");
		
		
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
