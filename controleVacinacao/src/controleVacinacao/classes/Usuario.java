package controleVacinacao.classes;


public class Usuario extends Pessoa {
	private String cidade;
	private int idade;
	private String telefone;
	private char sexo;
	private String email; 
	
	
	public String getEndereco() {
		return cidade;
	}
	public void setEndereco(String endereco) {
		this.cidade = endereco;
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Usuario [cidade=" + cidade + ", idade=" + idade + ", telefone=" + telefone + ", sexo=" + sexo
				+ ", email=" + email + "]";
	}
	
	
	
	
	//public static void realizarCadastro() {
		//nome = validaNome();
	//	cpf = validaCpf();
		
//	}
	
	//public static String validaNome() {
		//do {
			//Scanner scan = new Scanner(System.in);
			//System.out.println("Informe o nome:");
			//nome = scan.nextLine();
			//if(nome.equals(null)) {
			//	System.out.println("Nome obrigatorio");
			//}
		//}while(nome.equals(null));
		//return nome;
	//}
	/*public static String validaCpf() {
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Informe o cpf:");
			cpf = scan.nextLine();
			Object other;
			if (cpf == null || ) {
				System.out.println("N�mero cpf inv�lido");
			}
		}while();
		return cpf;
	}
	public static int validaCidade() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a cidade:");
		System.out.println("1 - �guas Claras");
		System.out.println("2 - Arniqueira");
		System.out.println("3 - Brazl�ndia");
		System.out.println("4 - Candangol�ndia");
		System.out.println("5 - Ceil�ndia");
		System.out.println("6 - Cruzeiro");
		System.out.println("7 - Fercal");
		System.out.println("8 - Gama");
		System.out.println("9 - Guar�");
		System.out.println("10 - Itapo�");
		System.out.println("11 - Jardim Bot�nico");
		System.out.println("12 - Lago Norte");
		System.out.println("13 - Lago Sul");
		System.out.println("14 - N�cleo Bandeirante");
		System.out.println("15 - Parano�");
		System.out.println("16 - Park Way");
		System.out.println("17 - Planaltina");
		System.out.println("18 - Plano Piloto");
		System.out.println("19 - Recanto das Emas");
		System.out.println("20 - Riacho Fundo I");
		System.out.println("21 - Riacho Fundo II");
		System.out.println("22 - Samambaia");
		System.out.println("23 - Santa Maria");
		System.out.println("24 - S�o Sebasti�o");
		System.out.println("25 - SCIA/Estrutural");
		System.out.println("26 - Sia");
		System.out.println("27 - Sobradinho I");
		System.out.println("28 - Sobradinho II");
		System.out.println("29 - Sol Nascente e P�r do Sol");
		System.out.println("30 - Sudoeste/Octogonal");
		System.out.println("31 - Taguatinga");
		System.out.println("32 - Varj�o");
		System.out.println("33 - Vicente Pires");
		int op = scan.nextInt();
		switch(op) {
		case 1:
		
	}
	*/
	//public static void agendarVacinacao() {
		
	//}
}
