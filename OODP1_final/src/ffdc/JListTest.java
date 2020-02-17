package ffdc;

import java.awt.*;
import javax.swing.*;


public class JListTest extends JFrame
{
	
	Container ctp;

	JScrollPane sp1;
	JScrollPane sp2;

	JList job1;
	JList job2;
	JList job3;

	
	Toolkit tk;
	Dimension screenSize;

	public JListTest()
	{
		super("JListTestTest");

		ctp = getContentPane();

		String[] data = {"Student", "Teacher", "Driver", "Computer Programmer", "Sales Man", "Musician" };
		job3 = new JList(data);

		sp2 = new JScrollPane(job3);	

		tk = Toolkit.getDefaultToolkit();		
		screenSize = tk.getScreenSize();	

	}

	public void makeGUI()
	{
		Font f1, f2, f3;

		f1 = new Font("맑은 고딕", Font.PLAIN, 40);//15
		f2 = new Font("굴림", Font.BOLD, 50);//20
		f3 = new Font("바탕", Font.ITALIC, 75);//30

	    setSize(950, 875);

		ctp.setLayout(null);
	    setBackground(Color.LIGHT_GRAY);

		sp2.setSize(500, 500);
		sp2.setLocation(200, 40);

		ctp.add(sp2);
		job3.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		job3.setFont(f1);

		setLocation(screenSize.width/2 - 150, screenSize.height/2 - 100);
		setVisible(true);
	}

	public static void main(String args[])
	{
		JListTest cbt = new JListTest();
		cbt.makeGUI();


	}
}