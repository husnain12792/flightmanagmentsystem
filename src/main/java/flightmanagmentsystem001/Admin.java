package flightmanagmentsystem001;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Admin {
	String[]flightno=new String[100]  ;
	int gi=0;
	Scanner sc=new Scanner(System.in) ;
	public void input()
{
	 System.out.println("press   1 to log in as admin");
	 System.out.println("press   2 to log in as passenger for your registration");
}
public void Admin_menu(char c) {
 
	
	
	
	
	
	try {
		
	    File myObj = new File("file3.txt");
	 
	    Scanner myReader = new Scanner(myObj);
	 	   
	    while (myReader.hasNext()) {
	      String data = myReader.next();
	flightno[gi]=data;
	gi++;
	       
	    }
	 
	    
	    myReader.close();
	    
	  } catch (FileNotFoundException e) {
	    System.out.println("An error occurred.");
	    e.printStackTrace();
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
	
	
	
	 if(c=='1')
	 {
	 	c='\0';
	   

	 	System.out.println("do you want to add a new flight press y if yes");
	c='\0';
	 	c=sc.next().charAt(0);
	 if(c=='y')
	 {
	 	 
 
	 	
	 	for(int u=0;u<flightno.length;u++)
	 	{
	 		if(flightno[u]==null)
	 		{
	 			sc=new Scanner(System.in);
	 			 System.out.println("enter new flight");
	 			 flightno[gi]=sc.nextLine();
	 break;
	 		}
	 		
	 	}
	 	
	 	
	 	
	 	   try {
	 		   
	 		  BufferedWriter out = new BufferedWriter(
	 	                new FileWriter("file3.txt", true));
	             out.write(flightno[gi]+"\n");
	             out.close();
	        }

	         catch (IOException e) {

	             System.out.println("exception occoured" + e);
	        }
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	  
	  
	 	
	 }
	 else if(c!='y')
	 {
	 	System.out.println("sorry at this time we have only the feture of adding flight for the admin");
	 	System.exit(0);
	 }





	 }

}
 
}

