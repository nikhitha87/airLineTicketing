package airLineTicketing;
import java.util.*;
import java.io.*;
/*import userDefinedExceptions.*;*/
class Login {
	public static String takeInput()
	{
		
		System.out.print("Please Enter Login Details");
		System.out.print("UserName : ");
		Console con=System.console();
		String userName =con.readLine();
		System.out.println();
		System.out.print("Password : ");
		char[] password=con.readPassword();
		System.out.println();
		return userName;
	}
	public static boolean validate(String userName)
	{
		if(!userName.equals("Planon") || !userName.equals("planon"))
		{
			//throw new InvalidUserNameException("UserName is Invalid");
			return false;
		}
		return true;
	}
	public static boolean check()
	{
		String userName=takeInput();
		
		try(Scanner in=new Scanner(System.in);)
		{
			if(validate(userName))
			{
				
				return true;
			}
			else
			{
				System.out.println("Do you want to try logging in again? \n Enter y/n");
				char c=in.next().charAt(0);
				switch(c)
				{
				case 'y':
					check();
					break;
				case 'n':
					System.out.println("Thank you");
					in.close();
					System.exit(0);
					break;
				default:
					System.out.println("Invalid input \n Exiting");
					in.close();
					break;
				}
			}
		}
		
		/*catch(InvalidUserNameException e)
		{
			Scanner in=new Scanner(System.in);
			System.out.println(e);
			System.out.println("Do you want to try logging in again? \n Enter y/n");
			char c=in.next().charAt(0);
			switch(c)
			{
			case 'y':
				check();
				break;
			case 'n':
				System.out.println("Thank you");
				in.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input \n Exiting");
				in.close();
				break;
			}
		}*/
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to AirLine Ticket booking portal ");
		Scanner in=new Scanner(System.in);
		//String userName=takeInput();
		if(check())
		{
			System.out.println("Logged in Succesfully");
			System.out.println("Enter the operation number of your choice");
			System.out.println("1:Book Tickets");
			System.out.println("2:Ticket Details");
			System.out.println("3:Exit");
			int n=in.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("Book Tickets");
				//BookTickets obj=new BookTickets();
				break;
			case 2:
				System.out.println("Ticket Details");
				//TicketDetails td=new TicketDetails();
				break;
			case 3:
				System.out.println("Exiting");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				System.out.println("Exiting");
				System.exit(0);
			}
		}
			
		
		
		
		
	}

}
