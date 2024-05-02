package lacosRepeticao;

import java.util.Scanner;

public class somaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int soma = 0;


        do {
            System.out.print("Digite um numero: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        System.out.println("\nA soma dos números positivos é: " + soma);
	}

}

