package doma;

import java.util.Scanner;

public class NarcissisticNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int  n=0;
		 
		 System.out.print("Unesi broj: ");
		 if(sc.hasNextInt()) {
			 n = sc.nextInt();
		 }
		 else {
			 System.out.println("Niste unijeli validan broj"); 
		 }
		 
		 int n2 =  n;
		 int brojCifri = String.valueOf(n).length();
		 int suma = 0;
		 
		 while(n2>0) {
			 int cifra = n2%10;
			 suma += Math.pow(cifra,brojCifri);
			 n2 /= 10;
		}
		 if(suma== n) {
			 System.out.println("Da");
		 }
		 else {
			 System.out.println("Ne");
		 }
		 
		 
		 
			 
		 
		 
		 
				
				
		
			
			
			
		}

	}


