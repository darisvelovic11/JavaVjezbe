package zadaci2;

import java.util.Scanner;

public class tackaUPravougaonik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		System.out.print("Unesi koordinate tacke");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x >= x1 && x<= x2 && y <=y1 && y>=y2) {
			System.out.print("Tacka je u pravougonik");
		}
		else {
			System.out.print("Tacka nije u pravougonik");
		}


	}

}
