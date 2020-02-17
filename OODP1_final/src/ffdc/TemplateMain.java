package ffdc;

import javax.swing.JOptionPane;

public class TemplateMain {
	
	public static void main(String n3) {
		// 전사는 전투 준비를 위해서 
		// 체력을 단련하고, 검을 닦고, 갑옷을 입습니다.
		if (n3 == "Moderator"){
		TeamModerate teammoderate = new TeamModerate();
		teammoderate.flow();
		}
		// 궁사는 전투 준비를 위해서 
		// 체력을 단련하고, 활을 손질하고, 화살을 준비합니다.
		if (n3 == "Member"){
		TeamMember teammember = new TeamMember();
		teammember.flow();
		}
		if (n3 == null) {
			TeamMember teammember = new TeamMember();
		teammember.flow();
		}
	}

}
