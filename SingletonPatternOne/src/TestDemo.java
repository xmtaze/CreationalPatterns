
public class TestDemo {

	public static void main(String[] args) {

		// Kullanamýyoruz çünkü private constructorý static methodlarý new
		// olmadan kullanabiliyorduk get instance öyle
		// SingleObject object = new SingleObject();

		// Get the only object available
		SingleObject object1 = SingleObject.getInstance();

		// show the message
		object1.showMessage();
	}
}
