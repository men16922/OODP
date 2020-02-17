package ffdc;


public class MVCPatter {
	   public static void main(String[] args) {

	     
	   }
	   public static void show(String memo2) {
		  
		      MVCMemo model  = retrivememoFromDatabase(memo2);

		    
		      MVCview view = new MVCview();

		      MVCController controller = new MVCController(model, view);

		      controller.updateView();
               
		     
		      
	   }

	   private static MVCMemo retrivememoFromDatabase(String memo2){
	      MVCMemo memo = new MVCMemo();
	      memo.setmemo(memo2);
	      
	      return memo;
	   }
	}