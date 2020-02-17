package ffdc;

import javax.swing.JTextArea;
public class ConcreteDeco3 extends TeamMeetingDeco{


	public ConcreteDeco3(TeamMeeting teamMeeting){
		super(teamMeeting);
	}
	
	@Override
	public void printActivity(JTextArea memoArea){
		super.printActivity(memoArea);
		memoArea.append("  <<¿öÅ© µàÆ¼>> ");
		memoArea.append("\n-------------------------------------------------------------------\n");
		memoArea.append(ConcreteTeamMeeting.getTemp());
	}
}