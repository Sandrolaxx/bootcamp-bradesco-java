package desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        var firstParam = getInputParam("primeiro");
        var secondParam = getInputParam("segundo");

        try {
            count(firstParam, secondParam);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());

            System.out.println("Obrigado por utilizar a aplicação.");
        }

    }

    static void count(int firstParam, int secondParam) throws ParametrosInvalidosException {

        if (firstParam > secondParam) {
            throw new ParametrosInvalidosException("O segundo valor deve ser maior que o primeiro!");
        }

        int count = (secondParam - firstParam);

        for (Integer index = 1; index < (count + 1); index++) {
            System.out.println("Imprimindo o número ".concat(index.toString()));
        }
    }

    public static Integer getInputParam(String paramName) {
        try {
            System.out.println("Informe o ".concat(paramName).concat(" parâmetro:"));

            return input.nextInt();
        } catch (Exception e) {
            input.nextLine();

            System.out.println("Valor informado invalido! Informe um número inteiro.");

            return getInputParam(paramName);
        }
    }

}
