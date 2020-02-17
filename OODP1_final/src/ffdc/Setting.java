package ffdc;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Setting extends JFrame{
    private JButton btn1,btn2,btn3,btnLogin;
	private Font f1, f2, f3;
	private Buttonlist Buttonlist= new Buttonlist(2);
	private Buttonlist Buttonlist2= new Buttonlist(3);
    private Frame F;
    static String position;
	public static int logincheck=Frame.zero;

    public Setting() {
		
    	JFrame F1= new JFrame("Setting");
		
	    setBackground(Color.LIGHT_GRAY);
	    setSize(950, 875);
	    F1.setLocation(400, 100);
	    
        setLayout(null);
	    first(F1);
                
        
    }
    
	final void first(JFrame f){
	f1 = new Font("맑은 고딕", Font.PLAIN, 40);//15
	f2 = new Font("�ü�", Font.BOLD, 50);//20
	f3 = new Font("����", Font.ITALIC, 75);//30
	
	Position thisPosition = new Position(position);
    if(thisPosition.IsItModerator())	//moderator
    	{
        btn1 = new JButton("1. Manage team member");
        btn1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {

            	 JListTest.main(null);
             }
        });
        btn1.setBounds(20, 35, 600, 60);//(20, 35, 113, 23);
        btn1.setFont(f1);
        add(btn1);
    	}
    else
    {
    	btn2 = new JButton("1. Team Edit");
    	btn2.setBounds(20, 500, 600, 60);//(20, 210, 113, 23);
    	btn2.setFont(f1);
           add(btn2);
           btn2.addActionListener(new ActionListener() {
        	   public void actionPerformed(ActionEvent arg0) {
        		  logincheck=Frame.one;
        		  String n=null;
        		  TemplateMain.main(n);
        	   }
           });
         
        btn2.setBounds(20, 35, 600, 60);//(20, 70, 113, 23);
        btn2.setFont(f1);
        add(btn2);
    }
	
	setVisible(true);
    
	btnLogin = new JButton("Back");
	btnLogin.setBounds(20, 115, 600, 60);//(190, 280, 100, 25);
	btnLogin.setFont(f1); 		
	add(btnLogin);
	btnLogin.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	});


	}

}
