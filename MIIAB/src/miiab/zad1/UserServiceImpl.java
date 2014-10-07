package miiab.zad1;

import java.util.LinkedList;
import java.util.List;

public class UserServiceImpl implements UserService{
	
	public static List<User> users = new LinkedList<>();

	@Override
	public void addUser(User u) throws IllegalUsernameException,	IncorrectEmailException {
		if (!EmailValidator.validate(u.getEmail())) {
			throw new IncorrectEmailException();
		}
		for (User user : users) {
				if (user.getName().equals(u.getUsername())) {
					throw new IllegalUsernameException();
				}
		}
		
		users.add(u);
	}

	@Override
	public User getUser(String username) throws IllegalUsernameException {

		for (User user : users) {
			if (user.getName().equals(username)) {
				return user;
			}
		}
		throw new IllegalUsernameException();
	}

	@Override
	public void removeUser(String username) throws IllegalUsernameException {
		for (User user : users) {
			if (user.getName().equals(username)) {
				users.remove(user);
				return;
			}
		}
		throw new IllegalUsernameException();
	}

	@Override
	public boolean verifyUser(String username, String password) {
		for (User user : users) {
			if(user.getUsername().equals(username)) {
				if(user.getPassword().equals(password)){
					return true;
				}
			}
		}
		return false;
	}

}
