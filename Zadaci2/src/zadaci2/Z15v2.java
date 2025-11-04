package zadaci2;

import java.util.Scanner;

public class Z15v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int n = sc.nextInt();
		int rezultat = 1;
		
		for(int i = 1; i<=n;i++) {
			rezultat*=X;
		}
		System.out.print(rezultat);
		
		

	}

}
