package doma;

import java.util.Scanner;

public class ZavjesaProzor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
			System.out.print("Unesite gornju levu X prozora: ");
	        int x1p = sc.nextInt();
	        System.out.print("Unesite gornju levu Y prozora: ");
	        int y1p = sc.nextInt();
	        System.out.print("Unesite donju desnu X prozora: ");
	        int x2p = sc.nextInt();
	        System.out.print("Unesite donju desnu Y prozora: ");
	        int y2p = sc.nextInt();

	        // Koordinate zavjese
	        System.out.print("Unesite gornju levu X zavjese: ");
	        int x1z = sc.nextInt();
	        System.out.print("Unesite gornju levu Y zavjese: ");
	        int y1z = sc.nextInt();
	        System.out.print("Unesite donju desnu X zavjese: ");
	        int x2z = sc.nextInt();
	        System.out.print("Unesite donju desnu Y zavjese: ");
	        int y2z = sc.nextInt();
	        
	        if(x1z<=x1p && y1z>=y1p && x2z>= x2p && y2z<=y2p) {
	        	System.out.println("Prekrice prozor");
	        	
	        }
	        else {
	        	System.out.println("Nece prekriti");
	        }
	}

}
