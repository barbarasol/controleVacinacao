package controleVacinacao.executavel;

import java.util.Scanner;

//import javax.swing.JOptionPane;

//import controleVacinacao.classes.Pessoa;

public class Executavel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Realizar Cadastro");
			System.out.println("2 - Agendar vacinação");
			System.out.println("3 - Consultar dados");
			System.out.println("4 - Sair");
			int op = scan.nextInt();
			switch(op) {
				case 1:
					//cadastrar();
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					//exit(1);
			}
			
					
			
		}while(true);
		
		
		
		
		//Pessoa p1 = new Pessoa();
		
		
		//String nome = JOptionPane.showInputDialog("Qual o nome da pessoa ?");
		
		//p1.setNome(nome);
		
		//System.out.println(p1);
	}

}
