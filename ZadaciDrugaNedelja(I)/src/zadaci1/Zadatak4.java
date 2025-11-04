package zadaci1;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Sportista se na početku treninga zagrijeva tako što trči po ivicama pravougaonog terena
		dužine d i širine s. Napisati program kojim se određuje koliko metara pretrči sportista
		dok obiđe teren 4 puta.*/
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		double s = sc.nextDouble();
		double obim = 2*(d + s);
		System.out.printf("%.2f metara \n ", 4 * obim);
	}

}
