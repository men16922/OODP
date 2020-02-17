package ffdc;

import java.io.*;
import java.util.ArrayList;

import java.util.Iterator;

public class teamwrite {
	public static void Text(String userText) {
		ArrayList<String> set =  new ArrayList<String>();
		String Tdummy="";
		
    		try {
    			File file = new File("team.txt");
    			File file2 = new File(userText+".txt");
				FileWriter fw = new FileWriter(file2);
				fw.append(Joindisplay.ID +"\r\n");
    			fw.close();
    			
    			BufferedWriter t= new BufferedWriter(new FileWriter(file,true));
    		    
    			FileReader filereader= new FileReader(file);
				BufferedReader bufreader = new BufferedReader(filereader);
				
				String teamtxt="";
			   
				set.clear();
				
				
				while((teamtxt=bufreader.readLine()) != null)
				{
					set.add(teamtxt);
					
				}
			
				
    			set.add(userText);
    			
    			t.close();
    		
    			  bufreader.close();
    			  
					   
    			Iterator<String> it2=set.iterator();
    			while(it2.hasNext()) {
    				String n=it2.next();
    				Tdummy+=n +"\r\n";
    			}
    			FileWriter T = new FileWriter("team.txt");
    			
			    T.write(Tdummy);
			 
			   T.close();
			  
			  
    		 
    	
			  
 		 }
		
    			catch(IOException e) {
    			
    							}	
					
			
				
		
		}
	
public static void teamlist(String n) {
		
		
	ArrayList<String> set =  new ArrayList<String>();		
	
		
		String Tdummy="";
		
		
    		try {
    			File file = new File(n+".txt");
    			File file2 = new File("team.txt");				   		
    			BufferedWriter t= new BufferedWriter(new FileWriter(file,true));
    			BufferedWriter t2= new BufferedWriter(new FileWriter(file2,true));
    			FileReader filereader= new FileReader(file);
				BufferedReader bufreader = new BufferedReader(filereader);
				
				String teamtxt="";
			   
				set.clear();
				
				
				while((teamtxt=bufreader.readLine()) != null)
				{
					set.add(teamtxt);
					
				}
			
				
    			set.add(Joindisplay.ID);
    			
    			Joindisplay.ID="";
    			t.close();
    		
    			  bufreader.close();
    			  
					   
    			Iterator<String> it=set.iterator();
    			while(it.hasNext()) {
    				String n2=it.next();
    				
    				Tdummy+=n2 +"\r\n";
    			}
    			FileWriter T = new FileWriter(n+".txt");
    			
			    T.write(Tdummy);
			 
			   T.close();
                 if(n=="미입력") {
                	 t2.append("미입력"+"\r\n");
                 }
                 t2.close();
			  
			  
    		 
    	
			  
 		 }
		
    			catch(IOException e) {
    			
    							}	
					
			
				
		
		}
public static void editteam(String n) {
	
	
	ArrayList<String> next =  new ArrayList<String>();	
	ArrayList<String> ID =  new ArrayList<String>();
	ArrayList<String> team =  new ArrayList<String>();
	ArrayList<String> pre =  new ArrayList<String>();
	String Tdummy="";
	String Teamdummy="";
	String Tdummy2="";
	
		try {
			File file = new File(n+".txt");
			File file2 = new File("ID.txt");
			File file3 = new File("team.txt");
			BufferedWriter t= new BufferedWriter(new FileWriter(file,true));
			BufferedWriter t2= new BufferedWriter(new FileWriter(file2,true));
			FileReader filereader= new FileReader(file);
			BufferedReader bufreader = new BufferedReader(filereader);
			FileReader filereader2= new FileReader(file2);
			BufferedReader bufreader2 = new BufferedReader(filereader2);
			FileReader filereader3= new FileReader(file3);
			BufferedReader bufreader3 = new BufferedReader(filereader3);
			String teamtxt="";
		    String IDtxt="";
		    String Ttxt="";
		    String Ttxt2="";
			next.clear();
			ID.clear();
			team.clear();
			pre.clear();
			while((teamtxt=bufreader.readLine()) != null)
			{
				next.add(teamtxt);
				
			}
			while((IDtxt=bufreader2.readLine()) != null)
			{
				ID.add(IDtxt);
				
			}
			while((Ttxt=bufreader3.readLine()) != null)
			{
				team.add(Ttxt);
				
			}
			
			int j=ID.indexOf(P_One.ID);
			System.out.println(j);
		    next.add(j,P_One.ID);
		    
		    String x=team.get(j);
		    File file4 = new File(x+".txt");
		    BufferedWriter t3= new BufferedWriter(new FileWriter(file4,true));
		    FileReader filereader4= new FileReader(file4);
			BufferedReader bufreader4 = new BufferedReader(filereader4);
			while((Ttxt2=bufreader4.readLine()) != null)
			{
				pre.add(Ttxt2);
				
			}
			int k=pre.indexOf(P_One.ID);
			pre.set(k,"");
		    team.set(j,n);
			t.close();
		    t2.close();
		    t3.close();
			  bufreader.close();
			  bufreader2.close();
			  bufreader3.close();
			  bufreader4.close();
			Iterator<String> it=next.iterator();
			while(it.hasNext()) {
				String n2=it.next();
				
				Tdummy+=n2 +"\r\n";
			}
			FileWriter T = new FileWriter(n+".txt");
			
		    T.write(Tdummy);
		 
		   T.close();
		   
		   Iterator<String> it2=team.iterator();
			while(it2.hasNext()) {
				String n2=it2.next();
				
				Teamdummy+=n2 +"\r\n";
			}
			FileWriter T2 = new FileWriter("team.txt");
			
		    T2.write(Teamdummy);
		 
		   T2.close();
		   
		   Iterator<String> it3=pre.iterator();
			while(it3.hasNext()) {
				String n2=it3.next();
				
				Tdummy2+=n2 +"\r\n";
			}
			FileWriter T3 = new FileWriter(x+".txt");
			
		    T3.write(Tdummy2);
		 
		   T3.close();
		  P_Two.logincheck=Frame.zero;
		  
		 
	
		  
		 }
	
			catch(IOException e) {
			
							}	
				
		
			
	
	}
	 }