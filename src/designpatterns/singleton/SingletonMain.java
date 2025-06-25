package designpatterns.singleton;

public class SingletonMain {
	public static void main(String[] args) {
		
			// Create two threads accessing Singleton
	        Thread t1 = new Thread(() -> {
	            Singleton instance1 = Singleton.getInstance();
	            System.out.println("Instance 1: " + instance1.hashCode());
	        });
	
	        Thread t2 = new Thread(() -> {
	            Singleton instance2 = Singleton.getInstance();
	            System.out.println("Instance 2: " + instance2.hashCode());
	        });
	
	        t1.start();
	        t2.start();
	        
	        
	        Runnable runnable = () -> {
	        	 Singleton instance1 = Singleton.getInstance();
		            System.out.println("Instance 1: " + instance1.hashCode());
	        		System.out.println("test");
	        };
	        runnable.run();
	        
	        
		
		
		  Singleton s1 = Singleton.getInstance(); Singleton s2 =
		  Singleton.getInstance();
		  
		  
		  
		  s1.showMessage(); // "Hello from Singleton"
		  
		 // System.out.println(s1.hashCode());
		 // System.out.println(s2.hashCode());
		  System.out.println(s1 == s2);
		  System.out.println(s1 == s2); // true — same object
		  
		  SingletonBPS s3 = SingletonBPS.getInstance(); SingletonBPS s4 =
		  SingletonBPS.getInstance();
		  
		  s3.showMessage(); // "Hello from Singleton"
		  
		  System.out.println(s3 == s4); // true — same object
		  
		  SingletonDCL s5 = SingletonDCL.getInstance(); SingletonDCL s6 =
		  SingletonDCL.getInstance();
		  
		  s5.showMessage();
		 
		System.out.println(s5 == s6); // true — same object
		
		ConfigManager c1 = ConfigManager.getInstance();
		System.out.println(c1.hashCode());
		c1.loadConfigs().get(1);
		ConfigManager c2 = ConfigManager.getInstance();
		System.out.println(c2.hashCode());
		c2.loadConfigs().get(2);
		ConfigManager c3 = ConfigManager.getInstance();
		System.out.println(c3.hashCode());
		c3.loadConfigs().get(3);
		
	}

}
