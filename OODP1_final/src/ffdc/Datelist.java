package ffdc;

public class Datelist implements Aggregate { 

	 private Dates[] dates;   //저장되는 장소이며 반복자가 활용할 변수(배열)
  
	public int  last = 0; //개수를 확인하기 위한 변수이며, 배열의 길이가 되기도 한다. 
  
    

	 public Datelist(int index) {

	  this.dates = new Dates[index];
     
	 }
	


	 public Dates getBookAt(int index) {

	  return dates[index];
      
	 }
  

	 public void addDates(Dates date) {

	  this.dates[last] = date;
	 // this.checks[last] = check;
	  	  last++;
	 }
	

	 public int getLength() {

	  return last;

	 }
  

	 @Override

	 public Iterator2 iterator() {

	  // TODO Auto-generated method stub

	  return new DateIterator(this);

	 }

	}