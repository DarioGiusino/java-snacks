package org.snacks;

import java.util.Scanner;

public class JavaSnack10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci il raggio del cerchio...");
		int radius = sc.nextInt();
		
		sc.close();
		
		double area = radius * radius * 3.14;
		double circumference = 2 * radius * 3.14;
		
		System.out.println("l'area del cerchio è: " + area);
		System.out.println("la circonferenza del cerchio è: " + circumference);
	}
}
