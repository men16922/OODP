package ffdc;

import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TeamMember extends JoinFlow {
	
	  private JFrame F;
		private JButton btnLogin;
		private JButton btnInit;
		private JTextField userText;
		
		private static int checkid=Frame.zero;
		private Font f1, f2, f3;
		private String n="미입력";
		//-------------------
		private JButton btnref;
		private static Set<String> team =  new TreeSet<String>();
	    private JList list;

		
		@Override
		void JoinFlow0(JFrame f) {
			
			final List teamlist = new List(5);
			teamlist.setBounds(240, 250, 400, 65);//(100, 210, 160, 25);
			teamlist.setFont(f1);
			add(teamlist);
			   
		    btnref= new JButton("Refresh");
		          btnref.setBounds(600, 250, 250, 65);//(40, 280, 100, 25);
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
					btnInit.setBounds(40, 400, 250, 65);//(40, 280, 100, 25);
					btnInit.setFont(f1);
					add(btnInit);
					btnInit.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							
							if(P_Two.logincheck==Frame.zero) {
							if(teamlist.getSelectedIndex()==-1)
							{
								
								teamwrite.teamlist(n);
								
								JOptionPane.showMessageDialog(null, "Success");
								
							}
							else {
									String n=teamlist.getSelectedItem();		
						teamwrite.teamlist(n);
						JOptionPane.showMessageDialog(null, "Success");
						
							}
							}
							
				     	if(P_Two.logincheck==Frame.one) {
				     		if(teamlist.getSelectedIndex()==-1)
							{
				     			System.out.println("로그인");
								
								teamwrite.editteam(n);
								JOptionPane.showMessageDialog(null, "Success");
								dispose();
							}
				     		else {
				     			System.out.println("로그인2");//?
									String n=teamlist.getSelectedItem();		
						teamwrite.editteam(n);
						JOptionPane.showMessageDialog(null, "Success");
						   
				     		}
				     	} 
				     	dispose();
					}
						
					});
					
		}
		
		@Override
		public void check() {}
		public static void addlist(String n) {
	
			team.add(n);
		}
	
}
