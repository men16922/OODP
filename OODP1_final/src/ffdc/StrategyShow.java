package ffdc;

import javax.swing.JOptionPane;

public interface StrategyShow { 
	public void attack(); 
} 

class GoodBehavior implements StrategyShow{ 
	@Override 
	public void attack() { 
		JOptionPane.showMessageDialog(null, "�� ���߾��!");
	} 
} 

class BadBehavior implements StrategyShow{ 
	@Override 
	public void attack(){
		JOptionPane.showMessageDialog(null, "�� ����ϼ���");
	}
} 


