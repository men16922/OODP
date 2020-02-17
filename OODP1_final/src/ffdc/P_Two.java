package ffdc;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.*;


public class P_Two extends JPanel {

    private JButton btn1,btn2,btn3,btn4,btn5,btn6;
	private Font f1, f2, f3;
	private Buttonlist Buttonlist= new Buttonlist(2);
	private Buttonlist Buttonlist2= new Buttonlist(3);
    private Frame F;
    private JDialog jDialog = new JDialog(F, "Attendance date Input");
	private JDialog jDialog2 = new JDialog(F, "Team Profile");
	
	private JButton[] jbtn = new JButton[3];
	public static int logincheck=Frame.zero;
    private JButton jButton = new JButton("Clear");
    private JLabel[] jlb = new JLabel[3];
	private JTextField[] Jtxt = new JTextField[3];
	Iterator2 it = Frame.IDlist.iterator();
	static String yes;

	String number;
	 CommandControl cm = new CommandControl();
     CheckRead checkread = new CheckRead();	
	  CheckWrite checkwrite= new CheckWrite();
    Commandlist commandlist= new Commandlist(checkwrite, checkread);
	int number2;
	int year,month,day;
	
	LoginInformation loginInformation = LoginInformation.getInstance();
	
    public P_Two(Frame f) {
    	Buttonlist.addButtons(new Buttons("Click"));
		Buttonlist.addButtons(new Buttons("Exit"));
		
    	Buttonlist2.addButtons(new Buttons("Year"));
		Buttonlist2.addButtons(new Buttons("Month"));
		Buttonlist2.addButtons(new Buttons("Day"));
    	f1 = new Font("占쏙옙占쏙옙 占쏙옙占�", Font.PLAIN, 40);
		f2 = new Font("占쏙옙占쏙옙", Font.BOLD, 50);
		f3 = new Font("占쏙옙占쏙옙", Font.ITALIC, 75);

		setBackground(Color.GRAY);
        setSize(1200,1200);
        setLayout(null);
        
        F = f;
        loginInformation.setPosition("Moderator");
        
        jDialog.setLayout(new GridLayout(2,2));
        jDialog.setSize(600, 600);
        jDialog.setLocation(400,300);
        
        jDialog2.setLayout(null);
        jDialog2.setSize(600, 600);
        jDialog2.setLocation(400,300);
        
        
        jDialog2.add(jButton);
        
        int i=Frame.zero;
        int j=Frame.zero;
        
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
       
        
   
        
        JTextArea testArea =new JTextArea();
        JScrollPane scrollPane = new JScrollPane(testArea);
       
       
       
        scrollPane.setBounds(0,0,600,950);
        
        jButton.setBounds(50, 450, 100, 100);
        testArea.setEditable(false);
    
       jDialog2.add(scrollPane);
      
        
       jButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
           	testArea.setText(""); 	
        
            }
        });

   
       
        
        jbtn[0].addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
      		   number=Jtxt[0].getText();
      		   number2=Integer.parseInt(number);
      		   year=number2;
      		   number=Jtxt[1].getText();
    		   number2=Integer.parseInt(number);
    		   
    		   if(number2 > 0 && number2 <13){
    			   month=number2;
    		   }
    		   else{
    			   JOptionPane.showMessageDialog(null, "Failed" );
    		   }
    		   
    		   number=Jtxt[2].getText();
      		   number2=Integer.parseInt(number);
      		   if(number2 > 0 && number2<=31){
      			   day=number2;
      			   number="o";
      			 commandlist.getDate(year,month,day,number);
          		  cm.setCommand(commandlist);
          		  cm.CommandPress2();
      			 
      		  }      			
      		   else{
      			   JOptionPane.showMessageDialog(null, "Failed" );
      		   }
        	}
        });
        
        jbtn[1].addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
      		jDialog.dispose();
            }
        });

       btn1 = new JButton("1. View Profile");
       btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	jDialog2.setVisible(true);
            	Read.readprofile(testArea);
            	System.out.println(loginInformation.getPosition());
            }
       });
       btn1.setBounds(20, 35, 600, 60);
       btn1.setFont(f1);
       add(btn1);

       btn2 = new JButton("2. Attendace Check");
       btn2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
          	 jDialog.setVisible(true); 	 
           }
       });
        
       btn2.setBounds(20, 115, 600, 60);
       btn2.setFont(f1);
       add(btn2);
       
       btn3 = new JButton("3. Create Event");
       btn3.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {
             	F.getCardLayout().show(F.getContentPane(), "Three");     	
              }
          });
       btn3.setBounds(20, 195, 600, 60);
       btn3.setFont(f1);
       add(btn3);
          
       btn4 = new JButton("4. View Calendar");
       btn4.addActionListener(new ActionListener() {
    	   public void actionPerformed(ActionEvent arg0) {
       Calendar calendar = Calendar.getInstance();
    		   
    		   int year = calendar.get(Calendar.YEAR);
    		   int month = calendar.get((Calendar.MONTH)+1);
    		   
    		   MemoCalendar cal = new MemoCalendar();
           }
       });
       btn4.setBounds(20, 275, 600, 60);
       btn4.setFont(f1);
       add(btn4);
           
       btn5 = new JButton("5. LogOut");
       btn5.addActionListener(new ActionListener() {
    	   public void actionPerformed(ActionEvent arg0) {
    		   Datelist Datelist = new Datelist(Frame.max);
    		   Checklist Checklist = new Checklist(Frame.max);
    		   Frame.Datelist = Datelist;
    		   Frame.Checklist =Checklist;
    	

    		   F.getCardLayout().show(F.getContentPane(), "One");
    	   }
       });
       btn5.setBounds(20, 355, 600, 60);
       btn5.setFont(f1);
       add(btn5);
       
       btn6 = new JButton("6. Setting");
       btn6.addActionListener(new ActionListener() {
    	   public void actionPerformed(ActionEvent arg0) {
 
   		    	Setting setting = new Setting();
   		 
    	   }
       });
       btn6.setBounds(20, 435, 600, 60);
       btn6.setFont(f1);
       add(btn6);

    
    
    }
}
    

