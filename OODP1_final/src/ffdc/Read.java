package ffdc;
import java.io.*;
import java.util.TreeSet;

import javax.swing.JTextArea;

import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
public class Read {
	
	private static int count;

	public static void setCount(int a){
		count = a;
	}
	
	public static void readtext(String userText, char [] passText) {
		LoginInformation loginInformation = LoginInformation.getInstance();
		loginInformation.setPosition("x");
		ArrayList<String> set =  new ArrayList<String>();
		ArrayList<String> pass= new ArrayList<String>();
		ArrayList<String> userPosition= new ArrayList<String>();

		try {
			File file = new File("ID.txt");
			File file2 = new File("pass.txt");
			File file3 = new File("position.txt");
			
			FileReader filereader= new FileReader(file);
			BufferedReader bufreader = new BufferedReader(filereader);
			FileReader filereader2= new FileReader(file2);
			BufferedReader bufreader2 = new BufferedReader(filereader2);
			FileReader filereader3= new FileReader(file3);
			BufferedReader bufreader3 = new BufferedReader(filereader3);
			
			
			String line="";
			String line2="";
			String line3="";
			String pas="";
			
			for (int i = 0; i < passText.length; i++) {
			    pas += Character.toString(passText[i]);
			}
			
			while((line=bufreader.readLine()) !=null) {
 				set.add(line);		 					
 			}
			
			while((line2=bufreader2.readLine()) !=null) {
	 			pass.add(line2);			 					
	 		}
			
			while((line3=bufreader3.readLine()) !=null) {
	 			userPosition.add(line3);			 					
	 		}
			
			Iterator<String> it=set.iterator();
			Iterator<String> Pit=pass.iterator();
			
			setCount(0);
			while(it.hasNext()) {
				String n=it.next();
				String n2= Pit.next();
				if(n.equals(userText) && n2.equals(pas)){
					loginInformation.setLoginIndex(count);
					P_One.bLoginCheck=true;
					loginInformation.setPosition((String)userPosition.get(count));
					System.out.println(loginInformation.getPosition());//----------------
					Setting.position = loginInformation.getPosition();

				}
				setCount(count+1);//
			}
			bufreader.close();
			bufreader2.close();
			bufreader3.close();
		}
		catch(IOException e) {}
	}
	public static void readteam() {
		ArrayList<String> team =  new ArrayList<String>();
		try {
			File file = new File("team.txt");
			FileReader filereader= new FileReader(file);
			BufferedReader bufreader = new BufferedReader(filereader);
			String line="";
			
			while((line=bufreader.readLine()) !=null) {
				team.add(line);
			}
			
			bufreader.close();
			Iterator<String> it=team.iterator();
			
			while(it.hasNext()) {
				String n=it.next();
				TeamMember.addlist(n);
			} 
		}
		catch(IOException e) {}
	}
	
