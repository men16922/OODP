package ffdc;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {
	 
    public static void main(String[] args) {
    	Leaf leaf1 = new Leaf("1. 팀모임");
        Leaf leaf2 = new Leaf("2. 10만원 프로젝트");
        Leaf leaf3 = new Leaf("3. 워크듀티");
        Leaf leaf4 = new Leaf("4. BBQ");
        Leaf leaf5 = new Leaf("5. 팀 특송");
        Leaf leaf6 = new Leaf("6. 내용 수정");
        
        String s[] = new String[6];
              
        Composite composite1 = new Composite();
        
        composite1.add(leaf1);
        composite1.add(leaf2);
        composite1.add(leaf3);
        composite1.add(leaf4);
        composite1.add(leaf5);
        composite1.add(leaf6);
        
        composite1.show();
        
        s[0] = leaf1.name;
        s[1] = leaf2.name;
        s[2] = leaf3.name;
        s[3] = leaf4.name;
        s[4] = leaf5.name;
        s[5] = leaf6.name;  
    }
}