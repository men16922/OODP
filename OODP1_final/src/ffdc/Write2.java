package ffdc;
import java.io.*;
import java.util.ArrayList;


import java.util.Iterator;

public class Write2 {


	
	public static void Text() {
		Iterator2 it = Frame.Infolist.iterator();
		
		ArrayList<String> Name =  new ArrayList<String>();
		ArrayList<String> Stnr =  new ArrayList<String>();
		ArrayList<String> Birth= new ArrayList<String>();
		ArrayList<String> Phone= new ArrayList<String>();
		
		String Ndummy="";
		String Sdummy="";
    	String Bdummy="";
    	String Pdummy="";
    		
    		try {
    			File file = new File("name.txt");
    			File file2 = new File("stnr.txt");
    			File file3 = new File("birth.txt");
    			File file4 = new File("phone.txt");
    			while (it.hasNext()){
    				PersonInfo temp =(PersonInfo) it.next();
    			BufferedWriter Na= new BufferedWriter(new FileWriter(file,true));
    			BufferedWriter St= new BufferedWriter(new FileWriter(file2,true));
    			BufferedWriter Bi= new BufferedWriter(new FileWriter(file3,true));
    			BufferedWriter Ph= new BufferedWriter(new FileWriter(file4,true));
    			FileReader filereader= new FileReader(file);
				BufferedReader bufreader = new BufferedReader(filereader);
				FileReader filereader2= new FileReader(file2);
				BufferedReader bufreader2 = new BufferedReader(filereader2);
				FileReader filereader3= new FileReader(file3);
				BufferedReader bufreader3 = new BufferedReader(filereader3);
				FileReader filereader4= new FileReader(file4);
				BufferedReader bufreader4 = new BufferedReader(filereader4);
				String Ntxt="";
				String Stxt="";
			    String Btxt="";
			    String Ptxt="";
				Name.clear();
				Stnr.clear();
				Birth.clear();
				Phone.clear();
				
				
				 while((Ntxt=bufreader.readLine()) !=null) {
    				Name.add(Ntxt);
    	    			
    				
    			}
				 while((Stxt=bufreader2.readLine()) != null)
					{
						Stnr.add(Stxt);
						
					}
				 while((Btxt=bufreader3.readLine()) != null)
					{
						Birth.add(Btxt);
						
					}
				 while((Ptxt=bufreader4.readLine()) != null)
					{
						Phone.add(Ptxt);
						
					}
				Name.add(temp.getname());
    			Stnr.add(temp.getStnr());
    			Birth.add(temp.getbirth());
    			Phone.add(temp.getphone());
    			Na.close();
    			St.close();
    			Bi.close();
    			Ph.close();
    			  bufreader.close();
    			  bufreader2.close();
    			  bufreader3.close();
    			  bufreader4.close();
    			}
    			Iterator<String> it2=Name.iterator();
    			while(it2.hasNext()) {
    				String n=it2.next();
    				Ndummy+=n +"\r\n";
    			}
    			FileWriter N = new FileWriter("name.txt");
    			
			    N.write(Ndummy);
			 
			   N.close();
			   Iterator<String> Si=Stnr.iterator();
			   while(Si.hasNext()) {
				 
			     String n2=Si.next();
			     Sdummy+= n2 + "\r\n";
				   				   			   }
			
			    FileWriter St = new FileWriter("stnr.txt");
    			St.write(Sdummy);
    			St.close();
			  
    		 
    		Iterator<String> Bi=Birth.iterator();
			   while(Bi.hasNext()) {
				 
			     String n3=Bi.next();
			     Bdummy+= n3 + "\r\n";
				   				   			   }
			
			    FileWriter B = new FileWriter("birth.txt");
 			B.write(Bdummy);
 			B.close();
 			
 			Iterator<String> Pi=Phone.iterator();
			   while(Pi.hasNext()) {
				 
			     String n4=Pi.next();
			     Pdummy+= n4 + "\r\n";
				   				   			   }
			
			    FileWriter P = new FileWriter("phone.txt");
			P.write(Pdummy);
			P.close();
			  
 		 }
		
    			catch(IOException e) {
    			
    							}	
					
			
				
		
		}
	 }

