package ffdc;

public class teamdistinct {
	  private static teamdistinct instance;
	  private int teamjang;
	  private int teamone;
	  private int admin;
	  private String Check[] = new String [10];
	  private int Check1;
	   private int Check2;
	   private int Check3;
	   private String CheckString;
	  private teamdistinct(){
		  teamjang=0;
		  teamone=1;
		  admin=2;
		  Check1=0;
		  Check2=0;
		  Check3=0;
	  }
	  
	  public static teamdistinct getinstance() {
		  if(instance==null) {
			  instance= new teamdistinct();
		  }
	  return instance;
	 	   
	  
		  }
	  public int getteamjang() {
		  return teamjang;
	  }
	  public int getteamone() {
		  return teamone;
	  }
	  public int getadmin() {
		  return admin;
	  }
	  public int getCheck1() {
		  return Check1;
	  }
	  public int getCheck2() {
		  return Check2;
	  }
	  public String getCheckarray() {
		  return Check[Check1];
	  }
	  public String getCheckarray2() {
		  return Check[Check2];
	  }
	  public String getCheckarray3() {
		  return Check[Check3];
	  }
	  
	  public void setCheckarray(String CheckString)
	  {
		  this.CheckString=CheckString;
	  }
	  public void CheckCheckarray(int Check1) {
		  this.Check[Check1]=CheckString;
	  }
	  
	  public void setCheck1(int Check1) {
		  this.Check1=Check1;
	  }
	  public void setCheck2(int Check2) {
		  this.Check2=Check2;
	  }
	  public void setCheck3(int Check3) {
	      this.Check3=Check3;
	  }
}
