package ffdc;

public class Checklist implements Aggregate { 

	 private Checks[] Checks;   //����Ǵ� ����̸� �ݺ��ڰ� Ȱ���� ����(�迭)
    
	public int  last = 0; //������ Ȯ���ϱ� ���� �����̸�, �迭�� ���̰� �Ǳ⵵ �Ѵ�. 
    


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