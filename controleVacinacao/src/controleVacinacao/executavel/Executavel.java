package controleVacinacao.executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import controleVacinacao.classes.Usuario;

public class Executavel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=0;
		do {
		
			System.out.println("Escolha uma opção");
			System.out.println("1 - Realizar Cadastro");
			System.out.println("2 - Agendar Vacinação");
			System.out.println("3 - Consultar dados");
			System.out.println("4- Sair");
			int op = scan.nextInt();
			List<Usuario> usuarios = new ArrayList<Usuario>();
				switch(op) {
				case 1:
					String nome = JOptionPane.showInputDialog("Informe o nome:");
					String idade = JOptionPane.showInputDialog("Qual a idade?");
					String rg = JOptionPane.showInputDialog("Qual o registro geral?");
					String cpf = JOptionPane.showInputDialog("Qual o cpf?");
					
					
					System.out.println("Informe o nome");
					

					Usuario usuario1 = new Usuario();
					usuario1.setNome(nome);
					usuario1.setIdade(Integer.valueOf(idade));
					usuario1.setRg(rg);
					usuario1.setCpf(cpf);
					
					usuarios.add(usuario1);
					for (Usuario usuario : usuarios) {
						System.out.println(usuario.getNome());	
					}
									
					i++;
					//realizarCadastro();
					break;
				case 2:
					//u1.agendarVacinacao();
					break;
				case 3:
					for (Usuario usuario : usuarios) {
						System.out.println(usuario.getNome());
					}
					
					break;
				case 4:
					System.exit(0);
			}
	
		}while(i<2);
		
		
		
		
		
		//int abrir = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um tipo de acesso: "
		//		+ "\n1 - Usuário" + 
		///		"\n2 - Administrador"));
		//if (abrir == 1) {
			//acesso usuario
	//	}else if(abrir == 2){
			//acesso admin
		//}else {
		//	System.out.println("Tipo acesso inválido");
	//	}
		
	}

//}


}
