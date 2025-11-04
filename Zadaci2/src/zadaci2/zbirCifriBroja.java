package zadaci2;

import java.util.Scanner;

public class zbirCifriBroja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		 System.out.print("Unesi  broj: ");
	        int n = sc.nextInt();
	        
	        int zbir = 0;
	        int temp = n;
	        
	        while(temp>0) {
	        	int cifra = temp%10;
	        	zbir+=cifra;
	        	temp/=10;
	        	
	        }
	        
	        System.out.print(zbir);
	        sc.close();
	        
	}

}
