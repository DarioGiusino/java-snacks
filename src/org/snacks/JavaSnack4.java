package org.snacks;

import java.util.Scanner;

public class JavaSnack4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci una stringa...");
		String userString = scanner.nextLine();
		
		scanner.close();
		
		StringBuffer sbr = new StringBuffer(userString);
		
		if(userString.equals("" + sbr.reverse())) {
			System.out.println("parola palindroma");
		} else {
			System.out.println("parola NON palindroma");
		}
		
	}
}
