package ffdc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.*;

public class P_One extends JPanel {
	
    private Frame F;
    Iterator2 it = Frame.IDlist.iterator();
 
	private JButton btnLogin;
	private JButton btnInit;
	private JPasswordField passText;
	private JTextField userText;
	public static boolean bLoginCheck;
	private Font f1, f2, f3;
	public static String ID;
	private static int count;
	
	LoginInformation loginInformation = LoginInformation.getInstance();
	SingletonUser singletonUser = SingletonUser.getInstance();
	User user;
	
	public static void main(String[] args) {
		//new LoginView();
	}

    public P_One(Frame f) {
    	
        setBackground(Color.LIGHT_GRAY);
        setSize(380, 350);
        f.setLocation(800, 450);
        setLayout(null);
      
        F = f;
       
        f1 = new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 40);//15
		f2 = new Font("±º∏≤", Font.BOLD, 50);//20
		f3 = new Font("πŸ≈¡", Font.ITALIC, 75);//30

		setVisible(true);
		JLabel userLabel3= new JLabel(new ImageIcon("C:\\Users\\Administrator.USER-1512112321\\Documents\\ƒ´ƒ´ø¿≈Â πﬁ¿∫ ∆ƒ¿œ\\∞¥√º¡ˆ«‚º≥∞Ë∆–≈œ_final_iteration\\OODP1_fi (3) (3)_final iteration code\\OODP1_fi (3)\\h12.jpg"));
        userLabel3.setBounds(40, 100, 705, 380);
        add(userLabel3);
		
		JLabel userLabel2 = new JLabel("Team Management System");
		userLabel2.setBounds(40, 0, 1000, 100);//40,100,400,25
		userLabel2.setFont(f2);
		add(userLabel2);
		
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(40, 500, 200, 65);//(40, 210, 80, 25);
		userLabel.setFont(f2);
		add(userLabel);
		
		JLabel passLabel = new JLabel("Pass");
		passLabel.setBounds(40, 590, 200, 65);//(40, 240, 80, 25);
		passLabel.setFont(f2);
		add(passLabel);
		
		userText = new JTextField(20);
		userText.setBounds(190, 500, 400, 65);//(100, 210, 160, 25);
		userText.setFont(f2);
		add(userText);
		
		passText = new JPasswordField(20);
		passText.setBounds(190, 590, 400, 65);//(100, 240, 160, 25);
		passText.setFont(f2);
		add(passText);
		
        btnInit = new JButton("Register");
		btnInit.setBounds(40, 700, 250, 65);//(40, 280, 100, 25);
		btnInit.setFont(f1);
		add(btnInit);
		
		btnInit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				F.getCardLayout().show(F.getContentPane(), "Join");
			}
		});
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(415, 700, 250, 65);//(190, 280, 100, 25);
		btnLogin.setFont(f1);
		add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck();
			}
		});
	}
    
    public void setCount(){
    	this.count =0;
    }
    
    public void isLoginCheck(){
    	setCount();
    	Read.readtext(userText.getText(), passText.getPassword());
    	
    	if(loginInformation.getPosition().equals("Moderator") || loginInformation.getPosition().equals("Member")
    			||loginInformation.getPosition().equals("")){
    		user = UserFactory.CreateUser(loginInformation.getPosition());
    		user.showMessage();
    		bLoginCheck = true;
    	}
    	singletonUser.setUser(user);
		    	
    	if(isLogin()){
    		ID=userText.getText();
    		
    		F.getCardLayout().show(F.getContentPane(), "Two");
    	    bLoginCheck =false;
    	}					    	
    	else{
    		JOptionPane.showMessageDialog(null, "Faild");
    	}
    }
    
    public boolean isLogin() {		
		return bLoginCheck;
	}
    
    public static void logincheck() {
    	JOptionPane.showMessageDialog(null, "Login Success");
    }
}