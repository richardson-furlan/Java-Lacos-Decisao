package LacoDecisao;

import java.util.Scanner;

public class ContaBancariaSwitch {

	public static void main(String[] args) {
		float valor,saldo = 1000;
		int op;
		Scanner leia = new Scanner(System.in);

		System.out.println("Código da Operação | Operação");
		System.out.println("        1          | Saldo");
		System.out.println("        2          | Saque");
		System.out.println("        3          | Depósito");
		System.out.println("\nDigite o código da operação: ");
		op = leia.nextInt();
		
		switch (op) {
			case 1: 
				System.out.println("Operação - Saldo");
				System.out.printf("\nSaldo: R$ %.2f",saldo);
				break;
			
			case 2:
				System.out.println("Operação - Saque");
				System.out.println("\nDigite o Valor a ser sacado: ");
				valor = leia.nextFloat();
				
				if(valor <= saldo) {
					System.out.printf("\nNovo Saldo: R$ %.2f",(saldo-valor));
				} else {
					System.out.println("\nSaldo Insuficiente!");
				}
				break;
				
			case 3:
				System.out.println("Operação - Depósito");
				System.out.println("\nDigite o Valor a ser depositado: ");
				valor = leia.nextFloat();
				
				System.out.printf("\nNovo Saldo: R$ %.2f",(saldo+valor));
				break;
				
			default:
				System.out.println("Operação Inválida!");
				
		}
	
	
	}

}
