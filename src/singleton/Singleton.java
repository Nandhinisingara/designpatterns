package designpatterns.singleton;

public class Singleton {

	private static Singleton instance;

	//private static final Singleton instance = new Singleton(); -> Eager

	private Singleton() {
		System.out.println("Prevents external instantiation");
	}

	public static synchronized Singleton getInstance() {

		if (instance == null) {
			instance = new Singleton();   //first time its called, next time is reused lazy instantiation

		}
		return instance;

	}
	
	public void showMessage() {
	    System.out.println("Hello from Singleton");
	}
	
	


}


