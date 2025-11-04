package zadaci2;

import java.util.Scanner;

public class petocifreni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = (n/10000)%10;
		int b = (n/1000)%10;
		int c = (n/100)%10;
		int d = (n/10)%10;
		int e = n%10;
		
		int s = d + e;
		System.out.println(s);

}
}
