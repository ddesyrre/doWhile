package lacosRepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// Exercicio 3 - WHILE
		
        Scanner scanner = new Scanner(System.in);
        int idade;
        int pessoasAbaixo21 = 0;
        int pessoasAcima50 = 0;

        do {
            System.out.print("Digite uma idade: ");
            idade = scanner.nextInt();

            if (idade >= 0) {
                if (idade < 21) {
                	pessoasAbaixo21++;
                } else if (idade > 50) {
                	pessoasAcima50++;
                }
            }
        } while (idade >= 0);

        System.out.println("Total de pessoas menores de 21 anos: : " + pessoasAbaixo21);
        System.out.println("Total de pessoas maiores de 50 anos: " + pessoasAcima50);
    }
}