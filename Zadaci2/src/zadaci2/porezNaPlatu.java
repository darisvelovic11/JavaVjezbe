package zadaci2;

import java.util.Scanner;

public class porezNaPlatu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
        System.out.print("Unesi broj zaposlenih: ");
        int N = sc.nextInt();
        double porez=0;
        
        
        
        double sumaPoreza=0;
        for(int i = 1; i<=N;i++) {
        	System.out.print("Unesi platu: ");
            int plata = sc.nextInt();
        	if(plata<= 1000) {
        		 porez = plata * 0.1;
        		
        			
        	}
        	else if(plata>1000) {
        		 porez = plata * 0.2;
        		
        	}
        	sumaPoreza+=porez;
        	
        }
        	System.out.print("Ukupna suma poreza je : " + sumaPoreza);
        
	}

}
