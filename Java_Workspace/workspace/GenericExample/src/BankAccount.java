
public class BankAccount {
	int accNumber;
	String accHolderName;
	
	public BankAccount(int accNumber,String accHolderName) {
		
		//accBalance=0;
		this.accNumber=accNumber;
		this.accHolderName=accHolderName;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	@Override
	public String toString() {
		return "BankAccount [accNumber=" + accNumber + ", accHolderName=" + accHolderName + "]";
	}


}
