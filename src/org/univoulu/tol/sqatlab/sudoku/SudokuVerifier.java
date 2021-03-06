package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SudokuVerifier {
	
	// rule 3: 9 per�kk�in ei saa olla samoja
	// rule 4: joka yhdeks�s ei saa olla samoja
	// rule 2: 3 per�kk�in + 3 per�kk�in + 3 per�kk�in (6 j�� v�liin aina) ei saa olla samoja
	
	//testx

	static boolean hasNegativeValues = false;
	static boolean hasRepeatingValuesInGrid = false;
	static boolean hasRepeatingValuesInRow = false;
	static boolean hasRepeatingValuesInColumn = false;
	static String numbers[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	static Set numbersSet = new HashSet(Arrays.asList(numbers));
	
	public static int verify(String candidateSolution) {
		
		if (candidateSolution.contains("-")){
			hasNegativeValues = true;
		}
		
		//sets the canditateSolution to arraylist and removes the first empty value
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(candidateSolution.split("")));
		myList.remove(0);
		
		
		if (myList.subList(0, 9).containsAll(numbersSet) == true){
			hasRepeatingValuesInRow = true;
		}
		if (myList.subList(9, 18).containsAll(numbersSet) == true){
			hasRepeatingValuesInRow = true;
		}
		if (myList.subList(18, 27).containsAll(numbersSet) == true){
			hasRepeatingValuesInRow = true;
		}
		if (myList.subList(27, 36).containsAll(numbersSet) == true){
			hasRepeatingValuesInRow = true;
		}
		if (myList.subList(36, 45).containsAll(numbersSet) == true){
			hasRepeatingValuesInRow = true;
		}
		if (myList.subList(45, 54).containsAll(numbersSet) == true){
			hasRepeatingValuesInRow = true;
		}
		if (myList.subList(54, 63).containsAll(numbersSet) == true){
			hasRepeatingValuesInRow = true;
		}
		if (myList.subList(63, 72).containsAll(numbersSet) == true){
			hasRepeatingValuesInRow = true;
		}
		if (myList.subList(72, 81).containsAll(numbersSet) == true){
			hasRepeatingValuesInRow = true;
		}
		
		System.out.println(myList);
		System.out.println(myList.subList(0, 9));
		System.out.println(myList.subList(72, 81));
		
		
		
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
