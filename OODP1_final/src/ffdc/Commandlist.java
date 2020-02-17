package ffdc;

public class Commandlist implements Command{
 int year,month,day;
 String check;
  CheckWrite checkwrite;
  CheckRead checkread;
  public void getDate(int year, int month, int day, String check) {
	  this.year=year;
	  this.month=month;
	  this.day=day;
	  this.check=check;
  }
  public Commandlist(CheckWrite checkwrite, CheckRead checkread) {
	  
	  this.checkwrite=checkwrite;
	  this.checkread=checkread;
  }
  public void execute() {
	  checkwrite.Text();
  }
  public void execute2() {
	  CheckRead.editcheck(year, month, day, check);
	  checkwrite.Text();
  }
  public void execute3() {
	  CheckRead.readdate(year, month, day, check);
	  checkwrite.Text();
  }
}
