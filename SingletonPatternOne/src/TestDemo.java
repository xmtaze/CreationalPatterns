
public class TestDemo {

	public static void main(String[] args) {

		// Kullanam�yoruz ��nk� private constructor� static methodlar� new
		// olmadan kullanabiliyorduk get instance �yle
	

		// Get the only object available
		SingleObject object1 = SingleObject.getInstance();

		// show the message
		object1.showMessage();
		//git commit bu !!!
	}
	//git change control
}
