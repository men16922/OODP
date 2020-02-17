package ffdc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

// 아이디 비번 화면 
public class Joindisplay extends JPanel{
    private Frame F;
	private JButton btnLogin;
	private JButton btnInit;
	private JPasswordField passText;
	private JTextField userText;
	private static int checkid=Frame.zero;
	private Font f1, f2;
	private String n, n2;
	private String n3;

    public static String ID;
	public static void main(String[] args) {
	
	}
	
    public Joindisplay(Frame f) {
        setBackground(Color.LIGHT_GRAY);
        setSize(950, 700);
        f.setLocation(400, 100);
        setLayout(null);
      
        F = f;
       
        f1 = new Font("�뜝�룞�삕�뜝�룞�삕 �뜝�룞�삕�뜝占�", Font.PLAIN, 40);
		f2 = new Font("�뜝�떆�눦�삕", Font.BOLD, 50);
		
		
		setVisible(true);
		JLabel userLabel2 = new JLabel("Team Registration");
		userLabel2.setBounds(40, 100, 1000, 100);
		userLabel2.setFont(f2);
		add(userLabel2);
		
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(40, 250, 200, 65);
		userLabel.setFont(f2);
		add(userLabel);
		
		JLabel passLabel = new JLabel("Pass");
		passLabel.setBounds(40, 340, 200, 65);
		passLabel.setFont(f2);
		add(passLabel);
		
		userText = new JTextField(20);
		userText.setBounds(190, 250, 400, 65);
		userText.setFont(f1);
		add(userText);
		
		passText = new JPasswordField(20);
		passText.setBounds(190, 340, 400, 65);
		passText.setFont(f1);
		add(passText);
		
        final JRadioButton rd1 = new JRadioButton("moderator");
        rd1.setBounds(100, 420, 300, 70);
        rd1.setFont(f1);

		final JRadioButton rd2 = new JRadioButton("team member");
		rd2.setBounds(400, 420, 500, 70);
		rd2.setFont(f1);
        
		ButtonGroup groupRd = new ButtonGroup();
		groupRd.add(rd1);
		groupRd.add(rd2);

        add(rd1);
        add(rd2);

                    
        btnInit = new JButton("Enter");
		btnInit.setBounds(40, 540, 250, 65);
		btnInit.setFont(f1);
		add(btnInit);
		btnInit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				n=userText.getText();
				n2=passText.getText();
				if(rd1.isSelected())
					n3= "Moderator";
				else if(rd2.isSelected())
					n3 = "Member";
				else
					n3 = null;
				checkid=Frame.zero;
				Join.join(n);
			
				if(checkid==Frame.zero && n3== "Moderator"){
					Frame.IDlist.addIDs(new IDs(n,n2,n3));
					Write.Text();
					ID=n;		  	  
					JOptionPane.showMessageDialog(null, "Success" + Frame.current);
					F.getCardLayout().show(F.getContentPane(), "Join2");
					TemplateMain.main(n3);
					
				}
				else if(checkid==Frame.zero && n3 == "Member"){
					Frame.IDlist.addIDs(new IDs(n,n2,n3));
					Write.Text();
					ID=n;		  	  
					JOptionPane.showMessageDialog(null, "Success" + Frame.current);
					F.getCardLayout().show(F.getContentPane(), "Join2");
					TemplateMain.main(n3);
				}
				Frame.current++;
			}
		});
		btnLogin = new JButton("Back");
		btnLogin.setBounds(415, 540, 250, 65);
		btnLogin.setFont(f1); 		
		add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				F.getCardLayout().show(F.getContentPane(), "One");
			}
		});
	}
    
    public static void check() {
    	checkid=Frame.one;
    	JOptionPane.showMessageDialog(null, "already joined");
    }
}

