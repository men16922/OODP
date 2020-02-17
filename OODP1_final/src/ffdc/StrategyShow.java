package ffdc;

import javax.swing.JOptionPane;

public interface StrategyShow { 
	public void attack(); 
} 

class GoodBehavior implements StrategyShow{ 
	@Override 
	public void attack() { 
		JOptionPane.showMessageDialog(null, "참 잘했어요!");
	} 
} 

class BadBehavior implements StrategyShow{ 
	@Override 
	public void attack(){
		JOptionPane.showMessageDialog(null, "더 노력하세요");
	}
} 


