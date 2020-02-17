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

public class Joindisplay2 extends JPanel{

    private Frame F;
	private JButton btnLogin;
	private JButton btnInit;
	private JTextField[] Jtxt = new JTextField[4];
	private int[] numArr = {250,340,500,590}; 
	private static int checkid=Frame.zero;
	private Font f1, f2;
	private String n1, n2, n3, n4;
	
    
	public static void main(String[] args) {
		
	}

	public Joindisplay2(Frame f) {
	    setBackground(Color.LIGHT_GRAY);
	    setSize(950, 875);
	    f.setLocation(400, 100);
	    setLayout(null);
	  
	    F = f;
	   
	    f1 = new Font("���� ���", Font.PLAIN, 40);
		f2 = new Font("�ü�", Font.BOLD, 50);
		
		setVisible(true);
		JLabel userLabel2 = new JLabel("Personal Information");
		userLabel2.setBounds(40, 100, 1000, 100);
		userLabel2.setFont(f2);
		add(userLabel2);
		
		JLabel userLabel = new JLabel("Name");
		userLabel.setBounds(40, 250, 200, 65);//(40, 210, 80, 25);
		userLabel.setFont(f2);
		add(userLabel);
		
		JLabel userLabel3 = new JLabel("StNr");
		userLabel3.setBounds(40, 340, 200, 65);//(40, 240, 80, 25);
		userLabel3.setFont(f2);
		add(userLabel3);
		
		JLabel userLabel6 = new JLabel("-essential input-");
		userLabel6.setBounds(200, 400, 300, 65);//(40, 240, 80, 25);
		userLabel6.setFont(f1);
		add(userLabel6);
		
		JLabel userLabel4 = new JLabel("Birth");
		userLabel4.setBounds(40, 500, 200, 65);//(40, 240, 80, 25);
		userLabel4.setFont(f2);
		add(userLabel4);
		
		JLabel userLabel5 = new JLabel("Phone");
		userLabel5.setBounds(40, 590, 250, 65);//(40, 240, 80, 25);
		userLabel5.setFont(f2);
		add(userLabel5);
		
		for(int i=0;i<4;i++){
			Jtxt[i] = new JTextField(20);
			Jtxt[i].setBounds(240, numArr[i], 400, 65);
			Jtxt[i].setFont(f1);
			add(Jtxt[i]);
		}
		
		  btnInit = new JButton("Enter");
				btnInit.setBounds(40, 700, 250, 65);//(40, 280, 100, 25);
				btnInit.setFont(f1);
				add(btnInit);
				btnInit.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						n1=Jtxt[0].getText();
						n2=Jtxt[1].getText();
						n3=Jtxt[2].getText();
						n4=Jtxt[3].getText(); 
						checkid=Frame.zero;
			           if(n3.equals("") && n4.equals("")) {
			        	 
			        	   Join2.join(n1, n2);
							if(checkid==Frame.zero)
							{
								Frame.Infolist.addPersonInfos(new PersonInfo.Builder(n1,n2).build());
								Write2.Text();
								
								JOptionPane.showMessageDialog(null, "Success");
								F.getCardLayout().show(F.getContentPane(), "One");
								
							} 	
			            }
			            else if(n3.equals("") && n4!=("")) {
			            	
							Join2.join(n1, n2);
							Join2.join2(n4);
							if(checkid==Frame.zero)
							{
								Frame.Infolist.addPersonInfos(new PersonInfo.Builder(n1,n2).phone(n4).build());
								Write2.Text();
								
								JOptionPane.showMessageDialog(null, "Success");
								F.getCardLayout().show(F.getContentPane(), "One");	
							}
			            }
			            else if(n3!=("") && n4.equals((""))) {
			            	
							Join2.join(n1, n2);
							if(checkid==Frame.zero)
							{
								Frame.Infolist.addPersonInfos(new PersonInfo.Builder(n1,n2).birth(n3).build());
								Write2.Text();
								
								JOptionPane.showMessageDialog(null, "Success");
								F.getCardLayout().show(F.getContentPane(), "One");	
							}
			            }
			            else {
							Join2.join(n1, n2);
							Join2.join2(n4);
							Frame.Infolist.addPersonInfos(new PersonInfo.Builder(n1,n2).birth(n3).phone(n4).build());
							Write2.Text();
							JOptionPane.showMessageDialog(null, "Success");
							F.getCardLayout().show(F.getContentPane(), "One");	
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
		JOptionPane.showMessageDialog(null, "already joined");
	}

}