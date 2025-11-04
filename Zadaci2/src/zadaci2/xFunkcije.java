package zadaci2;

import java.util.Scanner;

public class xFunkcije {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		 System.out.print("Unesi  x: ");
	        double x = sc.nextDouble();
	        double y=0;
	        
	        if (x<= -7) {
	        	 y =  -2*x + 7.0/2;
	        	}
	        else if(-7 < x && x < 1 ){
	        	 y = (x*x - 3*x +5)/(x*x +2);
	       }
	        else if(1 <= x && x<=8 ) {
	        	y = Math.sqrt(x*x + 2*x +2) + (Math.abs(3/2)*x + (-4.0/7) );
	        	
	        }
	        else if (x>8) {
	        	Math.abs(3.0/(x*x)-11*x);
	        }
	        System.out.println(y);

	        
	        
	}

}
