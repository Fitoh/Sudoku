package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {
	
	boolean isCorrect = false;
	boolean hasNegativeValues = false;
	boolean hasRepeatingValuesInGrid = false;
	boolean hasRepeatingValuesInRow = false;
	boolean hasRepeatingValuesInColumn = false;
	public int verify(String candidateSolution) {
	
		
		
		if (isCorrect == true){
			returnValue = 0;
			return 0;
		}
		
		if (hasNegativeValues == true){
			returnValue = -1;
			return -1;
		}
		
		if (hasRepeatingValuesInGrid == true){
			returnValue = -2;
			return returnValue;
		}
		
		if (hasRepeatingValuesInRow == true){
			returnValue = -3;
			return returnValue;
		}
		
		if (hasRepeatingValuesInColumn == true){
			returnValue = -4;
			return returnValue;
		}
		return 0;
	}
}
