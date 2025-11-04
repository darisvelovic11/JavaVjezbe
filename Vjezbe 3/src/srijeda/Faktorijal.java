package srijeda;

import java.util.Scanner;

public class Faktorijal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi broj : ");    
        int x = sc.nextInt();
        long p = 1;     //zasto long?
        		
        
        for(int i = 1; i <=x;i++) {
        	p*=i;
        	
        	
        	
        }
        System.out.print(p);
        
        

	}

}
