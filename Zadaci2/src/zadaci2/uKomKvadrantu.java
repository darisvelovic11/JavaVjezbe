package zadaci2;

import java.util.Scanner;

public class uKomKvadrantu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Unesi x: ");
        int x = sc.nextInt();

        System.out.print("Unesi y: ");
        int y = sc.nextInt();
        
        if(x>0 && y>0) {
        	System.out.println("U prvom kvadratnu");
        }
        else if(x<0 && y>0) {
        	System.out.println("U drugom kvadratnu");
        }
        else if(x<0 && y<0) {
        	System.out.println("U trecem kvadratnu");
        }
        else if(x>0 && y<0) {
        	System.out.println("U cetvrom kvadratnu");
        }
        else if (x==0 & y==0) {
        	System.out.println("U koordinatnom pocetku");

        }
        if(x>0 && y>0) {
        	System.out.println("U prvom kvadratnu");
        }
        if(x==0) {
        	System.out.println("U X osi");
        }
        if(y==0) {
        	System.out.println("U y osi");
        }
        sc.close();
	}
	
	
	

}
