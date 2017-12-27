
public class SingleObject {

	// private ve static bir instance yarattýk
	private static SingleObject instance = new SingleObject();

	// constructorý private yaptýðýmýz için bu class artýk instantiate
	// edilemez.(defaultu sanýrým override etmiþ olduk burada)
	private SingleObject() {
	};

	// sadece burada oluþturduðumuz instance dýþarýdan çaðýrýlabilir ve tüm
	// projede kullanýlabilir
	// bir kere yaratma single object olayý aslýnda burada saglanmýþ oluyor
	// mantýk bu oluyor.
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello BABO!");
	}
}
