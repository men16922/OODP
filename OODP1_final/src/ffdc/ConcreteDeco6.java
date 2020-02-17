package ffdc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextArea;

public class ConcreteDeco6 extends TeamMeetingDeco{
	
	public ConcreteDeco6(TeamMeeting teamMeeting){
		super(teamMeeting);
	}
	
	@Override
	public void printActivity(JTextArea memoArea){
		memoArea.setText(memoArea.getText());
	}
}
