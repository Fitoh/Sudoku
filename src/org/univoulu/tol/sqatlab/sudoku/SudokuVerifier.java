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
	static String numbers[] = {"1", "2"};
	static Set numbersSet = new HashSet(Arrays.asList(numbers));
	
	public static int verify(String candidateSolution) {
		
		if (candidateSolution.contains("-")){
			hasNegativeValues = true;
		}
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(candidateSolution.split("")));
		myList.remove(0);
		//if (myList.subList(1, 5).containsAll(numbersSet) == true){
			//System.out.println("TROLOLO");
		//}
		System.out.println(myList);
		System.out.println(myList.subList(0, 1));
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
