package ffdc;

public class Buttonlist implements Aggregate { 

	private Buttons[] Buttons;   //저장되는 장소이며 반복자가 활용할 변수(배열)
	public int  last = 0; //개수를 확인하기 위한 변수이며, 배열의 길이가 되기도 한다. 
    
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

