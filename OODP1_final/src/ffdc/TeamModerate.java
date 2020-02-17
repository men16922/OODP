package ffdc;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TeamModerate extends JoinFlow {
	
	private JButton btnLogin;
	private JButton btnInit;
	private JTextField userText;
	
	private static int checkid=Frame.zero;
	private Font f1, f2, f3;
	private String n;
	//-------------------
	private JButton btnref;
	private static Set<String> team =  new TreeSet<String>();
    private JList list;
    private CardLayout cards = new CardLayout();

	
    @Override
	void JoinFlow0(final JFrame f) {
    	
    	userText = new JTextField(20);
    	userText.setBounds(240, 250, 400, 65);//(100, 210, 160, 25);
    	userText.setFont(f1);
    	add(userText);
    	
    		
    	  btnInit = new JButton("Enter");
    			btnInit.setBounds(40, 400, 250, 65);//(40, 280, 100, 25);
    			btnInit.setFont(f1);
    			add(btnInit);
    			btnInit.addActionListener(new ActionListener() {
    				@Override
    				public void actionPerformed(ActionEvent e) {
    					n=userText.getText();
    					checkid=Frame.zero;
    		       
    					Join2.join3(n);
    					if(checkid==Frame.zero) {
    						teamwrite.Text(n);
    						
    						JOptionPane.showMessageDialog(null, "Success");
    					
    						}
    					dispose();
    				}
    			});
		}
    
    @Override
    public void check() {
  		checkid=Frame.one;
		JOptionPane.showMessageDialog(null, "already joined");
	}
    
	static void addlist(String n){}
}


