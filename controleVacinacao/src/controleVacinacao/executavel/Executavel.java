package controleVacinacao.executavel;

import java.util.Scanner;

import controleVacinacao.classes.Usuario;

//import javax.swing.JOptionPane;

public class Executavel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Usuario u1 = new Usuario();
		
		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Realizar Cadastro");
			System.out.println("2 - Agendar vacinação");
			System.out.println("3 - Consultar dados");
			System.out.println("4 - Sair");
			int op = scan.nextInt();
			switch(op) {
				case 1:
					u1.realizarCadastro();
					break;
				case 2:
					//u1.agendarVacinacao();
					break;
				case 3:
					
					break;
				case 4:
					//exit(1);
			}
	
		}while(true);
		
	
		
	}


}
