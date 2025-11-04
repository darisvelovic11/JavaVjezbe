package zadaci2;

import java.util.Scanner;

public class Z5v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = (n/1000)%10;
		int b = (n/100)%10;
		int c = (n/10)%10;
		int d = n%10;
		
		int sprat = c;
		System.out.println(sprat);
		
	}

}
