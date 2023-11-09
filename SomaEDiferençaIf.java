package LacoDecisao;

import java.util.Scanner;

public class SomaEDiferençaIf {

	public static void main(String[] args) {

		int a,b,c,soma;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número A: ");
		a = leia.nextInt();
		
		System.out.println("\nDigite o número B: ");
		b = leia.nextInt();
		
		System.out.println("\nDigite o número C: ");
		c = leia.nextInt();
		
		soma = a+b;
		
		
		if (soma > c) { 
			System.out.println(a+" + "+b+" = "+soma+" > "+c);		
			System.out.println("A soma de A+B é Maior do que C");
		} else if(soma < c) { 
			System.out.println(a+" + "+b+" = "+soma+" < "+c);
			System.out.println("A soma de A+B é Menor do que C");
		} else {
			System.out.println(a+" + "+b+" = "+soma+" = "+c);
			System.out.println("A soma de A+B é Igual a C");
		}

	}
}