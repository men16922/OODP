package ffdc;

public class Infolist implements Aggregate { 

	private PersonInfo[] Infos;   //저장되는 장소이며 반복자가 활용할 변수(배열)
    public int  last = 0; //개수를 확인하기 위한 변수이며, 배열의 길이가 되기도 한다. 
    
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