package srijeda;

import java.util.Scanner;

public class ApsolutniBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Unesi broj : ");    // Ctrl + O
        int N = sc.nextInt();
        int N1 = N;
        if(N<0) 
        	N=-N;
        System.out.printf("|%d| je %d. ",N1 ,N); 
        sc.close();
        
        	
        }
	}


