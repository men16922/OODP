package ffdc;

import javax.swing.JOptionPane;

public class NullUser implements User{
	public void showMessage(){
		   JOptionPane.showMessageDialog(null, "Non-member Login" );
	}
}
