
public class Accountoperations {
	
	public void deposit(Account to,float ammount) {
		float x=to.getAccountbal();
		float newbal= x+ ammount;
		to.setAccountbal(newbal);
			
	}
	
	public void withdraw(Account from, float ammount) {
		float x= from.getAccountbal();
		float newbal = x- ammount;
		from.setAccountbal(newbal);
	}
	
	public void transfer(Account to, Account from, float ammount) {
		
		float x= to.getAccountbal();
		float y= from.getAccountbal();
		float newbal1= y-ammount;
		float newbal2=x+ammount;
		
		to.setAccountbal(newbal2);
		from.setAccountbal(newbal1);
		
		
	}

}
