package ffdc;

public class Buttonlist implements Aggregate { 

	private Buttons[] Buttons;   //����Ǵ� ����̸� �ݺ��ڰ� Ȱ���� ����(�迭)
	public int  last = 0; //������ Ȯ���ϱ� ���� �����̸�, �迭�� ���̰� �Ǳ⵵ �Ѵ�. 
    
	public Buttonlist(int index) {
		this.Buttons = new Buttons[index];
    }
	
	public Buttons getBookAt(int index) {
		return Buttons[index];
	}

	public void addButtons(Buttons Button) {
		this.Buttons[last] = Button;
	    last++;
	 }
	  
	public int getLength() {
		return last;
	}
  
	public Iterator2 iterator() {
		return new ButtonlistIterator(this);
	}
}

