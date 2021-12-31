package oopsConceptPart2;

public class HsbcBank implements UsBank,BrazilBank {//we are achieving multiple interfaces
	//Is a relationship
			
	//If a class is implementing any interface, 
	//then it's mandatory to define/override all the 
	//interface methods
	public void credit()
	{
		System.out.println("Hsbc Bank-----Credit");
	}
	public void debit() {
		System.out.println("Hsbc Bank-----debit");
	}
	public void transferMoney() {
		System.out.println("Hsbc Bank-----TansferMoney");
		
	}
	public void CarLoan()
	{
		System.out.println("Hsbc Bank ---- Car Loan");
	}
	public void Mortgage() {
		System.out.println("Hsbc Bank ----- Mortgage");
	}
	
	//BrazilBank Method
	public void mutualfund() {
		System.out.println("BrazilBank mutualfund");
	}
	
}
