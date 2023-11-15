package LacoDecisao;

import java.util.Scanner;

public class ParEPositivoIf {

	public static void main(String[] args) {
		
		int n;
		Scanner leia =  new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		if (n%2 == 0) {
			if(n >= 0) {
				System.out.println("O Número "+n+" é par e positivo!");
			} else {
				System.out.println("O Número "+n+" é par e negativo!");
			  }
		} else {
			if(n >= 0) {
				System.out.println("O Número "+n+" é impar e positivo!");
			} else {
				System.out.println("O Número "+n+" é impar e negativo!");
			  }
		}
		
	}

}
