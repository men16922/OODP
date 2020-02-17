package ffdc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


import ffdc.Frame;

public class Joindisplay4 extends JPanel{

    private Frame F;
	private JButton btnLogin;
	private JButton btnref;
	private JButton btnInit;
	private static Set<String> team =  new TreeSet<String>();
    private JList list;
	private static int checkid=Frame.zero;
	private Font f1, f2, f3;
	
	public Joindisplay4(Frame f) {
    setBackground(Color.LIGHT_GRAY);
    setSize(950, 875);
    f.setLocation(400, 100);
    setLayout(null);
    team.clear();
    F = f;
   
    f1 = new Font("¸¼Àº °íµñ", Font.PLAIN, 40);//15
	f2 = new Font("±Ã¼­", Font.BOLD, 50);//20
	f3 = new Font("¹ÙÅÁ", Font.ITALIC, 75);//30
	
	setVisible(true);
	JLabel userLabel2 = new JLabel("Team Information");
	userLabel2.setBounds(40, 100, 1000, 100);//40,100,400,25
	userLabel2.setFont(f2);
	add(userLabel2);
	
	JLabel userLabel = new JLabel("Team");
	userLabel.setBounds(40, 250, 200, 65);//(40, 210, 80, 25);
	userLabel.setFont(f2);
	add(userLabel);
	
	
	
	List teamlist = new List(5);
	teamlist.setBounds(240, 250, 400, 65);//(100, 210, 160, 25);
	teamlist.setFont(f1);
	add(teamlist);
	   
	   
	   
    btnref= new JButton("Refresh");
          btnref.setBounds(320, 350, 250, 65);//(40, 280, 100, 25);
     btnref.setFont(f1);
     add(btnref);
        
     btnref.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {                                          
        	teamlist.removeAll();              
           Read.readteam(); 
           Iterator<String> it=team.iterator();
			while(it.hasNext()) {
				String n=it.next();
				teamlist.add(n);
			}
		}
     });
	  btnInit = new JButton("Enter");
			btnInit.setBounds(40, 700, 250, 65);//(40, 280, 100, 25);
			btnInit.setFont(f1);
			add(btnInit);
			btnInit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(P_Two.logincheck==Frame.zero) {
					if(teamlist.getSelectedIndex()==-1)
					{
						String n="¹ÌÀÔ·Â";
						teamwrite.teamlist(n);
						
						JOptionPane.showMessageDialog(null, "Success");
						F.getCardLayout().show(F.getContentPane(), "Join2");
					}
					else {
							String n=teamlist.getSelectedItem();		
				teamwrite.teamlist(n);
				JOptionPane.showMessageDialog(null, "Success");
				F.getCardLayout().show(F.getContentPane(), "Join2");	
					}
					}
					
		     	if(P_Two.logincheck==Frame.one) {
		     		if(teamlist.getSelectedIndex()==-1)
					{
		     			System.out.println("·Î±×ÀÎ");
						String n="¹ÌÀÔ·Â";
						teamwrite.editteam(n);
						JOptionPane.showMessageDialog(null, "Success");
						F.getCardLayout().show(F.getContentPane(), "Two");
					}
		     		else {
		     			System.out.println("·Î±×ÀÎ2");
							String n=teamlist.getSelectedItem();		
				teamwrite.editteam(n);
				JOptionPane.showMessageDialog(null, "Success");
				F.getCardLayout().show(F.getContentPane(), "Two");
		     		}
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
	public static void addlist(String n) {
		
		team.add(n);
	}	
}