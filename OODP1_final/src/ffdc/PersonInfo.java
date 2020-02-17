package ffdc;

public class PersonInfo {
	private String name;
	private String Stnr;
	private String position;

	private String birth;
	private String phone;
	
	public static class Builder{
		private String name;
		private String Stnr;
		private String position;
		
		private String birth="미입력";
		private String phone="미입력";
		
		public Builder(String name, String Stnr){
			this.name=name;
			this.Stnr=Stnr;
		}
		
		public Builder(String name, String Stnr,String position){
			this.name=name;
			this.Stnr=Stnr;
			this.position = position;
		}
		
		public Builder birth(String birth) {
			this.birth=birth;
			return this;
		}
		
		public Builder phone(String phone) {
			this.phone=phone;
			return this;
		}
		public PersonInfo build() {
			return new PersonInfo(this);
		}
	}
	
	public String getname() {
		return name;
	}
	   
	public String getStnr() {
		return Stnr;
	}
	
	public String getPosition(){
		return position;
	}
	public String getbirth() {
		return birth;
	}
	   
	public String getphone() {
		return phone;
	}
	
	private PersonInfo (Builder Builder){
		name=Builder.name;
		Stnr=Builder.Stnr;
		position=Builder.position;
		birth=Builder.birth;
		phone=Builder.phone;	
	}
}



	