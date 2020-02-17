package ffdc;

public class DateIterator implements Iterator2 {

	 private Datelist Datelist; 
	 private int index;  

	 public DateIterator(Datelist Datelist) {
		 this.Datelist = Datelist;
		 this.index = 0;
	 }

	 @Override
	 public boolean hasNext() {
		 if(index < Datelist.getLength()){
			 return true;
	  }
		 else{
		  return false;
		 }
	 }
	 
	 public boolean hasPrevious( ) {
		 return index>0;
	 }
     @Override
	 public Object next() {
    	 Dates Dates = Datelist.getBookAt(index);
    	 index++;
    	 return Dates;
	  }

     public Object present() {
		 Dates Dates = Datelist.getBookAt(index);
		 return Dates;
	 }
	 
     public Object Previous(){
    	 Dates Dates =Datelist.getBookAt(--index);
    	 return Dates;
     }
}
