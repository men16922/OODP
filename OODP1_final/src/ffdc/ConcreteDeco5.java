package ffdc;

import javax.swing.JTextArea;
public class ConcreteDeco5 extends TeamMeetingDeco{


	public ConcreteDeco5(TeamMeeting teamMeeting){
		super(teamMeeting);
	}
	
	@Override
	public void printActivity(JTextArea memoArea){
		super.printActivity(memoArea);
		memoArea.append("  <<ÆÀ Æ¯¼Û>> ");
		memoArea.append("\n-------------------------------------------------------------------\n");
		memoArea.append(ConcreteTeamMeeting.getTemp());
	}
}