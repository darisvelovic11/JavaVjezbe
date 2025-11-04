package zadaci2;

import java.util.Scanner;

public class proizvodNeparnih {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		 System.out.print("Unesi cetvorocifreni broj: ");
	        int n = sc.nextInt();

	        int broj = Math.abs(n); // da radi i za negativne brojeve

	        if (broj < 1000 || broj > 9999) {
	            System.out.println("Broj mora biti cetvorocifren.");
	            sc.close();
	            return;
	        }

	        if (broj % 2 == 0) {
	            // Broj je paran → zbir parnih cifara
	            int zbir = 0;
	            int temp = broj;
	            while (temp > 0) {
	                int cifra = temp % 10;
	                if (cifra % 2 == 0) {
	                    zbir += cifra;
	                }
	                temp /= 10;
	            }
	            System.out.println("Zbir parnih cifara: " + zbir);
	        } else {
	            // Broj je neparan → proizvod neparnih cifara
	            int proizvod = 1;
	            boolean imaNeparnih = false;
	            int temp = broj;
	            while (temp > 0) {
	                int cifra = temp % 10;
	                if (cifra % 2 != 0) {
	                    proizvod *= cifra;
	                    imaNeparnih = true;
	                }
	                temp /= 10;
	            }
	            if (imaNeparnih) {
	                System.out.println("Proizvod neparnih cifara: " + proizvod);
	            } else {
	                System.out.println("Nema neparnih cifara, proizvod je 0");
	            }
	        }

	        sc.close();
	    }
	}


	
