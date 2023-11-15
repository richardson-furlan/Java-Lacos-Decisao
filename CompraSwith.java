package LacoDecisao;

import java.util.Scanner;

public class CompraSwith {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int op,qtd, preco=1;
		String prod = "";
		
		System.out.println("\tCódigo do produto |      Produto     |  Preço Unitário");
		System.out.println("\t       1          | Cachorro Quente  |  R$ 10.00      ");
		System.out.println("\t       2          | X-Salada         |  R$ 15.00      ");
		System.out.println("\t       3          | X-Bacon          |  R$ 18.00      ");
		System.out.println("\t       4          | Bauru            |  R$ 12.00      ");
		System.out.println("\t       5          | Refrigerante     |  R$ 8.00       ");
		System.out.println("\t       6          | Suco de Laranja  |  R$ 13.00      ");
		
		System.out.println("\n\nEntre com o código do produto: ");
		op = ler.nextInt();
		
		System.out.println("\nDigite a Quantidade: ");
		qtd = ler.nextInt();
		
		switch (op) {
			case 1:
				prod = "Cachorro Quente";
				preco = 10;
				break;
		
			case 2:
				prod = "X-Salada";
				preco = 15;
				break;
		
			case 3:
				prod = "X-Bacon";
				preco = 18;
				break;
		 
			case 4:
				prod = "Bauru";
				preco = 12;
				break;
		 
			case 5:
				prod = "Refrigerante";
				preco = 8;
				break;
		 
			case 6:
				prod = "Suco de Laranja";
				preco = 13;
				break;
			default:
				System.out.println("Produto não existe!");
			 
		}
		float vtotal = qtd * preco;
		System.out.println("Produto: "+prod);
		System.out.printf("Valor total: R$ %.2f",vtotal);
	}

}
