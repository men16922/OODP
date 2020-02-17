package ffdc;

public class InfolistIterator implements Iterator2 {

	 private Infolist Infolist; 
  
	 private int index;  



	 public InfolistIterator(Infolist Infolist) {

	  this.Infolist = Infolist;

	  this.index = 0;

	 }



	 @Override

	 public boolean hasNext() {

	  if(index < Infolist.getLength()){

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

	  PersonInfo Infos = Infolist.getBookAt(index);
	  
	  index++;
	  
     
	  return Infos;

	 }
	 
public Object present() {
		 
		 PersonInfo Infos = Infolist.getBookAt(index);
		 return Infos;
	 }
	 public Object Previous()
	 {
		 
		 PersonInfo Infos =Infolist.getBookAt(--index);
		 
		return Infos;

	 }
	
	
	}
