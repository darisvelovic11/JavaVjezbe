package zadaci2;

import java.util.Scanner;

public class povrsinaZbirKruga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double r1 = sc.nextDouble();
		double r2 = sc.nextDouble();
		
		double p1 = r1 * r1 * Math.PI;
		double p2 = r2 * r2 * Math.PI;
		
		if(p1>p2) {
			double o = 2 * r1 * Math.PI;
			System.out.print(o);
		}
		else {
			double o = 2 * r2 * Math.PI;
			System.out.print(o);
		}
	}

}
