package zadaci2;

import java.util.Scanner;

public class kaznaZaBrzinu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
        System.out.print("Unesi broj vozača: ");
        int N = sc.nextInt();
		
		int ukupnaKazna = 0;
		
		for(int i = 1; i<=N;i++) {
			System.out.print("Unesi brzinu vozača " + i + ": ");
            int brzina = sc.nextInt();
            if(brzina > 50) {
            	int kazna = (brzina - 50)*10;
            	ukupnaKazna += kazna;
            }
			
		}
		System.out.println("Ukupna suma kazni je: " + ukupnaKazna + "€");

        sc.close();
	}

}
