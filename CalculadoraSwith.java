package LacoDecisao;

import java.util.Scanner;

public class CalculadoraSwith {

	public static void main(String[] args) {

		float n1,n2;
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o 1º número: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nDigite o 2º número: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nDigite o operador sendo: ");
		System.out.println("\n1- Soma");
		System.out.println("\n2- Subtração");
		System.out.println("\n3- Multiplicação");
		System.out.println("\n4- Divisão");
		op = leia.nextInt();
		
		switch (op) {
			case 1 : 
				System.out.println(n1+" + "+n2+" = "+(n1+n2));
				break;
				
			case 2 : 
				System.out.println(n1+" - "+n2+" = "+(n1-n2));
				break;
				
			case 3 : 
				System.out.println(n1+" * "+n2+" = "+(n1*n2));
				break;
				
			case 4 : 
				System.out.println(n1+" / "+n2+" = "+(n1/n2));
				break;
				
			default:
				System.out.println("\nOperação Inválida!");
		}
		
	}

}
