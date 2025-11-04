package doma;

import java.util.Scanner;

public class Mravi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xM = 0;
		int yM = 0;
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Unesite koordinate gornju desne ivice  stola: ");
		int xGD = sc.nextInt();
		int yGD = sc.nextInt();
		
		System.out.println("Unesite koordinate  donje lijeve ivice  stola: ");
		int xDL = sc.nextInt();
		int yDL = sc.nextInt();
		
		
		int xMin =Math. min(xGD,xDL);
		int xMax =Math.max(xGD,xDL);
		int yMin =Math.min(yGD,yDL);
		int yMax =Math. max(yGD,yDL);
		
		
		System.out.print("Unesite broj mrava : ");
		int brojMrava = sc.nextInt();
		
		int mraviNaIvici = 0;
		
		for(int i = 0;i<brojMrava;i++) {
			System.out.println("Unesite koordinate mrava : ");
			 xM = sc.nextInt();
			 yM = sc.nextInt();
		
		
		boolean unutarX = (xM >= xMin && xM <=xMax);
		boolean unutarY = (yM>=yMin && yM<= yMax);
		if(unutarX && unutarY ) {
			boolean lijevaI = (xM==xMin);
			boolean desnaI = (xM ==xMax);
			boolean donjaI = (yM==yMin);
			boolean gornjaI = (yM ==yMax);
			
			if (lijevaI || desnaI || donjaI || gornjaI) {
				mraviNaIvici++;
			}
			
		}
	}	
	
	System.out.println("Broj mrava na ivici je " + mraviNaIvici);
		
		
		sc.close();
	}
}


