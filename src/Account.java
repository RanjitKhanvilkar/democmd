
public class Account {
	
	private int accountno;
	private String accountname;
	private float accountbal;
	
	
	//constructor
	public Account(int accountno, String accountname, float accountbal) {
		super();
		this.accountno = accountno;
		this.accountname = accountname;
		this.accountbal = accountbal;
	}


	
	// getters and setters

	public int getAccountno() {
		return accountno;
	}



	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}



	public String getAccountname() {
		return accountname;
	}



	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}



	public float getAccountbal() {
		return accountbal;
	}



	public void setAccountbal(float accountbal) {
		this.accountbal = accountbal;
	}
	
	

}


