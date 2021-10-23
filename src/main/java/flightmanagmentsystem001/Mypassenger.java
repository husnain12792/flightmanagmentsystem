package flightmanagmentsystem001;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
 
public class Mypassenger {

	String[] origin=new String[100]; 
	String[]destination=new String[100]; 
int seat_choice;
int r1=0;
	String[]name=new String[100]; 
	String[]gender=new String[100]; 
	String[]age=new String[100]; 
	String[]address=new String[100]; 
	String[]pasport=new String[100]; 
	String[] refernceno=new String[100];
	String[]flightno=new String[100]  ;
	int[] indexs=new int[100];
	int[] equil=new int [100];
	String[] equalizer=new String[100];
	boolean[] seat_no=new boolean[100];
	int seat_book;
 	int tickets=40;
	int index=0;
	 String text=null;
	 String io="name";
	 BufferedReader brTest;
	 String[] arr=new String[50];
	 String []arr1=new String[50];
	 int ui=0; 
int random_int;
int gi=0;
int mini=98765;
int maxi=89765;
 int r=0; 
String lo="";
String str;
boolean b=false;
	char c;
	@SuppressWarnings("unused")
public void data() 
{   
 
for(int y=0;y<50;y++)
{
equil[y]=0;
	seat_no[y]=false;
	destination[y]=null;
equalizer[y]=null;
flightno[y]=null;
}

	
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
	char i='\0';
	String str1;
 	@SuppressWarnings("resource")
	Scanner sc1= new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner sc4= new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner sc5= new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner sc6= new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner sc7= new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner sc8= new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner sc9= new Scanner(System.in);
int lp=0;
 	char ej='\0';
String flight;
 Admin obj=new Admin();
 
 
 
 
try {
	
      File my = new File("file4.txt");
        Scanner myR = new Scanner(my);
	   
 
    while (myR.hasNext()) {
	      @SuppressWarnings("unused")
		int data = myR.nextInt();
 r=r1=data; 
		       
	    }
    
      myR.close();
  } catch (FileNotFoundException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }
for(int count=0;count<3;count++)
{	  
	obj.input();
	
c=sc.next().charAt(0);

 if(c!='1'&&c!='2') {
	for(int p=0;p<5;p++)
	{
	System.out.println("invalid choice enter you choice again\n");
	 System.out.println("press   1 to log in as admin");
	 System.out.println("press   2 to log in as passenger for your registration");
	 
	 c=sc.next().charAt(0);
	 if(c=='1'||c=='2')
	 {
		 break;
	 }
	 if(p>3)
	 {
		 System.out.println("many invalid choices!system crashed ! run the program again\n");
			 System.exit(0);
	 }
}

}

	 obj.Admin_menu(c);
	
 
 
 
 
 
 
 
 
 
 
 
	 
	 if(c=='2')
		{
			 
			 
			 piib:
				 System.out.println("welcome to the passenger");
		 	 if(r1<2)
		 	 {
		 		 System.out.println("we are exteremly sorry but seats are not available in any flight\n");
				 	 System.exit(0);
		 	 }
		 	 
				 System.out.println("enter your origin");
			 	 str1= sc4.nextLine();   	 
				 origin[count]=str1;
				 str1=null;
		 		 System.out.println("enter your destination");
		 		 str1= sc5.nextLine();   	 
		 	 	 destination[count]=str1;
		 	 	 str1=null;
				 System.out.println("enter your name");
		 		 str1= sc6.nextLine();   	 
		 	 	 name[count]=str1;
		 	 	 str1=null;
		 		
		 	 	 System.out.println("enter your gender");
		 		 str1= sc7.nextLine();   	 
		 	 	gender[count]=str1;
		 	 	 str1=null;
		 		
		 	 	System.out.println("enter your age");
		 		 str1= sc8.nextLine();   	 
		 	 	 age[count]=str1;
		 	 	 str1=null;
		 		
		 		 System.out.println("enter your pasport no");
		 		 str1= sc9.nextLine();   	 
		 	 	 pasport[count]=str1;
		 	 	 str1=null;
		 	  	int min = 5000;
		 	    int max = 10000;
		 	    
		 	  	  for(int l=0;flightno[l]!=null;l++) {
		 	  		  
		 	        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		 	          indexs[l]=random_int;
		 	 		  
		 	  	  }
		 	 	Integer small = indexs[0];
		 	 	 
		 	   	  for(int l=0;flightno[l]!=null;l++) {
		 	  		  
		 	   	     
		 	            if(small > indexs[l])
		 	            {
		 	                 small = indexs[l];
		 	                 index=l;
		 	            }
		 	            
		 	  	  }
		 	       
		 	      		  
		 	   	 
		 	 
		 	       
		 	   	ui=0;
		 		    System.out.println("do you want to assign you a seat no by yourself if yes press y or if you want system to assign you a seat no then press n"+"\n");
		 	 	   sc = new Scanner(System.in);   
		 	 	    c = sc.next().charAt(0);
		 	 	     	
		 	 	   if(c=='y')
		 	 	   {
		 	 		   
		 	 		   
		 	 		 for(lp=0;arr1[lp]!=null;lp++)
			    		{
			    			if(Integer.parseInt(arr1[lp])==lp)
			    			{
			    				if(lp<40)
			    				{
			    				lp+=2;
			    				break;
			    			}
			    			}
			    		}
		 	 		   
		 	 		  for(int lm=0;lm<3;lm++)
		 	 		  {
		 	 			  if(lm>0)
		 	 			  {
		 	 				   System.out.println("enter the seat no again which you want to book"+"\n");   
		 	 			 				  
		 	 			  }
		 	 		
		 	 		   System.out.println("enter the seat no which you want to book"+"\n");   
		 	 		 seat_book= sc.nextInt();
		 	 		 
		 	 		if(seat_no[seat_book]==true)
		 	 		{
		 	 			 System.out.println("we are extremely sorry but the seat is already booked"+"\n");   
		 	 	 		  
		 	 		}
		 	 		else 
		 	 		{
		 	 		seat_no[seat_book]=true; 
		 	 	//	  System.out.println("your seat has been selected successfuly");
		 	 		seat_no[count]=seat_no[seat_book];
		 	 		break;
		 	 		}
		 	 		  }
		 	 	    }
		 	 	   else if(c=='n')
		 	 	   {
		 	 		   
		 	 		   seat_no[lp]=true;
		 	 	   }
		 	 	 
		 	       ej=c;
		 	       
		 	      c='\0';
		 	 	  
			         
		 	       System.out.print("the lowest flights are scheduled on   "+flightno[index]+"  with fare of  "+indexs[index]+"\n");
		 	 	 	 
		 	       
		 	       
		 	       
		 	      System.out.print("do you want to buy ticket with lowest price if yes press y if no then press n"+"\n");
		 	     sc = new Scanner(System.in);   
		 	     c = sc.next().charAt(0);
		 	 
		 	 
		 	  
		 	  
		 	  
		 	  if(c=='y')
			     { 
			    	 
			    	 equalizer[count]=flightno[index];
			 	    equil[count]=indexs[index];
			    	if(ej=='y')
			    	{
			     	System.out.println("your flight   "+flightno[index]+"with the fair of "+indexs[index]+"has been selected successfully");
			   	//  System.out.println("thank you so much for bying ticket your printed ticket has been shown to you "+"\n");
			 
			   	  
		 	     }
			    	else if(ej=='n')
			    	{
			    		for(lp=0;arr1[lp]!=null;lp++)
			    		{
			    	     	System.out.println("i am array "+lp+"\n");
			    			if(Integer.parseInt(arr1[lp])==lp)
			    			{
			    				
			    				if(lp<40)
			    				{
			    				lp+=2;
			    				break;
			    			}
			    			}
			    		}
			     	System.out.println("your flight   "+flightno[index]+"with the fair of "+indexs[index]+"has been selected successfully");
		 	     }
			     }
			     else if(c=='n')
			     {
			    	 c='\0';
			    	System.out.println("enter your choice to buy ticket according to flight "); 
			    	for(int g=0;flightno[g]!=null;g++)
			    	{
			    		System.out.println("press   "+(g+1)+ "   "+"to book ticket of flight    "+flightno[g]+"   with rent  "+indexs[g]);	
			    	
			    	} 
			    	System.out.println("enter your choice");
			    	sc = new Scanner(System.in);   
			 	    seat_choice = sc.nextInt();
			 	    equalizer[count]=flightno[seat_choice-1];
			 	    equil[count]=indexs[seat_choice-1];
			      }

			     c='\0';
		 
		 	  
			     System.out.println("we have two types of flights,in which flight would you like to tarvel ,\n ");
			     System.out.println("business class with extraordinary facilities during flight ,\n ");
			     System.out.println("economy class with normal facilities during flight ,\n ");
			     System.out.println("press 1 to travel in economy class  ,\n ");
			     System.out.println("press 2 to travel in business class  ,\n ");
						
				c=sc.next().charAt(0);  
			     
		 	  
		 	  
		 	  
		 	  if(c=='1')
		 	  {
			     System.out.println("pay the amount of ticket in economy class ,is    "+equil[count]);
			 	  r= sc.nextInt();
			 	  
			 	  
		 	  
		for(int count1=0;count1<3;count1++)
		{
			if(r<equil[count])
			{
				System.out.println("the entered amount is less than the amount of ticket");	
				break;
			}
			else if(r>equil[count])
			{
				System.out.println("the returned amount is   "+(r-equil[count]));
				break;
			}
			else if(r==equil[count])
			{
				System.out.println("the amount has been reicevd succesfully\n");
			break;
			}
			if(count1==3)
			{
				System.out.println("you have entered too many wrong attempts your registration has been cancelled");
			System.exit(0);
			}
		}
		 	    	   
		 
		 	  }
		 
		 	  else if(c=='2')
		 	  {
		 		  equil[count]=equil[count]+3000;
			     System.out.println("pay the amount of ticket in business class ,is   "+equil[count]);
			 	  r= sc.nextInt();
			 	  
			 	  
		 	  
		for(int count1=0;count1<3;count1++)
		{
			 if(r<equil[count1])
			{
				System.out.println("the entered amount is less than the amount of ticket");	
				break;
				}
			else if(r>equil[count1])
			{
			 	System.out.println("the returned amount after cutting the orignal amount of ticket is   "+(r-equil[count]));
				break;
			}
			else if(r==equil[count1])
			{
				System.out.println("the amount has been reicevd succesfull\n");
			break;
			}
			if(count1==3)
			{
				System.out.println("you have entered too many wrong attempts your registration has been cancelled");
			System.exit(0);
			}
		}
		 	    	   
		 
		 	  }
		}
 
try 
{ 
@SuppressWarnings("resource")
FileWriter fw=new FileWriter("file.txt");
//System.out.println("name    "+"age    "+"gender    "+"flightno   "+"fair   "+"seatno"+"\n");

 
	indexs[count]=0;
	random_int = (int)Math.floor(Math.random()*(maxi-mini+1)+mini);
	refernceno[count]=String.valueOf(random_int);
	if(ej=='y')
	{
	// System.out.println(name[count]+"   "+age[count]+"    " + gender[count]+"     "+equalizer[count]+"   "+equil[count]+"     "+seat_no[count]+"    "+refernceno[count]+ "\n");
	}
	else if(ej=='n')
	{
	// System.out.println(name[count]+"   "+age[count]+"    " + gender[count]+"     "+equalizer[count]+"   "+equil[count]+"     "+lp+"    "+refernceno[count]+ "\n");
	}
		
if(count==0)
{
fw.write("name    "+"age    "+"gender    "+"flightno   "+"fair   "+"seatno    "+"origin    " +"destination    "+"referenceno     "+"\n");
}
 
	   
 
if(ej=='y')
{
fw.write(name[count]+"   "+age[count]+"    " + gender[count]+"     "+equalizer[count]+"   "+equil[count]+"     "+seat_book+"     "+origin[count]+"     "+destination[count]+"       "+refernceno[count]+ "\n");
}
else if(ej=='n')
{
fw.write(name[count]+"   "+age[count]+"    " + gender[count]+"     "+equalizer[count]+"   "+equil[count]+"     "+lp+"     "+origin[count]+"     "+destination[count]+"       "+refernceno[count]+ "\n");
}
 fw.close();

 }
catch(Exception e)
{
System.out.println(e);
}

 
  
 
try {
	
    File myObj = new File("file.txt");
    Scanner myReader = new Scanner(myObj);
   
    while (myReader.hasNext()) {
      String data = myReader.next();
arr[ui]=data;
ui++;
   //   System.out.println(data);
      
    }
    myReader.close();
  } catch (FileNotFoundException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }
System.out.println("your seat has been booked successfully ");
c='\0'; 
System.out.println("your reference no is   "+refernceno[count]+"remember this ");

System.out.println("if you palced any wrong information and  want to change any information contact admin \n");
System.out.println("to contact adimn press 1 \n");
sc = new Scanner(System.in);   
  c = sc.next().charAt(0);
  int o=0;

  if(c!='1')
{
	  System.out.println("Exitted succesfuly,thank you for buying ticket\n");
	  
 }
 else if(c=='1')
 {
System.out.println("Do you want to change any of your information press y if yes press n if no \n");
sc = new Scanner(System.in);   
 c = sc.next().charAt(0);
if(c=='y')
{
	c='\0';
	System.out.println("which inforrmation would you like to change\n \n");
 	System.out.println("press 1 to change your origin \n");
	System.out.println("press 2 to change your destination \n");
	System.out.println("press 3 to cancel your registration \n");
	
	sc = new Scanner(System.in);   
	 c = sc.next().charAt(0);	
	
} 
 }
 
@SuppressWarnings("resource")
Scanner sc2= new Scanner(System.in); //System.in is a standard input stream  
if(c=='1')
{
	System.out.println("enter your reference no");	
	 str= sc2.nextLine();

 
for(int count1=0;arr[count1]!=null;count1++)
{
	 
	if(count1>5) {
 	if(str.equals(arr[count1])) {
			b=true;
			System.out.println("your data has been founded in the database\n");	
			//o=o-2;
			System.out.println("enter your new origin");	
			lo= sc2.nextLine();
			
			
			
			
		 



		}
 	
}
	o++; 
	}
o=o-3;
arr[o]=lo;
  
}



else if(c=='2')
{
	System.out.println("enter your reference no");	
	 str= sc2.nextLine();

 
 
for(int count1=0;arr[count1]!=null;count1++)
{
	 
	if(count1>5) {
	 
		if(str.equals(arr[count1])) {
			b=true;
			System.out.println("your data has been founded in the database"+"   " );	
			 
			System.out.println("enter your new destination");	
			lo= sc2.nextLine();
			
 

		}
 	
}
	o++; 
	}
o=o-2;
arr[o]=lo;
  
}



else if(c=='3')
{
	System.out.println("enter your reference no");	
	 str= sc2.nextLine();
 
 
for(int count1=0;arr[count1]!=null;count1++)
{
	 
	if(count1>5) {
 		if(str.equals(arr[count1])) {
			b=true;
			System.out.println("your data has been founded in the database"+"   "+count1+"    "+o);	
			 
			
			
 

		}
 
}
	o++; 
	} 
int pi=o-9;
for(int count1=o;count1>=pi;count1--)
{

 	arr[count1]=null; 
 
}
  
}
else {
	System.out.println( "your tickets has been succesfuly booked"+"    ");
	 System.out.println("name   "+name[count]+"\n"+"age   "+age[count]+"\n"+"seat no    "+seat_book+"\n"+"gender   " + gender[count]+"\n"+"flighno    "+equalizer[count]+"\n"+"fair  "+equil[count]+"\n"+"reference no   "+refernceno[count]+"\n");
     


}	
 filehandling();
c='\0';
System.out.println("do you want to continue \n");

sc = new Scanner(System.in);   
 c = sc.next().charAt(0);
if(c=='n')
{ 
	System.exit(0);
}

}
 

} 

 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

@SuppressWarnings("resource")
public void filehandling()
{
	 BufferedWriter bw = null;
	 PrintWriter pw = null;
	 try 
	 { 
	 @SuppressWarnings("resource")
	 FileWriter w=new FileWriter("file2.txt",true);
	 FileWriter we=new FileWriter("file4.txt");
	   
	 bw = new BufferedWriter(w);
	 pw = new PrintWriter(bw);

	  

	 int p=1;
	  
	 /*for(int count1=0;arr[count1]!=null;count1++)
	 {
	 	 
	     
	 	if(count1>5)
	 	{
	 	//System.out.println( arr[count1]+"    ");
	 	 
	 	}
	 	
	 	if(count1==count1+5)
	 	{
	 		System.out.println( "\n");
	 			
	 	}
	 	
	 	
	  } */

	 /*if(count==1)
	 {
	 pw.write("name    "+"age    "+"gender    "+"flightno   "+"fair   "+"seatno   "+"origin     "+"destination     "+"referenceno     "+"\n");
	 }*/

	 for(int count1=0;arr[count1]!=null;count1++)
	 {
	  	if(count1>8)

	 	{
	  		
	  
	 	pw.write( arr[count1]+"    ");
	 	 
	 	} 
	  if(p>=9&&p%9==0)
	  	{
		r1--;  
	 		pw.write("\n");
	  	}
	 	
	 	p++;

	  }
	 
	 System.out.println("i am r above this "+r1);
	 r1+=1;
	 we.write(Integer.toString(r1));
we.close();
	 pw.flush();
	 w.close();


	  } catch (IOException e) {
	  	e.printStackTrace();
	 }
	 
	 finally {
	     try {
	     	  pw.close();
	         bw.close();
	        }
	 catch(Exception e)
	 {
	 System.out.println(e);
	 }
	 }
}
 





 

}






















 

 		  





 


















 