package ffdc;

public class Infolist implements Aggregate { 

	private PersonInfo[] Infos;   //����Ǵ� ����̸� �ݺ��ڰ� Ȱ���� ����(�迭)
    public int  last = 0; //������ Ȯ���ϱ� ���� �����̸�, �迭�� ���̰� �Ǳ⵵ �Ѵ�. 
    
	public Infolist(int index) {
		this.Infos = new PersonInfo[index];
    }
	
	public PersonInfo getBookAt(int index) {
		return Infos[index];
	}

	public void addPersonInfos(PersonInfo Infos) {
		this.Infos[last] = Infos;
		last++;
	}

	public int getLength() {
		return last;
	}
  
	@Override
	public Iterator2 iterator() {
		// TODO Auto-generated method stub
		return new InfolistIterator(this);
	}
}