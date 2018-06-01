import java.util.*;
import java.io.*;
import java.lang.*;
class Student 
{	
	   int i, q, z, c, b;
	   int x=0;
	   int[] age = new int[30];
	   int[] rno = new int[30];
	   int[] sem = new int[30];
	   int[] fee = new int[30];
	   int[] year= new int[30];
	   String[] n = new String[30];
	   String[] name = new String[30];
	   String[] course = new String[30];
	   String[] gen = new String[30];
	   String[] caste = new String[30];
	   int menuChoice;
	   
	   public void Menu1()throws Exception
	   {
	     InputStreamReader isr=new InputStreamReader (System.in);
	     BufferedReader br=new BufferedReader (isr);
	     start:
	     do{
		System.out.println("\n\t\t\tStudent Record Menu");
		System.out.println("\t\t\t-------------------");
		System.out.println("\n1. Add Student\n2. View Students\n3. Search Student\n4. Exit");
		System.out.print("\nEnter a choice: ");
		menuChoice = Integer.parseInt(br.readLine());
		   if (menuChoice==1)
		   {
		       for (z=x; z<=29; z++)
		       {
			System.out.print("\n\tEnter College Information");
			System.out.print("\n\t-------------------------");
				   
			System.out.println("\nEnter Name Of Student : ");
			n [z] = br.readLine();
			System.out.print("\nEnter Roll Number : ");
			rno [z] =Integer.parseInt(br.readLine());
			System.out.print("\nEnter Course : ");
			course [z] = br.readLine();
			System.out.print("\nEnter Semester In You Are : ");
			sem [z] = Integer.parseInt(br.readLine());
			System.out.print("\nEnter Year : ");
			year [z] = Integer.parseInt(br.readLine());
			System.out.print("\nEnter Fee : ");
			fee [z] = Integer.parseInt(br.readLine());
				   
			System.out.print("\n\tEnter Personal Information ");
			System.out.print("\n\t--------------------------");
				   
			System.out.print("\nEnter Age : ");
			age [z] = Integer.parseInt(br.readLine());
			System.out.print("\nEnter Your Gender : ");
			   gen [z] = br.readLine();
			   System.out.print("\nEnter Your Cast : ");
			   caste [z] = br.readLine();
			   x++;
			   continue start;
			 }
		   }
		   else if (menuChoice==2)
		   { 
			for (i=0; i<x; i++)
			 {
			System.out.print("\n\tCollege Information of Student");
			System.out.print("\n\t------------------------------");
	
			System.out.print("\n Name Of Student 		: "+ n[i]);
			System.out.print("\n Roll Number Of Student : "+ rno[i]);
			System.out.print("\n Course Name Of Student : "+ course[i]);
			System.out.print("\n Semester Of Student 	: "+ sem[i]);
			System.out.print("\n Fee Of Student 		: "+ fee[i]);
	
			System.out.print("\n\n\tPersonal Information of Student");
			System.out.print("\n\t-------------------------------");
		
			System.out.print("\n Age Of Student 		: "+ age[i]);
			System.out.print("\n Gender Of Student 		: "+ gen[i]);
			System.out.print("\n Caste Of Student 		: "+ caste[i]);
			 }		   
		}
			else if (menuChoice==3)
		   { 
			int searchRollNo, searchedPosition=30;
			System.out.print("Enter Roll Number Of Student : ");
			searchRollNo=Integer.parseInt(br.readLine());
			for (i=0; i<x; i++)
			{
			  if(rno[i]==searchRollNo)
			   searchedPosition=i;
			 }
			System.out.print("\n\tInformation of Student");
			System.out.print("\n\t------------------------------");
					
			System.out.print("\n Name Of Student : "+ n[searchedPosition]);
			System.out.print("\n Roll Number Of Student: "+ rno[searchedPosition]);
			System.out.print("\n Course Name Of Student: "+ course[searchedPosition]);
			System.out.print("\n Semester Of Student : "+ sem[searchedPosition]);
			System.out.print("\n Fee Of Student 	: "+ fee[searchedPosition]);

			System.out.print("\n\n\tPersonal Information of Student");
			System.out.print("\n\t-------------------------------");
	
			System.out.print("\n Age Of Student : "+ age[searchedPosition]);
			System.out.print("\n Gender Of Student : "+ gen[searchedPosition]);
			System.out.print("\n Caste Of Student : "+ caste[searchedPosition]);			
		}			
	      } while (menuChoice<4);
   }
}
public class SIS
{
 public static void main(String ar[])throws Exception
 {
  Student r=new Student();
  r.Menu1();
 }
}
