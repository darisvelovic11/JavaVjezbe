package zadaci2;

import java.util.Scanner;

public class prostBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		int N = sc.nextInt();
		boolean prost = true;
		
		if (N<=1) {
			prost = false;	// DA JE VECI OD 1
			
		}	
		else if(N==2) {		//ISKLJUCUJEMO 2 KAO PARAN BROJ
			prost = true;
		}
		else if(N%2==0) {	//DA NIJE PARAN
			prost = false;	
		}
		else {
			for (int i =3; i <=Math.sqrt(N);i+=2) {
				if (N%i ==0){		//DA NEMA DJELILAC
					prost = false;
					break;
				}
			}
		}
		if (prost) {
			System.out.print("Broj " + N + " je prost");
		}
		else {
			System.out.print("Broj " + N + " nije prost");

		}
		sc.close();
	}

}
