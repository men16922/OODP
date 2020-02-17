package ffdc;

public class Checklist implements Aggregate { 

	 private Checks[] Checks;   //저장되는 장소이며 반복자가 활용할 변수(배열)
    
	public int  last = 0; //개수를 확인하기 위한 변수이며, 배열의 길이가 되기도 한다. 
    


	 public Checklist(int index) {

	  this.Checks = new Checks[index];
     
	 }
	


	 public Checks getBookAt(int index) {

	  return Checks[index];

	 }



	 public void addChecks(Checks Checks) {

	  this.Checks[last] = Checks;
	  
	  	  last++;
	 
	 }
	 public void Indexof(int i,Checks Checks) {
		 this.Checks[i] = Checks;
	 }
	 

	 public int getLength() {

	  return last;

	 }
  

	 @Override

	 public Iterator2 iterator() {

	  // TODO Auto-generated method stub

	  return new ChecklistIterator(this);

	 }

	}