	public static void readprofile(JTextArea testArea) {
		LoginInformation loginInformation = LoginInformation.getInstance();
       
		
		ArrayList<String> ID =  new ArrayList<String>();
		ArrayList<String> PW =  new ArrayList<String>();
		ArrayList<String> Name =  new ArrayList<String>();
		ArrayList<String> Stnr =  new ArrayList<String>();
		ArrayList<String> Birth =  new ArrayList<String>();
		ArrayList<String> Phone =  new ArrayList<String>();
		ArrayList<String> Team =  new ArrayList<String>();
		ArrayList<String> Pos =  new ArrayList<String>();
		
		String ProfileDummy="";
		
		try {
			File file = new File("ID.txt");
			File file2 = new File("pass.txt");
			File file3 = new File("Name.txt");
			File file4 = new File("Stnr.txt");
			File file5 = new File("Birth.txt");
			File file6 = new File("Phone.txt");
			File file7 = new File("team.txt");
			File file8 = new File("position.txt");
			
			
			FileReader filereader= new FileReader(file);
			BufferedReader bufreader = new BufferedReader(filereader);
			FileReader filereader2= new FileReader(file2);
			BufferedReader bufreader2 = new BufferedReader(filereader2);
			FileReader filereader3= new FileReader(file3);
			BufferedReader bufreader3 = new BufferedReader(filereader3);
			FileReader filereader4= new FileReader(file4);
			BufferedReader bufreader4 = new BufferedReader(filereader4);
			FileReader filereader5= new FileReader(file5);
			BufferedReader bufreader5 = new BufferedReader(filereader5);
			FileReader filereader6= new FileReader(file6);
			BufferedReader bufreader6 = new BufferedReader(filereader6);
			FileReader filereader7= new FileReader(file7);
			BufferedReader bufreader7 = new BufferedReader(filereader7);
			FileReader filereader8= new FileReader(file8);
			BufferedReader bufreader8 = new BufferedReader(filereader8);
		
			String IDline="";
			String passline="";
			String Nline="";
			String Sline="";
			String Bline="";
			String Pline="";
			String Tline="";
			String Posline="";
			
			ID.clear();
			PW.clear();
			Name.clear();
			Stnr.clear();
			Birth.clear();
			Phone.clear();
		    Team.clear();
			Pos.clear();
			
			while((IDline=bufreader.readLine()) !=null) {
				ID.add(IDline);
			}
			 
			while((passline=bufreader2.readLine()) !=null) {
				PW.add(passline);
			}
			 
			while((Nline=bufreader3.readLine()) !=null) {
				Name.add(Nline);
			}
			while((Sline=bufreader4.readLine()) !=null) {
				Stnr.add(Sline);
			}
			
			while((Bline=bufreader5.readLine()) !=null) {
					Birth.add(Bline);
			}
			
			while((Pline=bufreader6.readLine()) !=null) {
					Phone.add(Pline);
			}
			
			while((Tline=bufreader7.readLine()) !=null) {
					Team.add(Tline);
			}
			
			while((Posline=bufreader8.readLine()) !=null) {
					Pos.add(Posline);
			}
			
			bufreader.close();
			bufreader2.close();
			bufreader3.close();
			bufreader4.close();
			bufreader5.close();
			bufreader6.close();
			bufreader7.close();
			bufreader8.close();
						 
			Iterator<String> it=ID.iterator();
			Iterator<String> it2=PW.iterator();
			Iterator<String> it3=Name.iterator();
			Iterator<String> it4=Stnr.iterator();
			Iterator<String> it5=Birth.iterator();
			Iterator<String> it6=Phone.iterator();
			Iterator<String> it7=Team.iterator();
			Iterator<String> it8=Pos.iterator();
			
			while(it.hasNext()) {
				String n=it.next();
				String n2=it2.next();
				String n3=it3.next();
				String n4=it4.next();
				String n5=it5.next();
				String n6=it6.next();
				String n7=it7.next();
				String n8=it8.next();
				
				if(loginInformation.getPosition().equals("Member")) {
					ProfileDummy+="ID: " +ID.get(loginInformation.getLoginIndex())+" PW: " +PW.get(loginInformation.getLoginIndex()) 
					+" Name: " +Name.get(loginInformation.getLoginIndex()) +" Stnr: " +Stnr.get(loginInformation.getLoginIndex()) 
					+ " Birth: " +Birth.get(loginInformation.getLoginIndex()) +" Phone: " +Phone.get(loginInformation.getLoginIndex())
					+ " Team:  " + n7 + " Position: " +Pos.get(loginInformation.getLoginIndex()) +"\r\n";
					break;
				}
				else if(loginInformation.getPosition().equals("Moderator"))
					ProfileDummy+="ID: " +n +" PW: " +n2 +" Name: " +n3 +" Stnr: " +n4 + " Birth: " +n5 +" Phone: " +n6+ " Team:  " + n7 + " Position: " +n8 +"\r\n";
			} 
			testArea.setText(ProfileDummy);
			return;
		}
	catch(IOException e) {}
	}
}