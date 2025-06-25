package designpatterns.clone;

public class UserMain {

	public static void main(String[] args) {
		 User user1 = new User(1,"Nandhini");
		 User user2 = new User(1, "Nandhini");
		 
		 System.out.println(user1 == user2); //false
		 System.out.print(user1.equals(user2)); //false

	}

}
