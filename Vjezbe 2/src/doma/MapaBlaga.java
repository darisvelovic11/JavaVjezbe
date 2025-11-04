package doma;

import java.util.Scanner;

public class MapaBlaga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double x1,y1,x2,y2 ;
		
		System.out.print("x1: ");
		x1 = sc.nextDouble();
		System.out.print("y1: ");
		y1 = sc.nextDouble();
		System.out.print("x2: ");
		x2 = sc.nextDouble();
		System.out.print("y2: ");
		y2= sc.nextDouble();
		
		double bX =x2+2;
		double bY = y2-3;
		System.out.printf("Koordinate blaga su : %.2f,%.2f\n",bX,bY);// Koordinate blaga
		
		
		double HB = Math.sqrt(Math.pow((bX - x1),2) +Math.pow((bY-y1),2)); //Vazdušno (euklidsko) rastojanje od hrasta G do blaga
		System.out.printf("Udaljenost od hrasta do blaga je  %.2f\n" , HB);
		
		double odHdoB = Math.hypot(x2 - x1, y2 - y1); 
		double odKdoT = Math.sqrt(13);
		
		double prekoKuce = odHdoB + odKdoT;
		System.out.printf("Rastojanje preko kuce je %.2f" , odKdoT);// Koordinate blaga preko kuce

	}

}
