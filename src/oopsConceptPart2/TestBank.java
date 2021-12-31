package oopsConceptPart2;

public class TestBank {
	
	public static void main(String[] args) {
		
		System.out.println(UsBank.min_bal);
		
		HsbcBank hs = new HsbcBank();
		hs.credit();
		hs.debit();
		hs.Mortgage();
		hs.transferMoney();
		hs.CarLoan();
		hs.mutualfund();
		
		//Dynamic Polymorphism
		//Child class object can be referred by parent interface variable
		UsBank ub=new HsbcBank();
		ub.credit();
		ub.debit();
		ub.transferMoney();
		
		
	}

}
