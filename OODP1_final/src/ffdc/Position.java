package ffdc;




interface PositionState{
	boolean IsItModerator();
}


public class Position {
	protected PositionState positionState;
	
private PositionState moderatorState = new PositionState(){	
	@Override
	public boolean IsItModerator(){
		
		return true;
	}
};

	private PositionState memberState = new PositionState(){
		@Override
		public boolean IsItModerator(){
		
			return false;
		}
	};

	private PositionState nobody = new PositionState(){
		@Override
		public boolean IsItModerator(){
			return false;
		}
	};
	
	
	public Position(String whatisstate){
		if (whatisstate.equals("Moderator")){
			positionState = moderatorState;
			//System.out.println("moderator�엫");
}
		else if (whatisstate.equals("Member"))
			positionState = memberState;
		else
			positionState = nobody;
	}
	
	public boolean IsItModerator(){
		return(positionState.IsItModerator());
	}
}
