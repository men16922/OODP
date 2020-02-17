package ffdc;

public class StrategyMake {
	private StrategyShow Attendance;
	
	public StrategyMake(StrategyShow Attendance) {
		this.Attendance = Attendance;
	}
	
	public void fight(){
		Attendance.attack();
	}
	
	public void setWeapon(StrategyShow Attendance)
	{
		this.Attendance = Attendance;
	}
}


