package zadaci2;

import java.util.Scanner;

public class Z8v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int x3 = (x1+x2)/2;
		int y3 = (y1 + y2)/2;
		
		double d = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3-y1, 2));
		System.out.println(d);
		
	




	}

}
