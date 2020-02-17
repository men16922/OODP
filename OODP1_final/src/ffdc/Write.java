package ffdc;
import java.io.*;

import java.util.ArrayList;

import java.util.Iterator;

public class Write {


	
	public static void Text() {
		Iterator2 it = Frame.IDlist.iterator();
		
		ArrayList<String> set =  new ArrayList<String>();
      
		ArrayList<String> pass= new ArrayList<String>();
		ArrayList<String> pos= new ArrayList<String>();
		
		String IDdummy="";
		String PWdummy="";
    	String POdummy="";	
    		
    		try {
    			
    			File file = new File("ID.txt");
    			File file2 = new File("pass.txt");
    			File file3 = new File("position.txt");
    			while (it.hasNext()) {
    	    		IDs IDs = (IDs) it.next();
    	    		
    			BufferedWriter ID= new BufferedWriter(new FileWriter(file,true));
    			BufferedWriter PW= new BufferedWriter(new FileWriter(file2,true));
    			BufferedWriter PO= new BufferedWriter(new FileWriter(file3,true));
    			FileReader filereader= new FileReader(file);
				BufferedReader bufreader = new BufferedReader(filereader);
				FileReader filereader2= new FileReader(file2);
				BufferedReader bufreader2 = new BufferedReader(filereader2);
				FileReader filereader3= new FileReader(file3);
				BufferedReader bufreader3 = new BufferedReader(filereader3);
				String IDtxt="";
				String pas="";
			    String po="";
			    set.clear();
				pass.clear();
				pos.clear();
				
				while((pas=bufreader2.readLine()) != null)
				{
					pass.add(pas);
					
				}
				 while((IDtxt=bufreader.readLine()) !=null) {
    				set.add(IDtxt);
    	    			
    				
    			}
				 while((po=bufreader3.readLine()) != null)
					{
						pos.add(po);
						
					}
				pass.add(IDs.getPass());
    			set.add(IDs.getName());
    			pos.add(IDs.getPosition());
					
    			ID.close();
    			PW.close();
    			PO.close();
    			  bufreader.close();
    			  bufreader2.close();
    			  bufreader3.close();
    			}
    			Iterator<String> it2=set.iterator();
    			while(it2.hasNext()) {
    				String n=it2.next();
    				IDdummy+=n +"\r\n";
    			}
    			FileWriter IDs = new FileWriter("ID.txt");
    			
			    IDs.write(IDdummy);
			    IDs.close();
			   
			   Iterator<String> piIterator=pass.iterator();
			   while(piIterator.hasNext()) {
				 
			     String n2=piIterator.next();
			     PWdummy+= n2 + "\r\n";
				   				   			   }
			
			    FileWriter pw = new FileWriter("pass.txt");
    			pw.write(PWdummy);
    			pw.close();
			  
    		 
    		Iterator<String> Posi=pos.iterator();
			   while(Posi.hasNext()) {
				 
			     String n3=Posi.next();
			     POdummy+= n3 + "\r\n";
				   				   			   }
			
			    FileWriter p = new FileWriter("position.txt");
 			p.write(POdummy);
 			p.close();
			  
 		 }
		
    			catch(IOException e) {
    			
    							}	
					
			
				
		
		}

	 }

