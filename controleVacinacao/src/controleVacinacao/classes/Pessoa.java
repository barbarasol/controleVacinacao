package controleVacinacao.classes;

public abstract class Pessoa {
	protected static String nome;
	protected static String cpf;
	protected static String rg;
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Pessoa.nome = nome;
	}
	public static String getCpf() {
		return cpf;
	}
	public static void setCpf(String cpf) {
		Pessoa.cpf = cpf;
	}
	public static String getRg() {
		return rg;
	}
	public static void setRg(String rg) {
		Pessoa.rg = rg;
	}
	
	
	
	
}
