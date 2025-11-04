package zadaci1;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Napisati program koji računa površinu i obim pravougaonika na osnovu zadatih
		dimenzija.*/
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble();
		double P = a*b ;double O = 2*(a + b);
		System.out.printf("Povrsina je: %.2f, a obim je: %.2f", P , O);
		sc.close();
		



	}

}
