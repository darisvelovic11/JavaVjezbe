package zadaci2;

import java.util.Scanner;

public class Z19v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if(b >= 2 * a) {
			
			System.out.println("Moze.");
		}
		else {
			System.out.println("Ne");
		}

	}

}
