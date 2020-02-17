package ffdc;

import javax.swing.JTextArea;
public class ConcreteDeco4 extends TeamMeetingDeco{


	public ConcreteDeco4(TeamMeeting teamMeeting){
		super(teamMeeting);
	}
	
	@Override
	public void printActivity(JTextArea memoArea){
		super.printActivity(memoArea);
		memoArea.append("  <<BBQ>> ");
		memoArea.append("\n-------------------------------------------------------------------\n");
		memoArea.append(ConcreteTeamMeeting.getTemp());
	}
}