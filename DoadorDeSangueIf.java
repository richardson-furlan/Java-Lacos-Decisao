package LacoDecisao;

import java.util.Scanner;

public class DoadorDeSangueIf {

	public static void main(String[] args) {
		
		Scanner leia =  new Scanner(System.in);
		
		String nome;
		int idade;
		boolean ndoador;
		
		System.out.println("\nDigite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nÉ a primeira doação: digite true para sim e false para não");
		ndoador = leia.nextBoolean();
		
		if ((idade >= 18 && idade < 60) || (idade >=60 && idade <= 69 && !ndoador) )  {
			
			System.out.println(nome+" está apto para doar sangue!");					
		
		} else {
			System.out.println(nome+" não está apto para doar sangue!");
		}
	}

}
