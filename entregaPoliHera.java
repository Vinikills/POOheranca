package PolimorfismoHeranca;

public class Cliente {
	private String nome;
	private String estado;
	private String telefone;
	public Cliente(String nome, String estado,String telefone) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
package PolimorfismoHeranca;

public class pessoaFisica extends Cliente {
	private long cpf;
	private long rg;

	pessoaFisica (String nome, String estado, String telefone, long cpf, long rg){
		super(nome,estado,telefone);
		this.cpf = cpf;
		this.rg = rg;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}
	public void imprimirPF () {
		System.out.println("Nome: "+getNome()+"\nEstado: "+getEstado()+"\nTelefone: "+getTelefone()+"\nCPF: "+getCpf()+"\nRG: "+getRg());	
	}

}
package PolimorfismoHeranca;

public class pessoaJuridica extends Cliente {
	private long cnpj;
	private String nomeFantasia;
	pessoaJuridica (String nome, String estado, String telefone, long cnpj, String nomeFantasia){
		super (nome, estado, telefone);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public void imprimirPJ() {
		System.out.println("Nome: "+getNome()+"\nEstado: "+getEstado()+"\nTelefone: "+getTelefone()+"\nCNPJ: "+getCnpj()+"\nNome Fantasia: "+getNomeFantasia());
	}
}
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
