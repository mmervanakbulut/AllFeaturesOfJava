package abstructClasses;

public class Main {

	public static void main(String[] args) {
		WomenGameCalculator women = new WomenGameCalculator();
		women.hesapla();
		women.gameOver();
		 
		// GameCalculator game = new GameCalculator(); abstract class bu şekilde kullanılamaz.
		GameCalculator game = new MenGameCalculator();
		
	}

}
