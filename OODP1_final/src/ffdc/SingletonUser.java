package ffdc;

public class SingletonUser {

		private static SingletonUser userInstance;
		private User user;
		
		private SingletonUser(){}
		
		public static SingletonUser getInstance(){
			if(userInstance == null)
				userInstance = new SingletonUser();
			return userInstance;
		}
		
		public User getUser(){
			return user;
		}
		
		public void setUser(User user){
			this.user = user;
		}
}
