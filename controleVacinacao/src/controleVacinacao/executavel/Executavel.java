package controleVacinacao.executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controleVacinacao.classes.Usuario;
import primeiroPrograma.classes.Aluno;

//import javax.swing.JOptionPane;

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
					List<Usuario> usuario = new ArrayList<Usuario>();
					
					realizarCadastro();
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
