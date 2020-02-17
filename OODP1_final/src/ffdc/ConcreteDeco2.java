package ffdc;

import javax.swing.JTextArea;
public class ConcreteDeco2 extends TeamMeetingDeco{


	public ConcreteDeco2(TeamMeeting teamMeeting){
		super(teamMeeting);
	}
	
	@Override
	public void printActivity(JTextArea memoArea){
		super.printActivity(memoArea);
		memoArea.append("  <<10만원 프로젝트>> ");
		memoArea.append("\n-------------------------------------------------------------------\n");
		memoArea.append(ConcreteTeamMeeting.getTemp());
	}
}
