package ffdc;

public class IDs {

	 private String name;  // �ܺο��� Name ���� �������� ���ϰ� private ���� ����
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



