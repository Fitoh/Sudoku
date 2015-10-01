package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SudokuVerifier {
	

	static boolean hasNegativeValues = false;
	static boolean hasRepeatingValuesInGrid = false;
	static boolean hasRepeatingValuesInRow = false;
	static boolean hasRepeatingValuesInColumn = false;
	String numbers[] = {"1", "2"};
	Set numbersSet = new HashSet(Arrays.asList(numbers));
	
	public static int verify(String candidateSolution) {
		
		if (candidateSolution.contains("-")){
			hasNegativeValues = true;
		}
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(candidateSolution.split(",")));
		
		if (myList.subList(0, 2).containsAll(numbersSet) == true){
			
		}
		//System.out.println(myList[1]); 
		
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
