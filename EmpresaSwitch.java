package LacoDecisao;

import java.util.Scanner;

public class EmpresaSwitch {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String nome, cargo = "";
		float sal,perc = 0,nvsal;
		
		System.out.println("\t Código do Cargo  |      Cargo       |  Percentual do Reajuste");
		System.out.println("\t       1          | Gerente          |            10%      ");
		System.out.println("\t       2          | Vendedor         |            7%       ");
		System.out.println("\t       3          | Supervisor       |            9%       ");
		System.out.println("\t       4          | Motorista        |            6%       ");
		System.out.println("\t       5          | Estoquista       |            5%       ");
		System.out.println("\t       6          | Técnico de TI    |            8%       ");
		
		System.out.print("Nome do colaborador: ");
		nome = ler.nextLine();
		
		System.out.print("Cargo: ");
		int op = ler.nextInt();
		
		System.out.print("Salário: R$ ");
		sal = ler.nextFloat();
		
		switch(op) {
			case 1:
				cargo = "Gerente";
				perc = (float) 0.10;
				break;
			
			case 2:
				cargo = "Vendedor";
				perc = (float) 0.07;
				break;

			case 3:
				cargo = "Supervisor";
				perc = (float) 0.09;
				break;
			
			case 4:
				cargo = "Motorista";
				perc = (float) 0.06;
				break;
			
			case 5:
				cargo = "Estoquista";
				perc = (float) 0.05;
				break;
			
			case 6:
				cargo = "Técnico de TI";
				perc = (float) 0.08;
				break;
			
			default:
				System.out.println("Opção inexistente!");
		}
		if (op > 0 && op <=6) {
		nvsal = (float) sal + (perc * sal);
		System.out.println("\nNome do colaborador: "+nome);
		System.out.println("\nCargo: "+cargo);
		System.out.printf("\nSalário: R$ %.2f",nvsal);
		
		}
	}

}
