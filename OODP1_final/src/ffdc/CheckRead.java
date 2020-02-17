package ffdc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CheckRead{
private static int count;
private static ArrayList<String> ID =  new ArrayList<String>();
private static ArrayList<Integer> year= new ArrayList<Integer>();
private static ArrayList<Integer> month= new ArrayList<Integer>();
private static ArrayList<Integer> day= new ArrayList<Integer>();
private static ArrayList<String> check =  new ArrayList<String>();
private static String ytxt="";  
public static void reader(String ytxt) {
	File file = new File("Date.txt");
	try {
		
		
		
		ID.clear();
		
	    year.clear();
		month.clear();
		day.clear();
		check.clear();
	FileReader filereader= new FileReader(file);
	BufferedReader bufreader = new BufferedReader(filereader);
	while((ytxt=bufreader.readLine()) != null)
	{
		String word1="";
		String word2="";
		String word3="";
		String word4="";
		String word5="";
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
	bufreader.close();
	}
	catch(IOException e) {
	}
}
	public static void readtext(JTextArea testArea, JTextArea testArea2) {
		
	
		ytxt="";
		String Dummy="";
		String Dummy2="";
			
			reader(ytxt);
			Iterator<String> it=ID.iterator();
			Iterator<Integer> it2=year.iterator();
			Iterator<Integer> it3=month.iterator();
			Iterator<Integer> it4=day.iterator();
			Iterator<String> it5=check.iterator();
			while(it.hasNext()) {
				String n=it.next();
				int n2=it2.next();
				int n3=it3.next();
				int n4=it4.next();
				String n5=it5.next();
				
				if(n.equals(P_One.ID)) {
					Dummy2+="currentID: " +n +" Year: "+n2+ " Month: "+n3+ " Day: " + n4+ " Attendance: " +n5+"\r\n";
				}
				Dummy+="ID: " +n +" Year: "+n2+ " Month: "+n3+ " Day: " + n4+ " Attendance: " +n5+"\r\n";
			}
			Iterator<String> it6=check.iterator();
			int i=0;
			
			String [] checklist= new String [check.size()];
			
			while(it6.hasNext()) {
				
				
				checklist[i]=it6.next();
				
				i++;
			}

			
			for(int j=0; j<checklist.length; j++) {
				
				
				if(checklist[j].equals("o")){
					StrategyMain.icheck=1;
				}
				else if(checklist[j].equals("x")) {
					StrategyMain.icheck=0;
				}
			}
			for(int k=checklist.length-1; k>=0; k--) {
				
				if(checklist[k].equals("x")) {
						
				    StrategyMain.icheck=0;
					}
						
					
				}
			
		
			StrategyMain.strategy();
			
		 testArea.setText(Dummy);
		 testArea2.setText(Dummy2);
		 return;
		}
		

	
	public static void readdate(int y, int m, int d, String c) {
		    ytxt="";
			reader(ytxt);
			ListIterator<Integer> it2=year.listIterator();
			ListIterator<Integer> it3=month.listIterator();
			ListIterator<Integer> it4=day.listIterator();
			ListIterator<String> it5=check.listIterator();
			ListIterator<String> it6=ID.listIterator();
 		   while(it2.hasNext()) {
 			   
 			   String n2=it6.next();
 			   int i=it2.next();
 			   int i2=it3.next();
 			   int i3=it4.next();
 			   String n=it5.next();
 			   if(n2.equals(P_One.ID)) {
 			  Frame.Datelist.addDates(new Dates(i,i2,i3));
			    Frame.Checklist.addChecks(new Checks(n));
 			   }
 		   }
   		   Dates tempobject = (new Dates(y,m,d));
  
   		 int checkdate=Frame.zero;
			for(Iterator2 it = Frame.Datelist.iterator();it.hasNext();)
			{
				Dates temp =(Dates) it.next();

		
				
				
				if(tempobject.getDates()==temp.getDates() && tempobject.getMonth()==temp.getMonth() && tempobject.getDay()==temp.getDay())
				{
					checkdate=1;
					 JOptionPane.showMessageDialog(null, "No ม฿บน");
					
					 					break;
				}
				
   	   }
			if(checkdate==0)
			{
				Frame.Datelist.addDates(new Dates(y,m,d));
			    Frame.Checklist.addChecks(new Checks(c));
			
			  
				JOptionPane.showMessageDialog(null, tempobject.getDates()+ "-" + tempobject.getMonth()+ "-" + tempobject.getDay());	
				
          
           
			}
			
			
		}
		

	public static void editcheck(int y, int m, int d, String c) {
	
		  ytxt="";
		  reader(ytxt);
			ListIterator<Integer> it2=year.listIterator();
			ListIterator<Integer> it3=month.listIterator();
			ListIterator<Integer> it4=day.listIterator();
			ListIterator<String> it5=check.listIterator();
			ListIterator<String> it6=ID.listIterator();
 		   while(it2.hasNext()) {
 			   
 			   String n2=it6.next();
 			   int i=it2.next();
 			   int i2=it3.next();
 			   int i3=it4.next();
 			   String n=it5.next();
 			   if(n2.equals(P_One.ID)) {
 			  Frame.Datelist.addDates(new Dates(i,i2,i3));
			    Frame.Checklist.addChecks(new Checks(n));
 			   }
 		   }
   		   Dates tempobject = (new Dates(y,m,d));
   		
   		
		   int i=Frame.zero;
		   for(Iterator2 it = Frame.Datelist.iterator();it.hasNext();){
			   Dates temp =(Dates) it.next();
			   if(tempobject.getDates()==temp.getDates() && tempobject.getMonth()==temp.getMonth() && tempobject.getDay()==temp.getDay()){
				 Frame.Checklist.Indexof(i,new Checks(c));
				 if(c.equals("x")) {
					 CheckWrite.flag=1;
					 
				 }
				 else if(c.equals("o")) {
				
						CheckWrite.flag=0;
						
						
						
							
					}
					
					 
				 
				 
				 
			   }
			   
			   i++;
		   }
		   
		   i=Frame.zero;
		   JOptionPane.showMessageDialog(null, tempobject.getDates()+ "-" + tempobject.getMonth()+ "-" + tempobject.getDay());
			
		   CommandControl cm = new CommandControl();
 		  
 		  
	    	
		   CheckWrite checkwrite= new CheckWrite();
		   CheckRead checkread= new CheckRead();
           Commandlist commandlist= new Commandlist(checkwrite, checkread);
 		  cm.setCommand(commandlist);
 		  cm.CommandPress();
		}
		

}