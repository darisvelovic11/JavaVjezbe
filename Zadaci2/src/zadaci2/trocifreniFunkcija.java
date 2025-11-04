package zadaci2;

import java.util.Scanner;

public class trocifreniFunkcija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = (n/10)%10;
		int b = n%10;
		if(a>b) {
			System.out.println(a-b);
			
		}
		else if(a<b) {
			System.out.println(a+b);
			
		}
		else {
			System.out.println(a*b);
		}
	}

}
