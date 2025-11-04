package zadaci2;

import java.util.Scanner;

public class stubovi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
        System.out.print("Unesi duzinu terase (u metrima): ");
        double d = sc.nextDouble();
        
        System.out.print("Unesi broj stubica: ");
        double n = sc.nextDouble();
        
        System.out.print("Unesi sirinu stubica (u cm): ");
        double s = sc.nextDouble();
        
        double duzinaCm = d*100;
        
        double r = (duzinaCm - n*s)/(n+1); 

        System.out.printf("Rastojanje izmedju stubica je: %.2f cm\n", r);

        sc.close();
        

	}

}
