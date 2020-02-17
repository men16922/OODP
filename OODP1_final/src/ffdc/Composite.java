package ffdc;

import java.util.ArrayList;
import java.util.List;
 
public class Composite implements Component {
 
	public static List<Component> childComponents = new ArrayList<Component>();

    public void add(Component component) {
        childComponents.add(component);
    }
    
    public void show() {
        for (Component component : childComponents) {
            component.show();
        }
    }
 
}

