package ffdc;
//Singleton loginInformation = Singleton.getInstance
public class LoginInformation {
	
	private static LoginInformation Instance;
	private int loginIndex;
	private String position;
	
	private LoginInformation(){
		loginIndex = 0;
		position ="";
	}
	
	public static LoginInformation getInstance(){
		if(Instance==null){
			Instance = new LoginInformation();
		}
		return Instance;
	}
	
	public int getLoginIndex(){
		return loginIndex;
	}
	public void setLoginIndex(int loginIndex){
		this.loginIndex = loginIndex;
	}
	
	public String getPosition(){
		return position;
	}
	
	public void setPosition(String position){
		this.position = position;
	}
}
