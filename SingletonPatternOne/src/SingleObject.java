
public class SingleObject {

	// private ve static bir instance yaratt�k
	private static SingleObject instance = new SingleObject();

	// constructor� private yapt���m�z i�in bu class art�k instantiate
	// edilemez.(defaultu san�r�m override etmi� olduk burada)
	private SingleObject() {
	};

	// sadece burada olu�turdu�umuz instance d��ar�dan �a��r�labilir ve t�m
	// projede kullan�labilir
	// bir kere yaratma single object olay� asl�nda burada saglanm�� oluyor
	// mant�k bu oluyor.
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello BABO!");
	}
	//git kontrol
}
