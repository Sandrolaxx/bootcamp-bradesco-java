package desafiobancodigital.src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank("SANDOLAXX");
        Integer choice = 0;
        
        while (choice != 3) {
            System.out.println("-------------Bem vindo ao Banco ".concat(bank.getName()).concat("-------------"));
            System.out.println("Informe a opção que deseja:");
            System.out.println("[1] Criar nova conta");
            System.out.println("[2] Lista contas");
            System.out.println("[3] Sair");
            
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    bank.createAccount(input);
                    break;
                case 2:
                    bank.listAccounts();
                    break;
                case 3:
                    System.out.println("Obrigado por utilizar o banco ".concat(bank.getName()));
                    return;
            }
            
        }

        input.close();
	}

}
