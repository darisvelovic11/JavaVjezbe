package srijeda;

import java.util.Scanner;

public class Z2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float f;
        System.out.print("Unesi broj : ");    
        int x = sc.nextInt();
        if(x<1) {
        	f = x*x;
        }
        else if (1<= x && x <= 5) {
        	f = 2-x;
        }
        else {
        	f = (float)	(x*x*x-1)/5;
        }
        sc.close();
        System.out.printf("f(%d) = %.2f", x ,f);
        
        
        

	
	
	
	
        System.out.printf("VOLIM MALU DECU");
	}
	
	
	

}
