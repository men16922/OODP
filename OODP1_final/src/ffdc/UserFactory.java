package ffdc;

import javax.swing.JOptionPane;

public class UserFactory implements AbstractUserFactory{
		
	public static User CreateUser(String type){
		if(type.equals("Moderator"))
			return new Moderator();
		
		else if(type.equals("Member"))
			return new Member();
		
		else if(type.equals(""))
			return new NullUser();
		
		else
    		return null;
	}
}
