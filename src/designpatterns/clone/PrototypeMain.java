package designpatterns.clone;

public class PrototypeMain {
	
	public static void main(String[] args) {
		EmailTemplate emailTemplate = new EmailTemplate("test","test");
		emailTemplate.print();
		
		EmailTemplate s = emailTemplate.clone();
		//s.setBody("B1");
		//s.setSubject("s1");
		s.print();
		
		
		EmailTemplate s2 = emailTemplate.clone();
		//s.setBody("B2");
		//s.setSubject("s2");
		s2.print();
		
	}

}
