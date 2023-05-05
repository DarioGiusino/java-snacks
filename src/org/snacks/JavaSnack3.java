package org.snacks;

public class JavaSnack3 {
	public static void main(String[] args) {
		int[] numArray = {1, 2, 3, 4, 5};
		
		int sum = 0;
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] % 2 != 0) {				
				sum += numArray[i];
			}
		}
		
		System.out.println("la somma è: " + sum);
	}
}
