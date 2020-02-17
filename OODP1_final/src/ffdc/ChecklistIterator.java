package ffdc;

public class ChecklistIterator implements Iterator2 {

	 private Checklist Checklist; 
  
	 private int index;  



	 public ChecklistIterator(Checklist Checklist) {

	  this.Checklist = Checklist;

	  this.index = 0;

	 }



	

	 public boolean hasNext() {

	  if(index < Checklist.getLength()){

	   return true;

	  }else{

	   return false;

	  }

	 }
	 public boolean hasPrevious( ) {
      return index>0;
		 
	 }
    
    
	

	 public Object next() {

	  Checks Checks = Checklist.getBookAt(index);
	  
	  index++;
	  
     
	  return Checks;

	 }
	 
public Object present() {
		 
		 Checks Checks = Checklist.getBookAt(index);
		 return Checks;
	 }
	 public Object Previous()
	 {
		 
		 Checks Checks =Checklist.getBookAt(--index);
		 
		return Checks;

	 }
	
	
	}
