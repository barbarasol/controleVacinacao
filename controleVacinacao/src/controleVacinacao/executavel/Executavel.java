package controleVacinacao.executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controleVacinacao.classes.Usuario;

public class Executavel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i=0;
		do {		
			System.out.println("Escolha uma opção");
			System.out.println("1 - Realizar Cadastro");
			System.out.println("2 - Agendar Vacinação");
			System.out.println("3 - Consultar dados");
			System.out.println("4- Sair");
			int op = input.nextInt();
			List<Usuario> usuarios = new ArrayList<Usuario>();
			Usuario usuario1 = new Usuario();
				switch(op) {
				case 1:				
					System.out.println("Informe o nome");
					usuario1.setNome(input.nextLine());
					
					System.out.println("Informe o idade");
					usuario1.setIdade(input.nextInt());
					
					System.out.println("Informe o cpf");
					usuario1.setCpf(input.nextLine());
					
					System.out.println("Informe o rg");
					usuario1.setRg(input.nextLine());
					
					System.out.println("Informe o telefone");
					usuario1.setTelefone(input.nextLine());
					
					System.out.println("Informe o email");
					usuario1.setEmail(input.nextLine());
					
					System.out.println("Informe a cidade");
					usuario1.setCidade(input.nextLine());
			
					
					usuarios.add(usuario1);
					
					System.out.println(usuarios);
					
				//	for (Usuario usuario : usuarios) {
				//		System.out.println(usuario.getNome());	
				//	}
									
					i++;
					//realizarCadastro();
					break;
				case 2:
					//u1.agendarVacinacao();
					break;
				case 3:
					//for (Usuario usuario : usuarios) {
				//		System.out.println(usuario.getNome());
				//	}
					
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
