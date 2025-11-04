package zadaci2;

import java.util.Scanner;

public class prosjekPopust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
        System.out.print("Unesi iznos skolarine: ");
        double skolarina = sc.nextDouble();
        
        System.out.print("Unesi prosjek: ");
        double prosjek = sc.nextDouble();
        
        System.out.print("Da li imas osvojenu nagradi? (DA = 1 , NE = 0): ");
        double nagrada = sc.nextDouble();
        
        double popustProsjek = 0;
        if(prosjek>=4.5) {
        	 popustProsjek = 40;
        }
        else if(prosjek >=3.5) {
        	 popustProsjek = 20;
        }
        else if(prosjek <=2.5) {
        	 popustProsjek = 10;
        }
        
        
        double popustNagrada=(nagrada==1)?30:0;
        
        double popust = Math.max(popustProsjek, popustNagrada);
        
        double saPopustom = skolarina *(1-popust/100);
        
        double rezultat = Math.round(saPopustom);
        System.out.println(rezultat);

        
        sc.close();
        


	}

}
