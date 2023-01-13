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
