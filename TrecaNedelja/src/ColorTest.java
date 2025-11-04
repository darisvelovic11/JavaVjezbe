class Color{
	private int Red;
	private int Green;
	private int Blue;
	
	public  Color(int Red, int Green , int Blue) {
		setRed(Red);
	    setGreen(Green);
	    setBlue(Blue);
		
		
	}

	public int getRed() {
		return Red;
	}

	public void setRed(int red) {
		if(red >=0 && red <=255) {
			this.Red = red;
	}
		else {
            System.out.println("Red vrijednost mora biti između 0 i 255.");
		}
		}

	public int getGreen() {
		return Green;
	}

	public void setGreen(int green) {
		if(green >=0 && green <=255) {
			this.Green = green;
	}
		else {
            System.out.println("Green vrijednost mora biti između 0 i 255.");
		}

		
	}

	public int getBlue() {
		return Blue;
	}

	public void setBlue(int blue) {
		if(blue >=0 && blue <=255) {
			this.Blue = blue;
	}
		else {
            System.out.println("Blue  vrijednost mora biti između 0 i 255.");
		}

	}
	public void addRed(int change) {
		Red+=change;
		if (Red >255) {
			Red = 255;
			System.out.println("Red je dostigao maksimalnu vrijednost (255) ");
			
		}
	else if(Red<0) {
			Red = 0;
			System.out.println("Red je dostigao minimalnu vrijednost (0) ");
		}
		
	}
	public void addGreen(int change) {
		Green+=change;
		if (Green >255) {
			Green = 255;
			System.out.println("Green je dostigao maksimalnu vrijednost (255) ");
			
		}
		else if(Green<0) {
			Green = 0;
			System.out.println("Green je dostigao minimalnu vrijednost (0) ");
		}
	}
   public void addBlue(int change) {
	   		Blue+=change;
			if (Blue >255) {
				Blue = 255;
				System.out.println("Blue je dostigao maksimalnu vrijednost (255) ");
				
			}
			else if(Blue<0) {
				Blue = 0;
				System.out.println("Blue je dostigao minimalnu vrijednost (0) ");
			}
	}
   public void printColor() {
	   System.out.println("Red: " + Red + " Green: " + Green + " Blue: " + Blue);
	   
   }
   
   			
   		
}
public class ColorTest {

	public static void main(String[] args) {
		
				Color c = new Color(100,200,300);
				c.printColor();
				
				c.addRed(50);
				c.printColor();
			}
	

	}


