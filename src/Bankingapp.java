import java.util.Scanner;
public class Bankingapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accountoperations update=new Accountoperations();
		Account a1= new Account(12345,"Rambo",50000);
		Account a2= new Account(6789,"Rocky",40000);
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter account no=");
		int a=sc.nextInt();
		if (a==a1.getAccountno()) {
			System.out.println("Welcome "+a1.getAccountname()+" You have successfully Logged in\n");
			System.out.println("Please select option: ");
			System.out.println("1.Deposit\n2.Withdrawal\n3.Transfer");
			int x=sc.nextInt();
		 
			switch(x) {
			case 1:
			{ 
				System.out.println("Available balance: "+a1.getAccountbal() );
				System.out.println("Please enter the ammount to be deposited: ");
				int m= sc.nextInt();
				update.deposit(a1, m);
				System.out.println("Updated balance: "+a1.getAccountbal());
				System.out.println("Thank for using banking service !");
				
			}
			break;
			
			case 2:{
				System.out.println("Available balance: "+a1.getAccountbal() );
				System.out.println("Please enter the ammount to be debited: ");
				int n= sc.nextInt();
				update.withdraw(a1, n);
				System.out.println("Updated balance: "+a1.getAccountbal());
				System.out.println("Thank for using banking service !");
				
			}
			break;
			
			case 3:{
				System.out.println("Available balance: "+a1.getAccountbal() );
				System.out.println("Please enter the ammount to be Transffered: ");
				int o= sc.nextInt();
				update.transfer(a2, a1, o);
				System.out.println("Updated balance in your account: "+a1.getAccountbal());
				System.out.println("Updated balance where ammount is transffered: "+a2.getAccountbal());
				System.out.println("Thank for using banking service !");
				
			}
			break;
			
			default:
				{System.out.println("You have entered incorrect account number !");
				}
				break;
				
			}
		}
				
			
				
				else if(a==a2.getAccountno()) {
					System.out.println("Welcome "+a2.getAccountname()+" You have successfully Logged in\n");
					System.out.println("Please select option: ");
					System.out.println("1.Deposit\n2.Withdrawal\n3.Transfer");
					int x=sc.nextInt();
					
					switch(x) {
					case 1:
					{ 
						System.out.println("Available balance: "+a2.getAccountbal() );
						System.out.println("Please enter the ammount to be deposited: ");
						int m= sc.nextInt();
						update.deposit(a2, m);
						System.out.println("Updated balance: "+a2.getAccountbal());
						System.out.println("Thank for using banking service !");
						
					}
					break;
					
					case 2:{
						System.out.println("Available balance: "+a2.getAccountbal() );
						System.out.println("Please enter the ammount to be debited: ");
						int n= sc.nextInt();
						update.withdraw(a2, n);
						System.out.println("Updated balance: "+a2.getAccountbal());
						System.out.println("Thank for using banking service !");
						
					}
					break;
					
					case 3:{
						System.out.println("Available balance: "+a2.getAccountbal() );
						System.out.println("Please enter the ammount to be Transffered: ");
						int o= sc.nextInt();
						update.transfer(a1, a2, o);
						System.out.println("Updated balance in your account: "+a2.getAccountbal());
						System.out.println("Updated balance where ammount is transffered: "+a1.getAccountbal());
						System.out.println("Thank for using banking service !");
						
					}
					break;
					
					default:
						{System.out.println("You have entered incorrect option !");
						}
						break;
						
					}
					
				}
				else
					System.out.println("You have entered incorrect account number !");
				
					
		
	}

}
