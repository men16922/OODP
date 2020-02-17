package ffdc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TeamDialog extends JFrame{
	
	public TeamDialog(JTextArea memoArea){
		JButton jbtn[] = new JButton[6];
		
		//JButton btn1,btn2,btn3,btn4,btn5,btn6;
		JPanel p = new JPanel();
		String[] s = new String[6];
		
		Leaf leaf1 = new Leaf("1. ������");
        Leaf leaf2 = new Leaf("2. 10���� ������Ʈ");
        Leaf leaf3 = new Leaf("3. ��ũ��Ƽ");
        Leaf leaf4 = new Leaf("4. BBQ");
        Leaf leaf5 = new Leaf("5. �� Ư��");
        Leaf leaf6 = new Leaf("6. ���� ����");
              
        Composite composite1 = new Composite();
        
        composite1.add(leaf1);
        composite1.add(leaf2);
        composite1.add(leaf3);
        composite1.add(leaf4);
        composite1.add(leaf5);
        composite1.add(leaf6); 
       
        composite1.show();
        
        s[0] = leaf1.name;
        s[1] = leaf2.name;
        s[2] = leaf3.name;
        s[3] = leaf4.name;
        s[4] = leaf5.name;
        s[5] = leaf6.name;        
           
        
        for(int i=0; i<6 ; i++){
			jbtn[i] = new JButton(s[i]);
		} 
        
		/* btn1 = new JButton("1.������");
		btn2 = new JButton("2. 10���� ������Ʈ");
		btn3 = new JButton("3. ��ũ��Ƽ");
		btn4 = new JButton("4. BBQ");
		btn5 = new JButton("5. �� Ư��");
		btn6 = new JButton("6. ���� ����"); */

		ActionListener handler = new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				TeamMeeting teamMeeting = new ConcreteTeamMeeting(); 
            
							
				
			
				
				if (e.getActionCommand().equals("1. ������"))
					teamMeeting = new ConcreteDeco1(teamMeeting);
				
				else if(e.getActionCommand().equals("2. 10���� ������Ʈ"))
					teamMeeting = new ConcreteDeco2(teamMeeting);
				
				else if(e.getActionCommand().equals("3. ��ũ��Ƽ"))
					teamMeeting = new ConcreteDeco3(teamMeeting);
				
				else if(e.getActionCommand().equals("4. BBQ"))
					teamMeeting = new ConcreteDeco4(teamMeeting);
				
				else if(e.getActionCommand().equals("5. �� Ư��"))
					teamMeeting = new ConcreteDeco5(teamMeeting);
				
				else if(e.getActionCommand().equals("6. ���� ����"))
					teamMeeting = new ConcreteDeco6(teamMeeting);
				
				teamMeeting.printActivity(memoArea);
			}
		};
		
		for(int i=0; i<6; i++){
		
		jbtn[i].addActionListener(handler);
		p.add(jbtn[i]);
		}
		
		/*btn1.addActionListener(handler);
		btn2.addActionListener(handler);
		btn3.addActionListener(handler);
		btn4.addActionListener(handler);
		btn5.addActionListener(handler);
		btn6.addActionListener(handler);

		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6); */
		
		
		add(p);
		pack();
		
		setLocation(400,400);
		setVisible(true);
	}


}
