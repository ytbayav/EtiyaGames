
public class UserService {
	
public User [] getUser() {
		
		User user1 = new User();
		user1.firstName = "Taha";
		user1.lastName = "Bayav";
		user1.age = 14;
		
		User user2 = new User();
		user2.firstName = "Anil";
		user2.lastName = "Cicek";
		user2.age = 25;
		
		User user3 = new User();
		user3.firstName = "Onur";
		user3.lastName = "Alper";
		user3.age = 28;
		
		User [] users = {user1, user2, user3};
		return users;
	}
	
	public void saveUser() {
		System.out.println("User Saved!");
	}
	
	public void addUser(User user) {
		if (user.age > 15) {
			System.out.println("Added to the system!");
		}
		else {
			System.out.println("Your age is not suitable!");
		}
	}

}
