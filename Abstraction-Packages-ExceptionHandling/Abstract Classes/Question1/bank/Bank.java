/* Create a class called GeneralBank that acts as base class for all banks. This class has getSavingsInterestRate 
and getFixedDepositInterestRate methods, which returns the savings account interest rate and fixed deposit
 account interest rate that the specific bank gives. Since GeneralBank cannot say what percentage which bank 
would give, make these methods abstract.*/

package bank;
public class Bank {
	public static void main(String args[]) {
		ICICIBank i=new ICICIBank();
		KotMBank k=new KotMBank();
		System.out.println("Saving "+i.getSavingsInterestRate()+"%");
		System.out.println("Fixed "+i.getFixedDepositInterestRate()+"%");
		System.out.println("Saving "+k.getSavingsInterestRate()+"%");
		System.out.println("Fixed "+k.getFixedDepositInterestRate()+"%");
		GeneralBank g2=new KotMBank();
		GeneralBank g1=new ICICIBank();
		System.out.println("Saving "+g1.getSavingsInterestRate()+"%");
		System.out.println("Fixed "+g1.getFixedDepositInterestRate()+"%");
		System.out.println("Saving "+g2.getSavingsInterestRate()+"%");
		System.out.println("Fixed "+g2.getFixedDepositInterestRate()+"%");
	}

}
