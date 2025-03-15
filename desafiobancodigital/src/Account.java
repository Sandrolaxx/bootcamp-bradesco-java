package desafiobancodigital.src;

public class Account implements IAccount {
	
	private static final int DEFAULT_AGENCY = 1;
	private static int SEQUENCE = 1;

	private int agency;

	private int number;
	
    private double balance;

    private EnumAccountType type;
	
    private Customer customer;

	public Account(Customer customer, EnumAccountType accountType) {
		this.agency = Account.DEFAULT_AGENCY;
		this.number = SEQUENCE++;
        this.type = accountType;
		this.customer = customer;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void transfer(double amount, IAccount targetAccount) {
		this.withdraw(amount);
		targetAccount.deposit(amount);
	}

	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public EnumAccountType getType() {
        return type;
    }

    protected void printAccInfo() {
        System.out.println("-----------------------------------------------------------------------");
		System.out.println(String.format("Titular: %s", this.customer.getName()));
		System.out.println(String.format("Agencia: %d", this.agency));
		System.out.println(String.format("Numero: %d", this.number));
		System.out.println(String.format("Tipo da conta: %s", this.type.getDescription()));
		System.out.println(String.format("Saldo: %.2f", this.balance));
	}
    
    @Override
    public void printStatementBalance() {
        System.out.println("Apresentando saldo da ".concat(type.getDescription().toLowerCase()));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }
}
