import java.util.Scanner;

public class JOGO {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int inicio;
		System.out.println("   				   * A Floresta Criptografada * \n   ");
		System.out.println(
				" 	    A Floresta Criptografada � um mundo cultural brasileiro de RPG, gratuito e em tempo real. ");
		System.out.println(
				"   Mundo baseado na cultura popular brasileira, expressando a identidade social da comunidade atrav�s de cria��es.");
		System.out.println(
				"          Jogo criado por: Caue Angelo, Gabriel Angeli, Gabriel Borges, Leonardo Lorena e Rafael Gomes.\n");

		do {
			//inicio do menu do jogo.
			System.out.println("  Escolha uma das op��es abaixo: ");
			System.out.println("        1 � Jogar");
			System.out.println("        2 � Intru��es");
			System.out.println("       3 � Cr�ditos ");
			System.out.println("       4 - sair");
			System.out.println("  Digite a op��o escolhida: ");
			inicio = entrada.nextInt();

			//switch para usuario escolher op��o desejada.
			switch (inicio) {

			case 1:
				System.out.println("iniciando o jogo...");
				break;

			case 2:
				System.out.println(
						"  Crie seu personagem e fa�a suas pr�prias caracter�sticas de acordo com seu modo de jogo.\n"
								+ "  Suas escolhas interferem diretamente no seu destino, pense bem antes de fazer sua escolha.\n "
								+ " Selecione apenas os valores v�lidos.\n");
				break;

			case 3:
				System.out.println(
						"  Jogo criado por: Caue Angelo, Gabriel Angeli, Gabriel Borges, Leonardo Lorena e Rafael Gomes.\n"
								+ "  Projeto Integrador: Desenvolvimento de L�gica.\n"
								+ "  Centro Universit�rio Senac - Grupo 6.\n ");
				break;
			case 4:
				System.out.println("SAIU DO JOGO!!!!!");
				System.exit(0);
	
				break;
			default:
				System.out.println("Valor Inv�lido, digite novamente.\n");
			}
			//caso usuario escolha a op�ao de jogar ou sair ele sai do la�o do while.
		} while (inicio != 1 && inicio != 4);

		System.out.println("jogo");
		
	}
}
