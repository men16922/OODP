package ffdc;

public class Datelist implements Aggregate { 

	 private Dates[] dates;   //����Ǵ� ����̸� �ݺ��ڰ� Ȱ���� ����(�迭)
  
	public int  last = 0; //������ Ȯ���ϱ� ���� �����̸�, �迭�� ���̰� �Ǳ⵵ �Ѵ�. 
  
    

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