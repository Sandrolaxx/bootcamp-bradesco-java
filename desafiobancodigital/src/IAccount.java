package desafiobancodigital.src;

public interface IAccount {
	
	void withdraw(double amount);
	
	void deposit(double amount);
	
	void transfer(double amount, IAccount targetAccount);
	
	void printStatementBalance();

}
