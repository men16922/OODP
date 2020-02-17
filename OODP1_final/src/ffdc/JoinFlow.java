package ffdc;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//공동 추상 클래스 

public abstract class JoinFlow extends JFrame{
	 
	private JButton btnLogin;
	private JButton btnInit;
	private JTextField userText;
	private CardLayout cards = new CardLayout();
	private static int checkid=Frame.zero;
	private Font f1, f2, f3;
	private String n="미입력";
	//-------------------
	private JButton btnref;
	private static Set<String> team =  new TreeSet<String>();
    private JList list;
    private JoinFlow F;
  
	void flow(){
		team.clear();
		JFrame F1= new JFrame("Join Team Display");
		
	    setBackground(Color.LIGHT_GRAY);
	    setSize(950, 875);
	    F1.setLocation(400, 100);
	    setLayout(null);
	    
        first(F1);
	    JoinFlow0(F1);
		
		back(F1);
		if( isUsingPrepareOther() ){
			prepareOther();
		}
	}
	
	final void first(JFrame f){
	f1 = new Font("맑은 고딕", Font.PLAIN, 40);//15
	f2 = new Font("바탕", Font.BOLD, 50);//20
	f3 = new Font("굴림", Font.ITALIC, 75);//30
	
	setVisible(true);
	JLabel userLabel2 = new JLabel("Team Information");
	userLabel2.setBounds(40, 100, 1000, 100);//40,100,400,25
	userLabel2.setFont(f2);
	add(userLabel2);
	
	JLabel userLabel = new JLabel("Team");
	userLabel.setBounds(40, 250, 200, 65);//(40, 210, 80, 25);
	userLabel.setFont(f2);
	add(userLabel);
	}
	

	abstract void JoinFlow0(JFrame f);
	
	final void back(JFrame f){
		
		btnLogin = new JButton("Back");
		btnLogin.setBounds(415, 400, 250, 65);//(190, 280, 100, 25);
		btnLogin.setFont(f1); 		
		add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});

	}
	
	//팀원용 
    
	abstract void check();

	//팀장용 
	static void addlist(String n){}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	boolean isUsingPrepareOther(){
		return false;
	}

	// 다른 무언가가 필요하면 사용합니다.
	// isUsingPrepareOther 값에 의해 오버라이드 해서 사용 합니다.
	void prepareOther(){}


}
