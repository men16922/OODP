package ffdc;

public class IDlist implements Aggregate { 

	 private IDs[] IDs;   //저장되는 장소이며 반복자가 활용할 변수(배열)
     
	public int  last = 0; //개수를 확인하기 위한 변수이며, 배열의 길이가 되기도 한다. 
     


	 public IDlist(int index) {

	  this.IDs = new IDs[index];
      
	 }
	


	 public IDs getBookAt(int index) {

	  return IDs[index];

	 }

 

	 public void addIDs(IDs ID) {

	  this.IDs[last] = ID;
	  
	  	  last++;
	 
	 }
	 

	 public int getLength() {

	  return last;

	 }
   

	 @Override

	 public Iterator2 iterator() {

	  // TODO Auto-generated method stub

	  return new IDlistIterator(this);

	 }

	}



