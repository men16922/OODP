package ffdc;

public class IDlistIterator implements Iterator2 {

	 private IDlist IDlist; 
   
	 private int index;  



	 public IDlistIterator(IDlist IDlist) {

	  this.IDlist = IDlist;

	  this.index = 0;

	 }



	 @Override

	 public boolean hasNext() {

	  if(index < IDlist.getLength()){

	   return true;

	  }else{

	   return false;

	  }

	 }
	 public boolean hasPrevious( ) {
       return index>0;
		 
	 }
     
     
	 @Override

	 public Object next() {

	  IDs IDs = IDlist.getBookAt(index);
	  
	  index++;
	  
      
	  return IDs;

	 }
	 
public Object present() {
		 
		 IDs IDs = IDlist.getBookAt(index);
		 return IDs;
	 }
	 public Object Previous()
	 {
		 
		 IDs IDs =IDlist.getBookAt(--index);
		 
		return IDs;

	 }
	
	
	}



