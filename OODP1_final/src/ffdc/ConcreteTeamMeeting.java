package ffdc;
import javax.swing.JTextArea;

public class ConcreteTeamMeeting implements TeamMeeting {
	
	private static String temp;
	
	@Override
	public void printActivity(JTextArea textArea){
		//�޷� �޸� "�� Ȱ�� : " ��µǰ�
		temp = textArea.getText();
		textArea.setText("�� Ȱ�� : ");
	}
	
	public static String getTemp(){
		return temp;
	}
}
