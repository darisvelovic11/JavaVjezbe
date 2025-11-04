package zadaci2;

public class povrsinaRezolucije {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 50;
		int a = 16;
		int b = 9;
		
		double k = d/Math.sqrt(a*a + b*b);
		
		double sirina  = a*k;
		double visina = b * k;
		
		double povrsina = sirina*visina;
		System.out.printf("Povrsina je %.2f",povrsina);
		

	}

}
