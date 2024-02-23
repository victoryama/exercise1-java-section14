package entities;

public class BusinessAccount extends Account{ //define a herança
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //chamando o construtor da super classe classe account
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10; 
		}
	}
	
	@Override //super, chamar a implementação de uma superclasse
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -=2.0;
	}
	
}
