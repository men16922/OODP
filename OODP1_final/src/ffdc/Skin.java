package ffdc;


import javax.swing.JOptionPane;


public class Skin {
	protected SkinState skinState;
	
	
	private SkinState offState = new SkinState(){
		@Override
		public boolean skinOn(){
			JOptionPane.showMessageDialog(null, "��Ų ����" );
			skinState = onState;
			
			
			return true;
		}
		@Override
		public boolean skinOff(){
			JOptionPane.showMessageDialog(null, "�̹� �����ֽ��ϴ�." );
			return false;
		}
	};
	
	private SkinState onState = new SkinState(){
		@Override
		public boolean skinOn(){
			JOptionPane.showMessageDialog(null, "�̹� �����ֽ��ϴ�." );
			return false;
		}
		public boolean skinOff(){
			JOptionPane.showMessageDialog(null, "��Ų ����" );
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