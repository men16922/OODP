package ffdc;
import javax.swing.JTextArea;
public class ConcreteDeco1 extends TeamMeetingDeco {
	
	public ConcreteDeco1(TeamMeeting teamMeeting){
		super(teamMeeting);
	}
	
	public void printActivity(JTextArea memoArea){
		super.printActivity(memoArea);
		memoArea.append("  <<ÆÀ¸ðÀÓ>> ");
		memoArea.append("\n-------------------------------------------------------------------\n");
		memoArea.append(ConcreteTeamMeeting.getTemp());
	}
}
