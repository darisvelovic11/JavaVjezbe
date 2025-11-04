package zadaci1;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Napisati program koji na osnovu zadate širine i visine lista papira (pravougaonog oblika)
		u milimetrima određuje njegovu površinu u kvadratnim centimetrima*/
		Scanner sc = new Scanner(System.in);
		double a =sc.nextDouble();
		double b = sc.nextDouble();
		double P = (a*b)/100;
		System.out.printf("%.2f%n", P);
	}

}
