package ffdc;



public class MVCController {
	   private MVCMemo model;
	   private MVCview view;

	   public MVCController(MVCMemo model, MVCview view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setmemo(String memo){
	      model.setmemo(memo);    
	   }

	   public String getmemo(){
	      return model.getmemo();    
	   }

	  

	   public void updateView(){           
	    view.printmemoDetails(model.getmemo());
	   
	   }  
	}