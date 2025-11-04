package srijeda;

import java.util.Scanner;

public class PrstenTrkaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Unesi koordinate centra: ");
		        double cx = sc.nextDouble();
		        double cy = sc.nextDouble();

		        System.out.print("Unesi r1 i r2: ");
		        int r1 = sc.nextInt();
		        int r2 = sc.nextInt();

		        System.out.print("Unesi N: ");
		        int N = sc.nextInt();

		        int naStazi = 0;
		        double maxDist = -1;   
		        int maxIndex = -1;     

		        for (int i = 0; i < N; i++) {
		            System.out.print("Unesi x trkaca i y trkaca: ");
		            int xi = sc.nextInt();
		            int yi = sc.nextInt();

		            double d = Math.sqrt(Math.pow(xi - cx, 2) + Math.pow(yi - cy, 2));

		            
		            if (d >= r1 && d <= r2 && yi >= cy) {
		                naStazi++;
		            }

		            
		            if (d > maxDist) {
		                maxDist = d;
		                maxIndex = i + 1; 
		            }
		        }

		        System.out.println("Broj trkaca na stazi je " + naStazi);
		        System.out.println("Najudaljeniji trkac je " + maxIndex + ". sa udaljenoscu " + maxDist);
		    }
		}


	

