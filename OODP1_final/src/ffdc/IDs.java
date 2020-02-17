package ffdc;

public class IDs {

	 private String name;  // 외부에서 Name 값을 변경하지 못하게 private 으로 선언
     private String pass;
     private String position;
     
//     public IDs(String name, String pass){
//    	 this.name = name;
//		 this.pass =pass;
//		 this.position = null;
//     }
     
	 public IDs(String name, String pass,String position) {
		 this.name = name;
		 this.pass =pass;
		 this.position = position;
	 }
   
	 public String getName() {
		 return name;
     }

	 public String getPass() {
		  return pass;
	 }
	 
	 public String getPosition(){
		 return position;
	 }
}



