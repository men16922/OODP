package ffdc;
import java.awt.*;
import javax.swing.JFrame;

public class Frame extends JFrame{
    private CardLayout cards = new CardLayout();
    static int current =0; 
    public static final int max =100;
    public static final int zero =0;
    public static final int one =1;
   static IDlist IDlist = new IDlist(max);
   static Datelist Datelist = new Datelist(max);
   static Infolist Infolist = new Infolist(max);
   static Checklist Checklist = new Checklist(max);
   
    public Frame(String title) {
    	super(title);
        setSize(950, 875);//380,350
        getContentPane().setLayout(cards);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
         
       getContentPane().add("One", new P_One(this));
       getContentPane().add("Two", new P_Two(this));
       getContentPane().add("Three", new P_Three(this)); 
       getContentPane().add("Join", new Joindisplay(this));
       getContentPane().add("Join2", new Joindisplay2(this));
        setVisible(true);
    }
     
    public void changePanel() {
        cards.next(this.getContentPane());
    }
    public CardLayout getCardLayout() {
    	 return cards;
    	}


    public static void main(String[] args)
    {
    	Frame F=new Frame("Team Management System");
	
	}
}

