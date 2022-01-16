import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int choice=0;
			do {
				
				
			String menu="""
			 		   Enter 1 for Addition
			 		   Enter 2 for Substraction
			 		   Enter 3 for Multiplication
			 		   Enter 4 for Division
			 		   Enter 5 for Exit
			 		     
			 		 """;
				System.out.println(menu);
				System.out.println("enter your choice");
				 choice= scan.nextInt();
				 System.out.println("Enter two numbers");
				 int firstNumber= scan.nextInt();
				 int secondNumber= scan.nextInt();
				
				switch(choice)
				
				{
				
			     case 1:
			     
					System.out.println("Addition=" +(firstNumber+secondNumber));
					break;
					
			     case 2:
			    	 System.out.println("Substraction=" +(firstNumber-secondNumber));
					 break;
			     case 3:
						System.out.println("Multiplication=" +(firstNumber*secondNumber));
						break;
			     case 4:
						
						System.out.println("Division=" +(firstNumber/secondNumber));
						break;
						
			    default:
			    System.out.println("Wrong choice");
						
			     
				}
				
			}while(choice!=5);
			
				

	}
			

		


	}


