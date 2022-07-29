package p1;
import java.util.*;

public class MyClass {

		 public static void main(String args[])
		   {
			 Age();
		  }
		 public static void Age() {
			 String name;
		        int Id;    
		         
		        Scanner SC=new Scanner(System.in);
		         
		        System.out.print("Enter Your Full Name: ");
		        name= SC.nextLine();
		         
		        System.out.print("Enter Voter's Id: ");
		        Id=SC.nextInt();
		   
		        System.out.println("Enter your age: ");
		      int age=SC.nextInt();
		      
		      if((age>=18)&&(age<=100))
		      {
		          System.out.println("Congratulation , You are eligible for Voting, Have a great Day!\n");
		          System.out.println("[ INFO! ]");
		          System.out.println("Name: " + name);
		          System.out.println("Age: " + age);
		          System.out.println("Voters Id: " + Id);
		        
		          
		      }
		      else
		      {
		          System.out.println("Sorry, You are not eligible for voting\n");
		          System.out.println("[ INFO! ] ");
		          System.out.println("Name: " + name);
		          System.out.println("Voters Id: " + Id);		        
		          System.out.println("Age: " + age);
		      }      
		 }
		}
