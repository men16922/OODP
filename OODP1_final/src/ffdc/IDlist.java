package ffdc;

public class IDlist implements Aggregate { 

	 private IDs[] IDs;   //����Ǵ� ����̸� �ݺ��ڰ� Ȱ���� ����(�迭)
     
	public int  last = 0; //������ Ȯ���ϱ� ���� �����̸�, �迭�� ���̰� �Ǳ⵵ �Ѵ�. 
     


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



