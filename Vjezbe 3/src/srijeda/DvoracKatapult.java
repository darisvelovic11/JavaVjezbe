package srijeda;

import java.util.Scanner;

public class DvoracKatapult {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Unesi  broj neprijateljskih katakuplta: ");

		int N = sc.nextInt();
		long D = sc.nextLong();
		long HD = sc.nextLong();
		long KA = sc.nextLong();
		int brojPrijetnji = 0;
		
		for(int i = 0; i<=N;i++) {
			
			long x = sc.nextLong();
			long y = sc.nextLong();
			
			long menheten = Math.abs(x) + Math.abs(y) ;
			
			if(menheten<=D) {
				
				brojPrijetnji++;
			}

			
			
		}
		long totalDamage = brojPrijetnji * KA;
		
		System.out.printf("Nas dvorac ukupno ugrozava:%d ",brojPrijetnji);
		if (totalDamage>HD) {
			System.out.printf("Nas dvorac je srusen , ukupan dmg je %d", totalDamage);

		}
		else {
		System.out.printf("Dvorac nije srusen , ukupan dug je %d", totalDamage);

		}
	}
}
	

	


