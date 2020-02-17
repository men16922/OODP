package ffdc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;



import java.util.ListIterator;

import java.util.Iterator;

public class CheckWrite {
public static int flag=0;
	public void Text() {
		Iterator2 it2 = Frame.Checklist.iterator();
		Iterator2 it = Frame.Datelist.iterator();
		
		ArrayList<String> ID =  new ArrayList<String>();
		TreeSet<String> Text =  new TreeSet<String>();
		ArrayList<Integer> year= new ArrayList<Integer>();
		ArrayList<Integer> month= new ArrayList<Integer>();
		ArrayList<Integer> day= new ArrayList<Integer>();
		ArrayList<String> check =  new ArrayList<String>();
		
		ArrayList<String> Text2 =  new ArrayList<String>();
		TreeSet<String> Text3 =  new TreeSet<String>();
		String word1="";
		String word2="";
		String word3="";
		String word4="";
		String word5="";
		
		
		String Datedummy="";
		
		Text.clear();
		Text2.clear();
	
    		try {
    			
    			while (it.hasNext()) {
    	    		Checks Checks = (Checks) it2.next();
    	    		Dates Dates= (Dates) it.next();
    			File file = new File("Date.txt");
    			BufferedWriter Check= new BufferedWriter(new FileWriter(file,true));
        		
    			FileReader filereader= new FileReader(file);
				BufferedReader bufreader = new BufferedReader(filereader);
			    
				String ytxt="";
				ID.clear();
				
			    year.clear();
				month.clear();
				day.clear();
				check.clear();
				
                
              
				while((ytxt=bufreader.readLine()) != null)
				{
					
					int i=ytxt.indexOf("/");
					word1=ytxt.substring(0,i);
					int i2=ytxt.indexOf("-");
					word2=ytxt.substring(i+1,i2);
					int i3=ytxt.indexOf("-",i2+1);
					word3=ytxt.substring(i2+1,i3);
					int i4=ytxt.indexOf("-",i3+1);
					word4=ytxt.substring(i3+1,i4);
					int i5=ytxt.indexOf("-",i4+1);
					word5=ytxt.substring(i4+1,i5);
				    
															
					ID.add(word1);
				
					year.add(Integer.parseInt(word2));
					month.add(Integer.parseInt(word3));
					day.add(Integer.parseInt(word4));
					check.add(word5); 
				
				}
               
    			
    			Check.close();
    			  bufreader.close();
    		
    				ID.add(P_One.ID);
    			
    				 
				year.add(Dates.getDates());
				month.add(Dates.getMonth());
				day.add(Dates.getDay());
				check.add(Checks.getCheck());
		       
				
				ListIterator<Integer> it4=year.listIterator();
				ListIterator<Integer> it5=month.listIterator();
				ListIterator<Integer> it6=day.listIterator();
				ListIterator<String> it3=check.listIterator();
    		
    			ListIterator<String> it7=ID.listIterator();
    		
    	
    			 while(it7.hasNext()) {
			
				String n=it3.next();
				String n2=it7.next();
            
			
				int i=it4.next();
				int j=it5.next();
				int k=it6.next();
			
							
			
				Datedummy=n2+"/"+i +"-" +j+ "-" +k+ "-" +n + "-"+"\r\n";
			
			
				Text.add(Datedummy);
				
				
			}
    			
    			}
    			
                	FileWriter Date = new FileWriter("Date.txt");
                	
    			Iterator<String> it3=Text.iterator();
    			while(it3.hasNext()){
    			String n=it3.next();
    			
    			Text2.add(n);
			  
    			
			       			}
    			
    			ListIterator<String> it4=Text2.listIterator();
    			
    			while(it4.hasNext()){
        			String n=it4.next();
        			
        			String n3=n.substring(0,8);
        			String n2=n.substring(8);
                    
        			
        			
        			
        			
        		    if(n2.equals("x-\r\n")) {
        		    	
        		    	ListIterator<String> it5=Text2.listIterator();
        		    	while(it5.hasNext()) {
        		    	String n4=it5.next();
        		    	String n5=n4.substring(0, 8);
        		    	String n6=n4.substring(8);
        		   
        		      
        		    	if(n6.equals("o-\r\n") && n3.equals(n5)) {
        		    		//it4.set(n2+"o-\r\n");
        		    		it4.set(n3+"o-\r\n");
        		    	}
        		    	}  
        		    }
        		  
        			
        		
    			}
    			
    			if(flag==1) {
                 ListIterator<String> it5=Text2.listIterator();
    			
    			while(it5.hasNext()){
        			String n=it5.next();
        			
        			String n3=n.substring(0,8);
        			String n2=n.substring(8);
        
        			
        			
        			
        		    if(n2.equals("o-\r\n")) {
        		    	
        		    	ListIterator<String> it6=Text2.listIterator();
        		    	while(it6.hasNext()) {
        		    	String n4=it6.next();
        		    	String n5=n4.substring(0, 8);
        		    	String n6=n4.substring(8);
        		        //System.out.println(n4);
        		      
        		    	if(n6.equals("o-\r\n") && n3.equals(n5)) {
        		    		//it4.set(n2+"o-\r\n");
        		    		it5.set(n3+"x-\r\n");
        		    	}
        		    	}  
        		    }
        		  
        			
        		
    			}
    			flag=0;
    			}
    			
    			
    			
    			  Iterator<String> set1=Text2.iterator();
      			while(set1.hasNext()) {
      				String last=set1.next();
      				Text3.add(last);
      			}
      			Iterator<String> set=Text3.iterator();
      			while(set.hasNext()) {
      				String last2 =set.next();
      				
      				 Date.write(last2);
      				 
      			}
        		 
                   
        			
    			       			
    			
    			 Date.close();
    			 
                 					     		     		
			  
 		 }
		
    			catch(IOException e) {
    			
    							}	
					
			
				
		
		}
	
}
