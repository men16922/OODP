package ffdc;

public class StrategyMain
{ 
	public static int icheck=0;
	public static void main(String[] args) 
	{}
	public static void strategy() {
		StrategyMake att = new StrategyMake(new BadBehavior()); 
		if(icheck==0) {
			att.fight(); 
		}
		if(icheck==1) {
			att.setWeapon(new GoodBehavior());
			att.fight(); 
		}
	}
}
