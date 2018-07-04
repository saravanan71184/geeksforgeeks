package com.sarav.arrays.rotation;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayReversal {

	public static void main(String[] args) {
	
		int[] inpuArray = { 1, 2, 3, 4, 5, 6, 7 };
		
		int[] outputArrayRveresed = arrayReversal(inpuArray);

		IntStream intStreamReversed = Arrays.stream(outputArrayRveresed);
		intStreamReversed.forEach((i) -> System.out.print(i + " "));

	}

	public static int[] arrayReversal(int[] inpuArray) {

		int[] resultArray = new int[inpuArray.length];
		for (int i = 0; i < inpuArray.length; i++) {
			resultArray[inpuArray.length - 1 - i] = inpuArray[i];
		}
		
		
		return resultArray;

	}

}
