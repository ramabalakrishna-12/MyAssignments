package week3.assignment1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Minimum Deposit Amount is 5000");
	}

	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();

	}

}
/*Method Override Assignment:

Class     :BankInfo
    Methods :saving(),fixed(),deposit()

     Class     :AxisBank
     Methods :deposit()

Description:
You have to override the method deposit in AxisBank.
*/