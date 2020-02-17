package ffdc;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



import ffdc.Frame;

public class P_Three extends JPanel {
	private Buttonlist Buttonlist= new Buttonlist(2);
	private Buttonlist Buttonlist2= new Buttonlist(3);
	
	private JButton[] jbtn = new JButton[4];
	private JLabel[] jlb = new JLabel[6];
	private JTextField[] Jtxt = new JTextField[6];
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    private Frame F;
    private Font f1,f2,f3,f4;
	private JDialog jDialog = new JDialog(F, "Team date Input");
	private JDialog jDialog2 = new JDialog(F, "Team date Input");
	private JDialog jDialog3 = new JDialog(F, "Attendance checklist");
	String number;
	
	public static String[] n1= new String[Frame.max];
	private JButton jButton = new JButton("Clear");
	 CheckRead checkread = new CheckRead();	
	  CheckWrite checkwrite= new CheckWrite();
     Commandlist commandlist= new Commandlist(checkwrite, checkread);
     CommandControl cm = new CommandControl();
	int number2;
	int year,month,day;
	static int i=0;
	Skin skin = new Skin();
	
	ConcretePrototypeLabel aFont = new ConcretePrototypeLabel(f4);
		
	
    public P_Three(Frame f) {	 
    	
    	int i=Frame.zero;
        int j=Frame.zero;
    
    	Buttonlist.addButtons(new Buttons("Click"));
    	Buttonlist.addButtons(new Buttons("Exit"));
    		
    	Buttonlist2.addButtons(new Buttons("Year"));
    	Buttonlist2.addButtons(new Buttons("Month"));
    	Buttonlist2.addButtons(new Buttons("Day"));
  
    	f1 = new Font("¸¼Àº °íµñ", Font.PLAIN, 40);
		f2 = new Font("±¼¸²", Font.BOLD, 50);
		f3 = new Font("¹ÙÅÁ", Font.ITALIC, 75);
		f4 = new Font("°íµñ",Font.ITALIC,50);
       setBackground(Color.GRAY);
       setSize(1200,1200);
       setLayout(null);
          
       
       F = f;
       jDialog.setLayout(new GridLayout(2,2));
       jDialog.setSize(600, 600);
       jDialog3.setLayout(null);
       jDialog3.setSize(600, 600);
       jDialog3.setLocation(400,300);
       jDialog3.add(jButton);
       JTextArea testArea =new JTextArea();
       JTextArea testArea2 =new JTextArea();
       JScrollPane scrollPane = new JScrollPane(testArea);
       JScrollPane scrollPane2 = new JScrollPane(testArea2);
       scrollPane.setBounds(0,0,300,450);
       scrollPane2.setBounds(300,0,300,450);
       jButton.setBounds(50, 450, 100, 100);
       jDialog3.add(scrollPane);
       jDialog3.add(scrollPane2);
       jButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
           	testArea.setText(""); 	
           	
            }
        });
       for(Iterator2 it = Buttonlist2.iterator();it.hasNext();) {
    	   Buttons Buttons = (Buttons) it.next();
         	jDialog.add(jlb[j]= new JLabel(Buttons.getName()));
         	jlb[j].setFont(f1);
         	Jtxt[j]=new JTextField("");
         	Jtxt[j].setFont(f1);
         	jDialog.add(Jtxt[j]);
         	j++;
       }
     
       for(Iterator2 it = Buttonlist.iterator();it.hasNext();) {
           
      		Buttons Buttons = (Buttons) it.next();
          	jDialog.add(jbtn[i]= new JButton(Buttons.getName()));
          	jbtn[i].setFont(f1);
          	i++;
          	
          }
       
       jDialog2.setLayout(new GridLayout(2,2));
       jDialog2.setSize(600, 600);
       
     
       for(Iterator2 it = Buttonlist2.iterator();it.hasNext();) {
    	   Buttons Buttons = (Buttons) it.next();
         	jDialog2.add(jlb[j]= new JLabel(Buttons.getName()));
         	jlb[j].setFont(f1);
         	Jtxt[j]=new JTextField("");
         	Jtxt[j].setFont(f1);
         	jDialog2.add(Jtxt[j]);
         	j++;
       }     
        	
   	for(Iterator2 it2 = Buttonlist.iterator();it2.hasNext();) {
           
   		Buttons Buttons = (Buttons) it2.next();
       	jDialog2.add(jbtn[i]= new JButton(Buttons.getName()));
       	jbtn[i].setFont(f1);
       	i++;
       	
       } 
       jDialog.setLocation(400,300);
       jDialog2.setLocation(400,300);
       jbtn[0].addActionListener(new ActionListener() {
      	   public void actionPerformed(ActionEvent arg0) {
      		
      		 number=Jtxt[0].getText();
    		   year=Integer.parseInt(number);
    		 
    		   Integer.parseInt(number);
    		   number=Jtxt[1].getText();
    		   number2=Integer.parseInt(number);
    		
    		   if(number2>0 && number2<13){
    			   month=number2;}
    		   else{
    			   JOptionPane.showMessageDialog(null, "Failed" );
    		   }
    		   number=Jtxt[2].getText();
    		   number2=Integer.parseInt(number);
    		   if(number2>0 && number2<=31){
         			day=number2;
         			   			
   		      
   		      	
      		   }
    		  number="x";
    		  commandlist.getDate(year,month,day,number);
    		  cm.setCommand(commandlist);
    		  cm.CommandPress3();
    		  
      	   }  
       });     	   
      	   
       jbtn[1].addActionListener(new ActionListener() {
      	   public void actionPerformed(ActionEvent arg0) {
      		jDialog.dispose();
      		
           }
          });
       
       jbtn[2].addActionListener(new ActionListener() {
     	   public void actionPerformed(ActionEvent arg0) {
     		  
     		  number=Jtxt[3].getText();
     		  number2=Integer.parseInt(number);
     		  year=number2;
     		  number=Jtxt[4].getText();
     		  number2=Integer.parseInt(number);
     		  if(number2>0 && number2<13) {
       			   month=number2;
       		   }
       		   else{
       			   JOptionPane.showMessageDialog(null, "Failed" );
       		   }
       			number=Jtxt[5].getText();
       		   	number2=Integer.parseInt(number);
         		if(number2>0 && number2<=31){
         			day=number2;
         			number="x";
         			
         			commandlist.getDate(year,month,day,number);
          		  cm.setCommand(commandlist);
          		  cm.CommandPress2();
         		}
         		else{
    			   JOptionPane.showMessageDialog(null, "Failed" );
    		   }
         		                 	   }
	  });
       jbtn[3].addActionListener(new ActionListener() {
      	   public void actionPerformed(ActionEvent arg0) {
      	
      		jDialog2.dispose();
      		
           }
          });
       
       btn1 = new JButton("1. Attendace Checklist");
       btn1.addActionListener(new ActionListener() {
    	   public void actionPerformed(ActionEvent arg0) {
    		   jDialog3.setVisible(true);
    		   
    		   CheckRead.readtext(testArea, testArea2);
    		   
    		
            }
        });
        btn1.setBounds(20, 35, 600, 60);
        btn1.setFont(f1);
        add(btn1);
        
        btn2 = new JButton("2. Create Attendance Check");
        btn2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {
            	 jDialog.setVisible(true);
             }
         });
         btn2.setBounds(20, 115, 600, 60);
         btn2.setFont(f1);
         add(btn2);
        
         btn3 = new JButton("3. Cancel Attendance Check");
         btn3.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent arg0) {
            	  jDialog2.setVisible(true);
            	              	  
              }
         });
         btn3.setBounds(20, 195, 600, 60);
         btn3.setFont(f1);
         add(btn3);
         btn4 = new JButton("4. Memo");
         btn4.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent arg0) {
        		 MVCview mvc= new MVCview();
         		mvc.show();
        		 
        	 }
         });
         btn4.setBounds(20, 275, 600, 60);
         btn4.setFont(f1);
         add(btn4);
         
         btn5 = new JButton("5. Skin On");
         btn5.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent arg0) {
        		 	if(skin.skinOn());
        		 		{
        		 			changeBlue();
        		 	 	  Prototype tmp = null;
      					try {
      						tmp = aFont.clone();
      					} catch (CloneNotSupportedException e) {
      						e.printStackTrace();
      					}
      					    tmp.setFont(f4, btn5);
      					
        		 		}
        	
        		 		
        		 		
        	 }
         });
          
         btn5.setBounds(20, 355, 600, 60);
         btn5.setFont(f4);
         add(btn5);
            
         btn6 = new JButton("6. Skin Off");
         btn6.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent arg0) {
        		 	if(skin.skinOff());
        		 		{
        		 			changeOriginal();
        		 			  Prototype tmp = null;
            					try {
            						tmp = aFont.clone();
            					} catch (CloneNotSupportedException e) {
            						e.printStackTrace();
            					}
            					    tmp.setFont(f4, btn6);
              		 		}
        		 		
        	 }
         });
          
         btn6.setBounds(20, 435, 600, 60);
         btn6.setFont(f4);
         add(btn6);
         
         btn7 = new JButton("7. Back to Main menu");
         btn7.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent arg0) {
        		 F.getCardLayout().show(F.getContentPane(), "Two");
        	 }
         });
         
         btn7.setBounds(20, 515, 600,60);
         btn7.setFont(f1);
         add(btn7);
         
         setVisible(true);
    }

	public void changeBlue(){
		setBackground(Color.BLUE);
	}
	public void changeOriginal(){
		setBackground(Color.GRAY);
	}
    public static void getID() {
    	//n1[i]=n;
    	i++;
    	JOptionPane.showMessageDialog(null, n1);
    }
}
    


