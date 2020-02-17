package ffdc;
import javax.swing.JOptionPane;

public class Moderator implements User {
	
	public void showMessage(){
		   JOptionPane.showMessageDialog(null, "Moderator Login" );
	}
}
