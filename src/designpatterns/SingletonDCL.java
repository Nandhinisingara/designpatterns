package designpatterns;

public class SingletonDCL {
	
	//Double checked lock
	private static volatile SingletonDCL instance;

	private SingletonDCL() {
		System.out.println("Prevents external instantiation");
	}

	public static SingletonDCL getInstance() {

		if (instance == null) {  //1st check
			synchronized (Singleton.class) {
				if (instance == null) { //2nsd check
					instance = new SingletonDCL();   //first time its called, next time is reused lazy instantiation
				}
			}
		}
		return instance;

	}
	
	public void showMessage() {
	    System.out.println("Hello from Singleton");
	}
	

}
