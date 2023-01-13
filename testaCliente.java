package PolimorfismoHeranca;

import java.util.Scanner;

public class testaCliente {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		System.out.println("\nPrimeiro teste de Cliente");
		pessoaFisica pessoaFisica1 = new pessoaFisica ("ZECA","SP", "1199999999", 33333333333L, 2222222222L);
		pessoaFisica pessoaFisica2 = new pessoaFisica ("MIRELA","RJ", "1199999999", 33333333333L, 2222222222L);
		pessoaJuridica pessoaJuridica1 = new pessoaJuridica ("Marombicho LTDA","SP","1158585858",44343000144L,"Lojas Marombicho");
		pessoaJuridica pessoaJuridica2 = new pessoaJuridica ("Legolas Alimentação e Conveniência","SP","1177777777",22323000122L,"Legolas Conveniência");
			pessoaFisica1.imprimirPF();
			pessoaFisica2.imprimirPF();
		
			
		System.out.println("Instanciando 2 objetos PF!: ");
			System.out.println("Coloque um nome mais bonito para pessoaFisica1: ");
			pessoaFisica1.setNome(leia.next());
			System.out.println("\nVamos ver se deu certo!!");
			pessoaFisica1.imprimirPF();
			System.out.println("Mirela está como RJ, mas seu telefone é de SP acho que você errou.\n arrume isso setando seu estado agora: ");
			pessoaFisica2.setEstado(leia.next());
			System.out.println("\nVamos ver se deu certo!!");
			pessoaFisica2.imprimirPF();
			System.out.println("ok...");
			
			System.out.println("\nPrimeiro teste de PJ");
			pessoaJuridica1.imprimirPJ();
			pessoaJuridica2.imprimirPJ();
			
		System.out.println("Instanciando 2 objetos PF!: ");
			System.out.println("Marombicho mudou o telefone por problemas com a justiça, mude aqui para a gente: ");
			pessoaJuridica1.setTelefone(leia.next());
			System.out.println("\nVamos ver se deu certo!!");
			pessoaJuridica1.imprimirPJ();
			System.out.println("Legolas é uma tabacaria e está como Conveniência, mude isso!: ");
			pessoaJuridica2.setNome(leia.next());
			System.out.println("\nVamos ver se deu certo!!");
			pessoaJuridica2.imprimirPJ();
			
			
			
	}
	

}
