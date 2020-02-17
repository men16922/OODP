package ffdc;

import java.util.Calendar;

public class CalendarPrint {
    
    // Create Calendar instance
    Calendar cal = Calendar.getInstance();

    private String[] calHeader = {"Son","Mon","Tue","Wed","Thu","Fri","Sat"};    // Day
    private String[][] calDate = new String[6][7];    // Data of date

    private int width=calHeader.length; 
    private int startDay;   // Month start day
    private int lastDay;    // Month last day
    private int inputDate=1; // Set to 1 to show from the first day to the last day

    public CalendarPrint(int year, int month){
        
        if(month<1 || month>12)
            System.out.println("The month does not exist.");
        else{
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, month-1);
            cal.set(Calendar.DATE, 1);
            
            startDay = cal.get(Calendar.DAY_OF_WEEK);  
            lastDay = cal.getActualMaximum(Calendar.DATE); 
            
            // Enter date in 2D array
            int row = 0;
            for(int i=1; inputDate<=lastDay; i++){
                if(i<startDay) calDate[row][i-1]="";
                else{
                    // Enter in date array
                    calDate[row][(i-1)%width]=Integer.toString(inputDate);
                    inputDate++;
                    // Line break
                    if(i%width==0) row++;
                }      
            }
        }
    }

    public void printCal(){
        
        // Print Son ~ Sat
        for(int i=0; i<width; i++){
            System.out.print(calHeader[i]+"\t");
        }
        System.out.println();
        
        // Print Date
        int row=0;
        for(int j=1 ; j<lastDay+startDay; j++){
            System.out.print(calDate[row][(j-1)%width]+"\t");
            
            if((j-1)%width==width-1){
                System.out.println();
                row++;
            }
            
        }
    }
    
}