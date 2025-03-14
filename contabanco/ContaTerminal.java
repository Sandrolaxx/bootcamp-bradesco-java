package contabanco;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bem vindo ao banco DIO-SANDROLAX!");

        var accNumber = getAccountNumber();

        var agency = getAgency();

        clearBuffer();

        var customerName = getCustomerName();

        var balance = getBalance();

        var message = "Olá ".concat(customerName)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agency).concat(", conta ").concat(accNumber.toString())
                .concat(" e seu saldo R$ ").concat(balance.toString())
                .concat(" e já está disponível para saque.");

        System.out.println(message);
    }

    public static Integer getAccountNumber() {
        try {
            System.out.println("Informe o número da conta:");

            return input.nextInt();
        } catch (Exception e) {
            clearBuffer();

            System.out.println("Valor informado invalido! Informe um número inteiro.");

            return getAccountNumber();
        }
    }

    public static String getAgency() {
        System.out.println("Informe a agência:");

        return input.next();
    }

    public static String getCustomerName() {
        System.out.println("Informe seu nome:");

        return input.nextLine();
    }

    public static void clearBuffer() {
        input.nextLine();
    }

    public static BigDecimal getBalance() {

        try {
            System.out.println("Informe o saldo da conta(Formato 00,00):");

            return input.nextBigDecimal();
        } catch (Exception e) {
            clearBuffer();

            System.out.println("Valor informado invalido! Informe de acordo com o padrão esperado.");

            return getBalance();
        }
    }

}
