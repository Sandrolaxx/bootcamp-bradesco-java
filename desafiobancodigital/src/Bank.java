package desafiobancodigital.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

	private String name;

	private List<Account> accounts = new ArrayList<>();

	public Bank(String name) {
        this.name = name;
    }

    public void createAccount(Scanner input) {
        Customer customer = new Customer();

        input.nextLine();

        System.out.println("Informe o seu nome:");
		customer.setName(input.nextLine());
        
        System.out.println("Informe o typo da conta: [1] Salário - [2] Corrente");
        int choice = input.nextInt();

        var accountType = choice == 1 ? EnumAccountType.SALARY_ACCOUNT : EnumAccountType.CHECKING_ACCOUNT;
		
		Account ca = new Account(customer, accountType);

        accounts.add(ca);

        System.out.println("Informações da conta criada:");
        ca.printAccInfo();
    }

    public void listAccounts() {
        
        if (accounts.isEmpty()) {
            System.out.println("Listagem de contas: Nenhum registro até o momento.");

            return;
        }
        
        System.out.println("Listagem de contas:");
        accounts.forEach(Account::printAccInfo);
    }

    public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> contas) {
		this.accounts = contas;
	}

}
