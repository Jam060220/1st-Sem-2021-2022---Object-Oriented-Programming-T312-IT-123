import java.util.*;
public class Age
{
  public static void main(String args[])
  {
    //User will enter the age and the program will check he/she is eligible to vote or not..
    Scanner sc = new Scanner(System.in);
    int age = 0; //initial variables must be declared and initialized by zero in java..
    System.out.print("Enter the age :");
    age = sc.nextInt();
    if(age &gt= 18)
    {
      System.out.println("The User is Eligible To Vote.");
    }
    else
    {
      System.out.println("The User is not Eligible To Vote.");
    }
    sc.close();
  }
} 