package ffdc;

public class CommandControl {
	 Commandlist commandlist;
	 
	 public void setCommand(Commandlist commandlist) {
	  this.commandlist = commandlist;
	 }
	 
	 public void CommandPress() {
	  commandlist.execute();
	 }
	 public void CommandPress2() {
		 commandlist.execute2();
	 }
	 public void CommandPress3() {
		 commandlist.execute3();
	 }
	}


