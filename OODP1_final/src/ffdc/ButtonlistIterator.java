package ffdc;

public class ButtonlistIterator implements Iterator2 {

	 private Buttonlist Buttonlist; 
 
	 private int index;  



	 public ButtonlistIterator(Buttonlist Buttonlist) {

	  this.Buttonlist = Buttonlist;

	  this.index = 0;

	 }



	 @Override

	 public boolean hasNext() {

	  if(index < Buttonlist.getLength()){

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

	  Buttons Buttons = Buttonlist.getBookAt(index);
	  
	  index++;
	  
    
	  return Buttons;

	 }
	 
public Object present() {
		 
		 Buttons Buttons = Buttonlist.getBookAt(index);
		 return Buttons;
	 }
	 public Object Previous()
	 {
		 
		 Buttons Buttons =Buttonlist.getBookAt(--index);
		 
		return Buttons;

	 }
	
	
	}