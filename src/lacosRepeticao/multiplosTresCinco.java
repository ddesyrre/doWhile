package lacosRepeticao;

import java.util.Scanner;

public class multiplosTresCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner readIn = new Scanner(System.in);


	        System.out.print("Digite o primeiro número do intervalo: ");
	        int num1 = readIn.nextInt();
	        System.out.print("Digite o último número do intervalo: ");
	        int num2 = readIn.nextInt();


	        if (num1 > num2) {
	        	 System.out.println("Intervalo Inválido!");
	 	     
	        } else {
	        	 System.out.println("No Intervalo entre " + num1 + " e " + num2 + ":");
	 	        for (int i = num1; i <= num2; i++) {
//	 	            alternativo
//	 	        	if (i % 15 == 0) {
	 	        	if (i % 3 == 0 && i % 5 == 0) {
	 	                System.out.println(i + " é múltiplo de 3 e 5");
	 	            }
	 	        }
	        }
		
	}

}