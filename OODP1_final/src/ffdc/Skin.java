package ffdc;


import javax.swing.JOptionPane;


public class Skin {
	protected SkinState skinState;
	
	
	private SkinState offState = new SkinState(){
		@Override
		public boolean skinOn(){
			JOptionPane.showMessageDialog(null, "스킨 적용" );
			skinState = onState;
			
			
			return true;
		}
		@Override
		public boolean skinOff(){
			JOptionPane.showMessageDialog(null, "이미 꺼져있습니다." );
			return false;
		}
	};
	
	private SkinState onState = new SkinState(){
		@Override
		public boolean skinOn(){
			JOptionPane.showMessageDialog(null, "이미 켜져있습니다." );
			return false;
		}
		public boolean skinOff(){
			JOptionPane.showMessageDialog(null, "스킨 해제" );
			skinState = offState;
			return true;
		}
	};
	
	public Skin(){
		skinState = offState;
	}
	
	public boolean skinOn(){
		return(skinState.skinOn());
	}
	
	public boolean skinOff(){
		return(skinState.skinOff());
	}
}
interface SkinState{
	boolean skinOn();
	boolean skinOff();
}