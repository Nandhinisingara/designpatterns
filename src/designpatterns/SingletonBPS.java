package designpatterns;

public class SingletonBPS {
	
	//Bill Pugh Singleton
	private SingletonBPS() {
		
	}
	
	public static class SingletonHelper {
		public static final SingletonBPS INSTANCE = new SingletonBPS();
	}
	
	public static SingletonBPS getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	public void showMessage() {
	    System.out.println("Hello from Singleton");
	}
	

}
