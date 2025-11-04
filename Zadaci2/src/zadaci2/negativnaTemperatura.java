package zadaci2;

import java.util.Scanner;

public class negativnaTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Unesi broj dana: ");
        int n = sc.nextInt();
        
        int[] temp = new int[n];
        for(int i=0;i<n;i++) {
        	System.out.print("Unesi temperaturu za dan " + (i + 1) + ": ");
            temp[i] = sc.nextInt();
        }
        int negativna=-1;
        for(int i = 0;i<n;i++) {
        	if(temp[i]<0) {
        		negativna=i+1;
        	}
        }
        if (negativna == -1) {
            System.out.println("Nije bilo negativnih temperatura.");
        } else {
            System.out.println("Poslednji dan sa negativnom temperaturom je: " + negativna);
        }

        sc.close();
        
        
        
        		
	}

}
