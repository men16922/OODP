package ffdc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

import ffdc.Frame;

public class Joindisplay3 extends JPanel{

    private Frame F;
	private JButton btnLogin;
	private JButton btnInit;
	private JTextField userText;
	
	private static int checkid=Frame.zero;
	private Font f1, f2, f3;
	private String n;


	
	
	
	public static void main(String[] args) {
		//new LoginView();
	}

public Joindisplay3(Frame f) {
    setBackground(Color.LIGHT_GRAY);
    setSize(950, 875);
    f.setLocation(400, 100);
    setLayout(null);
  
    F = f;
   
    f1 = new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 40);//15
	f2 = new Font("±√º≠", Font.BOLD, 50);//20
	f3 = new Font("πŸ≈¡", Font.ITALIC, 75);//30
	
	setVisible(true);
	JLabel userLabel2 = new JLabel("Team Information");
	userLabel2.setBounds(40, 100, 1000, 100);//40,100,400,25
	userLabel2.setFont(f2);
	add(userLabel2);
	
	JLabel userLabel = new JLabel("Team");
	userLabel.setBounds(40, 250, 200, 65);//(40, 210, 80, 25);
	userLabel.setFont(f2);
	add(userLabel);
	
	
	
	userText = new JTextField(20);
	userText.setBounds(240, 250, 400, 65);//(100, 210, 160, 25);
	userText.setFont(f1);
	add(userText);
	
		
	  btnInit = new JButton("Enter");
			btnInit.setBounds(40, 700, 250, 65);//(40, 280, 100, 25);
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
						F.getCardLayout().show(F.getContentPane(), "Join2");
					}	
				}
			});
			
			btnLogin = new JButton("Back");
			btnLogin.setBounds(415, 700, 250, 65);//(190, 280, 100, 25);
			btnLogin.setFont(f1); 		
			add(btnLogin);
			btnLogin.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					F.getCardLayout().show(F.getContentPane(), "Join");
				}
			});
			
}
	public static void check() {
		checkid=Frame.one;
		JOptionPane.showMessageDialog(null, "No ¡ﬂ∫π");
		
	}
	public void move(Frame f) {
		F.getCardLayout().show(F.getContentPane(), "Join2");
	}

}