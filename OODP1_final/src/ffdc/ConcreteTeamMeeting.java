package ffdc;
import javax.swing.JTextArea;

public class ConcreteTeamMeeting implements TeamMeeting {
	
	private static String temp;
	
	@Override
	public void printActivity(JTextArea textArea){
		//달력 메모에 "팀 활동 : " 출력되게
		temp = textArea.getText();
		textArea.setText("팀 활동 : ");
	}
	
	public static String getTemp(){
		return temp;
	}
}
