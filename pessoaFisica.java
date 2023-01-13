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
