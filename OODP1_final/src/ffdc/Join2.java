package ffdc;

import java.io.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Join2 {

	public static void join(String userText, String userText2) {
		
		ArrayList<String> Name= new ArrayList<String>();
		ArrayList<String> Stnr= new ArrayList<String>();
		try {
			File file = new File("name.txt");
			File file2 = new File("stnr.txt");
			FileReader filereader= new FileReader(file);
			BufferedReader bufreader = new BufferedReader(filereader);
			FileReader filereader2= new FileReader(file2);
			BufferedReader bufreader2 = new BufferedReader(filereader2);
			Name.clear();
			Stnr.clear();
			String line="";
			String line2="";
		 while((line=bufreader.readLine()) !=null) {
 				Name.add(line);
 						 					
 			}
		 while((line2=bufreader2.readLine()) !=null) {
				Stnr.add(line2);
						 					
			}
			 bufreader.close();
			 bufreader2.close();
			 Iterator<String> it=Name.iterator();
			 Iterator<String> it2=Stnr.iterator();
			
			 while(it.hasNext()) {
				    String n=it.next();
				    String n2=it2.next();
				 if(n.equals(userText) || n2.equals(userText2))
				 {
					 Joindisplay2.check();
					 
					 }
				
			}
			 
			 
		}
		catch(IOException e) {
		}
	}
public static void join2(String userText4) {
		
		ArrayList<String> Phone= new ArrayList<String>();
		
		try {
			File file = new File("phone.txt");
			
			FileReader filereader= new FileReader(file);
			BufferedReader bufreader = new BufferedReader(filereader);
			
			Phone.clear();
			
			String line="";
			
		 while((line=bufreader.readLine()) !=null) {
 				Phone.add(line);
 						 					
 			}
		 
			 bufreader.close();
			 
			 Iterator<String> it=Phone.iterator();
			 
			
			 while(it.hasNext()) {
				    String n=it.next();
				    
				 if(n.equals(userText4))
				 {
					 Joindisplay2.check();
					 
					 }
				
			}
			 
			 
		}
		catch(IOException e) {
		}
	}
public static void join3(String userText) {
	
	Set<String> team =  new TreeSet<String>();
	
	try {
		File file = new File("team.txt");
		
		FileReader filereader= new FileReader(file);
		BufferedReader bufreader = new BufferedReader(filereader);
		
		team.clear();
		
		String line="";
		
	 while((line=bufreader.readLine()) !=null) {
				team.add(line);
						 					
			}
	 
		 bufreader.close();
		 
		 Iterator<String> it=team.iterator();
		 
		
		 while(it.hasNext()) {
			    String n=it.next();
			    
			 if(n.equals(userText))
			 {
				
				 
				 }
			
		}
		 
		 
	}
	catch(IOException e) {
	}
}
	
}