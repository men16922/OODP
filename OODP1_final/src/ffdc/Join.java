package ffdc;
import java.io.*;

import java.util.ArrayList;
import java.util.Iterator;
public class Join {

	public static void join(String userText) {
		
		ArrayList<String> ID= new ArrayList<String>();
		try {
			File file = new File("ID.txt");
			
			FileReader filereader= new FileReader(file);
			BufferedReader bufreader = new BufferedReader(filereader);
			ID.clear();
			String line="";
		 
			while((line=bufreader.readLine()) !=null) {
 				ID.add(line);
 			}
			bufreader.close();
			 
			Iterator<String> it=ID.iterator();
		
			while(it.hasNext()) {
				String n=it.next();
				if(n.equals(userText)){
					Joindisplay.check();
				}
			} 
		}
		catch(IOException e) {
		}
	}
}