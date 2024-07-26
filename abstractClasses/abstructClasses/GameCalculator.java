package abstructClasses;

public abstract class GameCalculator {
	// hesapla override edilmek zorunda. abstract class'da abstract method olmak zorunda değil.
	public abstract void hesapla(); 
	
	public final void gameOver() {
		System.out.println("Game Over");
	}
}
