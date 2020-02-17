package ffdc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MVCview {
	private Frame F;
	private JDialog jDialog4 = new JDialog(F, "Memo");
	private JButton jButton2 =new JButton("Save");
	private JTextField Jtxt2= new JTextField();
	private String memo;
	public static JTextArea testArea3 = new JTextArea();
   
	public void show() {
		 jDialog4.setSize(600,600);
		    jDialog4.setLayout(null);
		    jDialog4.setLocation(400, 300);
		    testArea3.setBounds(0,0,300,450);
		    Jtxt2.setBounds(300,0,300,450);
		   jDialog4.add(testArea3);
	       jDialog4.add(Jtxt2);
	       jDialog4.add(jButton2);
	       jButton2.setBounds(50, 450, 100, 100);
	       testArea3.setEditable(false);
	       jDialog4.setVisible(true);
	      
	     
	      
	      jButton2.addActionListener(new ActionListener() {
	      	   public void actionPerformed(ActionEvent arg0) {
	      	
	      		String memo2=Jtxt2.getText();
	      		 MVCPatter.show(memo2);
	      		 
	      		
	           }
	          });
	}
	   public void printmemoDetails(String memoname){
	   
		     this.memo=memoname;
		     
		     write(testArea3);
		    
	      
	   }
	   public void write(JTextArea testArea3) {
		  
		   testArea3.append(memo);
	   }
	}
