package ffdc;

import javax.swing.JTextArea;
abstract public class TeamMeetingDeco implements TeamMeeting {
	
	//protected String temp;
	private TeamMeeting teamMeeting;
	
	
	public TeamMeetingDeco(TeamMeeting teamMeeting){
		super();
		this.teamMeeting=teamMeeting;
	}
	
	@Override
	public void printActivity(JTextArea memoArea){
		//<< ÆÀ ¸ðÀÓ >>, <<BBQ>> µî
		teamMeeting.printActivity(memoArea);
	}
}
