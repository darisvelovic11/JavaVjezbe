enum Dani{
	PONEDELJAK,
	UTORAK,
	SRIJEDA,
	CETVRTAK,
	PETAK,
	SUBOTA,
	NEDELJA;
	
	public boolean isWeekend() {
		return this == SUBOTA ||  this == NEDELJA; 
	}
	public boolean isWeekday() {
		return !isWeekend();
	}
}


public class EnumeracijaDani {

	public static void main(String[] args) {
		for(Dani dan : Dani.values()) {
			System.out.printf("%-10s -> vikend: %-5s | radni dan: %-5s%n", dan, dan.isWeekend(), dan.isWeekday());
		}
		Dani danas = Dani.SRIJEDA;
		if(danas.isWeekday()) {
			System.out.println("Danas je radni dan, idemo na posao.");
		} else {
			System.out.println("Danas je vikend, odmaramo se.");
		}
	}

}
