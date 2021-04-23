package controleVacinacao.classes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Usuario extends Pessoa {
	private String endereco;
	private int idade;
	private String telefone;
	private char sexo;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
		
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	public static void realizarCadastro() {
		nome = validaNome();
		cpf = validaCpf();
		
	}
	
	public static String validaNome() {
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Informe o nome:");
			nome = scan.nextLine();
			if(nome.equals(null)) {
				System.out.println("Nome obrigatorio");
			}
		}while(nome.equals(null));
		return nome;
	}
	public static String validaCpf() {
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Informe o cpf:");
			cpf = scan.nextLine();
			Object other;
			if (cpf == null || cpf.equals(other.cpf)) {
				System.out.println("Número cpf inválido");
			}
		}while();
		return cpf;
	}
	
	//public static void agendarVacinacao() {
		
	//}
}
