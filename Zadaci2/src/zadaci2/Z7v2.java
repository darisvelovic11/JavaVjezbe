package zadaci2;

import java.util.Scanner;

public class Z7v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int b = (n/100)%10;
		int c = (n/10)%10;
		int d = n%10;
		
		int a =b;
		 b = d;
		 d = a;
		 
		 System.out.printf("%d%d%d",b,c,d);
		

	}

}
