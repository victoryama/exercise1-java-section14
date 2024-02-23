package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
	
		//Upcasting: pegar um objeto BusinessAccount e atribuir uma variável do tipo Account
		//Pegar um objeto de uma subclasse a atribuir para uma variável de uma superclasse
		Account acc1 = bacc; //conta empresarial é uma conta
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 0.01);
		
		//Downcasting: converter um objeto da superclasse para subclasse
		BusinessAccount acc4 = (BusinessAccount)acc2; //como a acc2 é uma Account, mesmo q seja uma upcasting, precisa fazer um casting manual
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; 
		//por ser uma SavingsAccount, vai dar um problema por não ser BusinessAccount
		
		//testando intancia
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan!"); 
		}
		
		if (acc3 instanceof SavingsAccount){
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");  
		}
		
		//Sobreposição
		acc.withdraw(200.00);
		System.out.println(acc.getBalance());
		
		Account acc5= new SavingsAccount(1004, "Anna", 1000.0, 0.01);
		acc5.withdraw(200);
		System.out.println(acc5.getBalance());
	
		//Super
		Account acc6 = new BusinessAccount(1006, "Bob", 1000.0, 500.0); 
		acc6.withdraw(200.00);
		System.out.println(acc6.getBalance());
		
		//Polimorfismo
		//x e y do mesmo tipo account
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1032, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
