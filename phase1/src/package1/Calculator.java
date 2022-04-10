package package1;
import java.util.*;

public class Calculator {
	 
	     public static void main(String []args){
	         int a,b,choice;
	         float result=0;
	         Scanner sc=new Scanner(System.in); 
	          
	         System.out.print("Enter first number: ");
	         a=sc.nextInt();
	         System.out.print("Enter second number: ");
	         b=sc.nextInt();
	          
	         System.out.print("\n1: Addition \n2: Subtraction \n3: Multiplication \n4: Divide \n6: Exit");
	          
	         System.out.print("\nEnter your choice: ");
	         choice=sc.nextInt();
	          
	         switch(choice)
	         {
	             case 1:
	                 result=(a+b); break;
	             case 2:
	                 result=(a-b); break;
	             case 3:
	                 result=(a*b); break;
	             case 4:
	                 result=(float)((float)a/(float)b); break;
	             default:
	                 System.out.println("Incorrect Choice\n");
	         }
	         if(choice>=1 && choice<=4)
	            System.out.println("Answer is: " + result);
	          
	     }
	
}
