package zadaci1;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Napisati program koji koristi tri varijable a, b i c, a računa vrijednosti x1 i x2 kvadratne
		jednacine ax^2 + bx + c = 0. Ignorisati slučaj negativnih vrijednosti ispod korijena
		(kompleksni brojevi).*/
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble(), b = sc.nextDouble();
		double c = sc.nextDouble();
		double D = b*b - 4*a*c;
		double x1 = (-b + Math.sqrt(D)) / (2*a);
		double x2 = (-b - Math.sqrt(D)) / (2*a);
		System.out.printf("x1=%.6f x2=%.6f%n", x1, x2);



	}

}
