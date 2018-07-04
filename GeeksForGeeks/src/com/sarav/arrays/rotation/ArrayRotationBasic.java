package com.sarav.arrays.rotation;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayRotationBasic {

	public static void main(String[] args) {

		int[] inpuArray = { 1, 2, 3, 4, 5, 6, 7 };
		int noOfPlacetoRotate = 3;
		int[] outputArrayRight = arrayRotationRight(inpuArray, noOfPlacetoRotate);

		IntStream intStreamRight = Arrays.stream(outputArrayRight);
		intStreamRight.forEach(i -> System.out.print(i + " "));

		System.out.println("");
		System.out.println("-----------------------");

		int[] outputArrayLeft = arrayRotationLeft(inpuArray, noOfPlacetoRotate);

		IntStream intStreamLeft = Arrays.stream(outputArrayLeft);
		intStreamLeft.forEach((i) -> System.out.print(i + " "));
		
		

	}

	public static int[] arrayRotationRight(int[] inpuArray, int noOfPlacetoRotate) {
		int[] resultArray = new int[inpuArray.length];
		for (int i = 0; i < inpuArray.length; i++) {
			int rotatvar = noOfPlacetoRotate + i;
			if (rotatvar > (inpuArray.length - 1)) {
				rotatvar = rotatvar - (inpuArray.length);
				if (rotatvar < 0) {
					rotatvar = rotatvar * (-1);
				}
			}
		// The above if loop can be replaced with the modulo too.
		// the reminder and the rotatvar - arraylength is the same.
		//	int rotatvar = (i + noOfPlacetoRotate) % inpuArray.length;
			
			resultArray[i] = inpuArray[rotatvar];
		}
		return resultArray;

	}

	public static int[] arrayRotationLeft(int[] inpuArray, int noOfPlacetoRotate) {
		int[] resultArray = new int[inpuArray.length];
		for (int i = 0; i < inpuArray.length; i++) {
		
			int rotatvar = noOfPlacetoRotate + i;
			if (rotatvar > (inpuArray.length - 1)) {
				rotatvar = rotatvar - (inpuArray.length);
				if (rotatvar < 0) {
					rotatvar = rotatvar * (-1);
				}
			}
		
			
			//int rotatvar = (i + noOfPlacetoRotate) % inpuArray.length;
			
			resultArray[rotatvar] = inpuArray[i];
		}
		return resultArray;

	}
	
}
