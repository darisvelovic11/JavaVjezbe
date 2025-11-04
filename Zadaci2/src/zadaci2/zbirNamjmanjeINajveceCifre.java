package zadaci2;

import java.util.Scanner;

public class zbirNamjmanjeINajveceCifre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Unesi cijeli broj: ");
        int broj = sc.nextInt();
        int original = broj;
        broj = Math.abs(broj);
        
        int min = 9;
        int max = 0;
        
        while(broj > 0) {
        	int cifra= broj%10;
        	if(cifra < min) min = cifra;
        	if (cifra > max)max = cifra;
        	broj/=10;
        }
        int zbir = min + max;
        System.out.println("Zbir najmanje i najveće cifre broja " + original + " je: " + zbir);
        sc.close();
	}

}
