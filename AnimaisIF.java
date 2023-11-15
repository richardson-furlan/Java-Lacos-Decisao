package LacoDecisao;

import java.util.Scanner;

public class AnimaisIF {
	
	public static void main(String[] args) {
		String especie, classe, alimento, inv = "Opção inválida";
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite se o Animal é Vertebrado ou Invertebrado: ");
		especie = leia.next();
		
		if(especie.equalsIgnoreCase("vertebrado")){
			System.out.println("\nÉ uma Ave ou um Mamífero: ");
			classe = leia.next();
			
			if(classe.equalsIgnoreCase("ave")) {
				System.out.println("\nÉ Carnívoro ou Onívoro");
				alimento = leia.next();
				if(alimento.equalsIgnoreCase("carnívoro")) {
					System.out.println("\nÁguia");
				} else if(alimento.equalsIgnoreCase("onívoro")) {
					System.out.println("\nPomba");
				} else {
					System.out.println(inv);
				}
			}else if(classe.equalsIgnoreCase("mamífero")){
				System.out.println("\nÉ Onívoro ou Herbívoro");
				alimento = leia.next();
				if(alimento.equalsIgnoreCase("onívoro")) {
					System.out.println("\nHomem");
				} else if(alimento.equalsIgnoreCase("Herbívoro")) {
					System.out.println("\nVaca");
				} else {
					System.out.println(inv);
				}
			}else {
				System.out.println(inv);
			}
		}else if(especie.equalsIgnoreCase("Invertebrado")){
			System.out.println("\nÉ uma Inseto ou um Anelídeo: ");
			classe = leia.next();
			
			if(classe.equalsIgnoreCase("Inseto")) {
				System.out.println("\nÉ Hematófago ou Herbívoro");
				alimento = leia.next();
				if(alimento.equalsIgnoreCase("Hematófago")) {
					System.out.println("\nPulga");
				} else if(alimento.equalsIgnoreCase("Herbívoro")) {
					System.out.println("\nLagarta");
				} else {
					System.out.println("Opção inválida");
				}
			}else if(classe.equalsIgnoreCase("Anelídeo")){
				System.out.println("\nÉ Hematófago ou Onívoro");
				alimento = leia.next();
				if(alimento.equalsIgnoreCase("Hematófago")) {
					System.out.println("\nSanguessuga");
				} else if(alimento.equalsIgnoreCase("Onívoro")) {
					System.out.println("\nMinhoca");
				} else {
					System.out.println(inv);
				}
			}else {
				System.out.println(inv);
			}
		} else {
			System.out.println(inv);
		}
	}
}
