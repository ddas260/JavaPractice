package encapsulation;

public class Deposit {
	private double BALANCE = 0d;
	public void setBALANCE(double BALANCE) {
		if(BALANCE>0) {
			this.BALANCE += BALANCE;
		}
		else {
			System.out.println("Nothing to deposit");
		}
		
	}
	public double getBALANCE() {
		return BALANCE;
		
	}
}
