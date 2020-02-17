package ffdc;

import java.awt.*;

import javax.swing.JButton;


public class ConcretePrototypeLabel implements Prototype, Cloneable{
	private Object Font;
	private Font f1, f2, f3;
	
    
    public ConcretePrototypeLabel(Font f){
        	this.Font = f; 
    }
       
    
    public void setFont(Font f, JButton button) {
            this.Font = f;
            button.setFont(f);
    }
    
    public ConcretePrototypeLabel clone() throws CloneNotSupportedException {
        return (ConcretePrototypeLabel) super.clone();
    }
 
}
     


   