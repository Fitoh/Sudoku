package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void test() {
		String Solution = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
		int testResult;
		testResult = SudokuVerifier.verify(Solution);
		System.out.println(testResult);
	}

}
