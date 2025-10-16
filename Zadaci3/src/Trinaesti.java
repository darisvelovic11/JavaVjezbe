import java.util.ArrayList;
import java.util.Scanner;


public class Trinaesti {
	public static ArrayList<Integer> longest_increasing(int[] input_array){
		ArrayList<Integer> trenutni = new ArrayList();
		ArrayList<Integer> najbolji = new ArrayList();
		
		for(int  i = 0; i < input_array.length; i++) {
			int broj = input_array[i];
			
			if (broj > 0 && (trenutni.isEmpty() || broj >= trenutni.get(trenutni.size()-1))) {
				trenutni.add(broj);
			}else {
				if (trenutni.size() > najbolji.size()) {
					najbolji = new ArrayList<>(trenutni);
				}
				trenutni.clear();
				if(broj>0) {
					trenutni.add(broj);
				}
			}
		}
		if(trenutni.size() > najbolji.size()) {
			najbolji = new ArrayList<>(trenutni);
		}
		return najbolji;
        	

	}

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Unesite broj elemenata niza: ");
        int n = sc.nextInt();
        int[] niz = new int[n];
        
        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            niz[i] = sc.nextInt();
        }
        ArrayList<Integer> rezultat=longest_increasing(niz);
        System.out.println("Najduži neopadajući podniz pozitivnih brojeva je: " + rezultat);

        
        

	}

}
