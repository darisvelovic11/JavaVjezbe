package zadaci1;

import java.util.Scanner;

public class Z6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Napisati program koji računa kvadrat trinoma(a, b, c) koja za unijete parametre a, b i c
računa kvadrat trinoma za unešene parametre. Formula: 𝑎^2 + 𝑏^2 + 𝑐^2 + 2𝑎𝑏 + 2𝑎𝑐 +
2𝑏c.*/
		
			Scanner sc = new Scanner(System.in);
			double a = sc.nextDouble(), b = sc.nextDouble();
			double c = sc.nextDouble();
			double rez = a*a + b*b + c*c + 2*a*b + 2*a*c + 2*b*c;
			System.out.printf("%.2f%n", rez);
	}

}
