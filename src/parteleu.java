import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class parteleu {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList alternativasmula = new ArrayList();

		int inicio, nome;
		String nomeP, simnao, personagem, floresta, regiao, caminho, respostamula;
		boolean menu = true, menu2 = true, menu3 = true, menu4 = true, menu5 = true, menu6 = true;

		System.out.println("   				   * A Floresta Criptografada * \n   ");
		System.out.println(
				" 	    A Floresta Criptografada � um mundo cultural brasileiro de RPG, gratuito e em tempo real. ");
		System.out.println(
				"   Mundo baseado na cultura popular brasileira, expressando a identidade social da comunidade atrav�s de cria��es.");
		System.out.println(
				"          Jogo criado por: Caue Angelo, Gabriel Angeli, Gabriel Borges, Leonardo Lorena e Rafael Gomes.\n");

		do {
			System.out.println("  Escolha uma das op��es abaixo: ");
			System.out.println("       1 � Jogar ");
			System.out.println("       2 � Intru��es ");
			System.out.println("       3 � Cr�ditos ");
			System.out.println("       4 - Sair");
			System.out.println("  Digite a op��o escolhida: ");
			inicio = entrada.nextInt();

			switch (inicio) {
			case 1:

				System.out.println("  Iniciando o jogo...\n");

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
				System.out.println("  Saindo do jogo...");
				System.exit(0);
				break;

			default:
				System.out.println("  Valor Inv�lido, digite novamente.\n");

			}
		} while (inicio > 1);

		System.out.print("  Digite o nome do seu personagem: \n");
		nomeP = entrada.next();

		System.out.println("  Deseja que seu nome seja " + nomeP + "?");
		System.out.println("  Digite SIM ou NAO ");
		simnao = entrada.next();

		while (menu = true) {
			if (simnao.equalsIgnoreCase("SIM")) {
				System.out.println("  Que belo nome " + nomeP + "!!!\n");
				menu = false;
				break;
			} else if (simnao.equalsIgnoreCase("NAO")) {
				System.out.println("  Que pena que n�o deseja ser " + nomeP + ", � um excelente nome.");
				System.out.println("  Digite o nome do seu personagem novamente:\n ");
				nomeP = entrada.next();
				System.out.println("  Agora sim " + nomeP + ", esse nome � realmente melhor.");
				System.out.println("  Deseja que seu nome seja " + nomeP + "?\n");
				System.out.println("  Digite SIM ou NAO ");
				simnao = entrada.next();

			} else {
				System.out.println("  Valor Inv�lido, digite novamente.");
				System.out.println("  Deseja que seu nome seja " + nomeP + "?\n");
				System.out.println("  Digite SIM ou NAO ");
				simnao = entrada.next();

			}
		}

		System.out.println("  Seu personagem ser� Homem ou Mulher? ");
		System.out.println("  Digite HOMEM ou MULHER\n");
		personagem = entrada.next();

		while (menu2 = true) {

			if (personagem.equalsIgnoreCase("Homem")) {
				menu2 = false;
				break;

			} else if (personagem.equalsIgnoreCase("Mulher")) {
				menu2 = false;
				break;

			} else {
				System.out.println("  Comando inv�lido.\n ");
				System.out.println("  Seu personagem ser� Homem ou Mulher? ");
				System.out.println("  Digite HOMEM ou MULHER\n");
				personagem = entrada.next();

			}

		}

		System.out.println("  Escolha uma das regi�es abaixo:\n");
		System.out.println("  *Norte\n" + "  *Nordeste\n" + "   \n  Digite o nome da regi�o para ler mais a respeito.");
		regiao = entrada.next();
		while (menu3 = true) {
			if (regiao.equalsIgnoreCase("Nordeste")) {
				System.out.println(" " + "     A Regi�o Nordeste do Brasil apresenta diversas configura��es quanto\r\n"
						+ "  aos aspectos naturais dos principais elementos da natureza tais como\r\n"
						+ "  relevo, vegeta��o, clima, hidrografia, devido a essas varia��es essa regi�o foi regionalizada\r\n"
						+ "  ou dividida em sub-regi�es, s�o elas zona da mata, meio-norte, agreste e sert�o.\r\n"
						+ "  Clima tropical que possui caracter�sticas de temperaturas elevadas e altos �ndices pluviom�tricos.\r\n"
						+ "  \n " + "  Voc� deseja que essa seja sua regi�o natal??\n   "
						+ "Digite SIM para escolher esta regi�o ou N�O para consultar outras: ");

				simnao = entrada.next();
				if ((simnao.equalsIgnoreCase("SIM"))) {
					menu3 = false;
					break;
				} else if ((simnao.equalsIgnoreCase("NAO"))) {
					System.out.println("  Escolha uma das regi�es abaixo:\n");
					System.out.println("  *Norte\n" + "  *Nordeste\n"
							+ "   \n  Digite o nome da regi�o para ler mais a respeito.");
					regiao = entrada.next();

				}

				else {
					System.out.println("  Digite um valor v�lido.\n");

				}
			} else if (regiao.equalsIgnoreCase("Norte")) {
				System.out.println(" "
						+ "     A regi�o Norte � bastante conhecida por dois aspectos principais: � a maior regi�o do Brasil\r\n"
						+ "  em termos de extens�o territorial e � a que concentra a maior biodiversidade\r\n"
						+ "  gra�as � exist�ncia da Floresta Amaz�nica. Mais da metade dessa floresta est� localizada no territ�rio brasileiro.\r\n"
						+ "  Devido � presen�a da floresta, � na regi�o Norte que percebemos a grande influ�ncia que a\r\n"
						+ "  paisagem natural possui sobre as ocupa��es humanas no espa�o geogr�fico. \r\n" + "  \n "
						+ "  Voc� deseja que essa seja sua regi�o natal??\n   "
						+ "Digite SIM para escolher esta regi�o ou N�O para consultar outras: ");

				simnao = entrada.next();
				if ((simnao.equalsIgnoreCase("SIM"))) {
					menu3 = false;
					break;
				} else if ((simnao.equalsIgnoreCase("NAO"))) {

					System.out.println("  Escolha uma das regi�es abaixo:\n");
					System.out.println("  *Norte\n" + "  *Nordeste\n"
							+ "   \n  Digite o nome da regi�o para ler mais a respeito.");
					regiao = entrada.next();

				}

			}

			else {
				System.out.println("  Digite um valor v�lido.\n");
				System.out.println("  Escolha uma das regi�es abaixo:\n");
				System.out.println(
						"  *Norte\n" + "  *Nordeste\n" + "   \n  Digite o nome da regi�o para ler mais a respeito.");
				regiao = entrada.next();
			}

		}
		System.out.println("    Seja bem vindo " + nomeP + " � nossa Floresta, voc� est� no centro do " + regiao + "."
				+ " O centro do " + regiao + " � um lugar extremante encantador.\n" + "    \n    Habilidades: \n"
				+ "    For�a = 0 || Intelig�ncia = 0 || Coragem = 0 || Sabedoria = 0 || Flexibilidade = 0\n");
		System.out.println("\n" + nomeP + "-  Essa floresta me encanta mais cada dia que passa!  ");
		System.out.println(nomeP + "-  Hoje o c�u est� t�o lindo... O que voc� acha filha?  ");
		System.out.println("Iara-  �... o dia ta lindo e o clima ensolarado.");
		System.out.println(nomeP + "-  Voc� t� bem? To te achando meio pra baixo esses dias  ");
		System.out.println(
				"Iara-  Pai, eu n�o me sinto bem nessa floresta. De dia, ela � um lugar maravilhoso, mas a noite,"
						+ " n�o sei o que acontece, vira um lugar cabreiro.");
		System.out.println(nomeP + "-  Isso � coisa da sua cabe�a, s� existe n�s dois nessa floresta  ");
		System.out.println(
				nomeP + "-  E o mais importante de tudo, enquanto eu estiver aqui, nada de mal acontecer� com voc�  ");
		System.out.println("Iara-  S� n�s?? N�o � isso que eu vejo  ");
		System.out.println("Iara-  Quando voc� vai dormir, eu ou�o vozes e vejo coisas nesta floresta ");
		System.out.println("Iara-  Eu acho, n�o, eu n�o acho, eu tenho certeza que tem algo nessa floresta ");
		System.out.println("Iara-  S� voc� n�o ve... ");
		System.out.println(nomeP + "-  Isso � sua imagina��o  ");
		System.out.println(nomeP + "-  Posso provar que voc� est� errada, a noite vamos explorar esse mato  ");
		System.out.println("\n  A noite fica fria nesta madrugada, como se algo estivesse por vir...");
		System.out.println("  Mas como promessa � compromisso, " + nomeP + " e sua filha sa�ram na madrugada.\n");
		System.out.println(nomeP + "- Juntou tudo o que precisa? Pegarei a vela e poderemos partir ");
		System.out.println("Iara-  Sim, estou pronta.  ");
		System.out.println("Iara-  Tem certeza pai? Quer realmente fazer isso?  ");
		System.out.println(nomeP + "- Sim filha, as vezes precisamos mostrar o que � real e o que n�o �.\n ");
		System.out.println(" ''Por vezes as pessoas n�o querem ouvir a verdade ");
		System.out.println("   porque n�o desejam que as suas ilus�es sejam destru�das.'' ");
		System.out.println("                                      -Friedrich Nietzsche.\n");
		System.out.println("  Voc� e sua filha finalmente chega ao centro da floresta.");
		System.out.println("  Est� tudo muito calmo, at� demais...\n");
		System.out.println(nomeP + "- Pronto, at� que enfim chegamos ");
		System.out.println(nomeP + "- Vamos arrumar nossas coisas para passar a noite aqui ");
		System.out.println("Iara-  Esse lugar me da arrepios, acho que foi uma p�ssima ideia dormir aqui  ");
		System.out.println(
				nomeP + "- Relaxa filha, aqui vai ser bom pra voc�, faz bem descontrair um pouco com a natureza\n ");
		System.out.println("  Com toda calmaria da floresta, voc� e sua filha acaba adormecendo r�pido");
		System.out.println("  Que noite calma! � t�o bom dormir sem barulho nenhu... CRACCC CRACCC!!\n");
		System.out.println(nomeP + "- Filha, que barulho � esse? ");
		System.out.println(nomeP + "- Iara? Pode parar com essa brincadeira de mal gosto ");
		System.out.println(nomeP + "- Iara? Iaraaa???????????? ");
		System.out.println(nomeP + "- Pela mor de deus, algu�m me ajuda!!\n ");
		System.out.println("  Parece que sua filha estava certa...");
		System.out.println("  O seu desespero come�ou a bater, at� que uma luz no meio da floresta surge ");
		System.out.println("  Vindo lentamente em seu cavalo, o negrinho do pastoreio aparece para te ajudar\n");
		System.out.println(nomeP + "- Quem � voc�? ");
		System.out.println("Negrinho do Pastoreio- Parece que voc� est� procurando algo, vim aqui para te ajudar.");
		System.out.println(nomeP + "- Como posso confiar ? Voc� n�o me diz seu nome ");
		System.out.println(
				"Negrinho do Pastoreio- Sua filha foi envenenada e levada pela Cuca, eu vi tudo enquanto voc� estava dormindo");
		System.out.println(nomeP + "- E voc� n�o fez nada?? que tipo de pessoa vc � ?! ");
		System.out.println(
				"Negrinho do Pastoreio- Voc� precisa encontrar a Erva Ca�-Yar�i, ela ir� salvar a sua filha. ");
		System.out.println(
				"Negrinho do Pastoreio- Siga � frente na floresta, e voc� encontrar� uma pessoa que te guiar� at� sua filha.\n ");

		while (menu = true) {

			System.out.println("  Voc� possui tr�s caminhos em sua frente:");
			System.out.println("  Escolha com cuidado e sabedora\n");
			System.out.println("  CAMINHOS: ESQUERDA/MEIO/DIREITA");
			caminho = entrada.next();

			if (caminho.equalsIgnoreCase("esquerda")) {
				menu = false;
				break;
			}

			else if (caminho.equalsIgnoreCase("meio")) {
				menu = false;
				break;
			} else if (caminho.equalsIgnoreCase("direita")) {
				menu = false;
				break;
			} else {
				System.out.println("  Digite um comando v�lido.\n");

			}

		}
		
		System.out.println("\nSaci- Ora ora, o que temos por aqui!");
		System.out.println("Saci- � muito dificil encontrar alguem nesse bosque");
		System.out.println("Saci- Por que andas por aqui?");
		System.out.println(nomeP + "- Estou a procura da Cuca, ela envenenou e levou minha filha");
		System.out.println("Saci- Essa Cuca viu, sempre causando problemas");
		System.out.println(nomeP + "- Voc� conhece ela? ");
		System.out.println("Saci- Sim, por�m voc� precisa passar pelo caminho da mula sem cabe�a");
		System.out.println("Saci- Se voc� quiser, eu posso te ajudar\n");
		while (menu = true) {
			System.out.println("  Voc� aceita a ajuda do Saci?");
			System.out.println("  Digite SIM ou NAO");
			simnao = entrada.next();

			if (simnao.equalsIgnoreCase("sim")) {
				System.out.println("Saci- �tima escolha, voc� n�o conseguiria passar sozinho...\n");
				System.out.println("  Escolher aliados � uma �tima forma de estrat�gia!");
				System.out.println(
						"   For�a = 0 || Intelig�ncia = +20 || Coragem = 0 || Sabedoria = +10 || Flexibilidade = 0");
				int aliados = 1;
				int inteligencia = 20;
				int sabedoria = 10;
				System.out.println("Saci- Antes que a gente chegue na mula sem cabe�a, preciso te avisar...");
				System.out.println(
						"Saci- ...A mula � s� o primeiro de muitos que voc� ir� enfrentar na sua trajet�ria\n");
				System.out.println("    Voc� est� seguindo o Saci pela floresta e encontra a Mula sem cabe�a\n ");
				System.out.println("\nMula - Saci? Voc� aqui novamente? e pelo visto trouxe algu�m");
				System.out.println("Saci- Mula, preciso da sua ajuda para encontrar a crian�a perdida");
				System.out.println("Saci- Poderia me dizer qual caminho � o correto?");
				System.out.println("Mula - As coisas n�o s�o f�ceis assim, eu necessito de uma ajuda");
				System.out.println("Mula - Encontrei um pergaminho encriptado contendo informa��es que eu preciso");
				System.out.println("Mula - Decifre o c�digo e eu deixarei voc�s prosseguirem.\n");

				alternativasmula.add("6");
				alternativasmula.add("5");
				alternativasmula.add("7");
				alternativasmula.add("3");
				alternativasmula.add("2");

				do {
					Collections.shuffle(alternativasmula);
					System.out.println("   RESOLVA A EQUA��O A SEGUIR");
					System.out.println("   DETERMINE O VALOR DE X");
					System.out.println("   *  18x - 43 = 65  * \n");
					System.out.println("A- " + alternativasmula.get(0));
					System.out.println("B- " + alternativasmula.get(1));
					System.out.println("C- " + alternativasmula.get(2));
					System.out.println("D- " + alternativasmula.get(3));
					System.out.println("E- " + alternativasmula.get(4));
					System.out.println("  \n*POR VOC� TER ACEITADO A AJUDA DO SACI, ELE TE AJUDAR� COM O DESAFIO*");
					System.out.println("  * SACI DICA  -  X>5*\n");
					respostamula = entrada.next();
					switch (respostamula.toLowerCase()) {
					case "a":
						if (alternativasmula.get(0).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "b":
						if (alternativasmula.get(1).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "c":
						if (alternativasmula.get(2).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "d":
						if (alternativasmula.get(3).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "e":
						if (alternativasmula.get(4).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					default:
						System.out.println("  Digite um valor v�lido.\n");
						menu = true;
					}

				} while (menu == true);

				menu = false;
				break;
			} else if (simnao.equalsIgnoreCase("nao")) {
				System.out.println("Saci- Bom, te desejo boa sorte!");
				System.out.println("Saci- Mas j� te aviso, n�o ser� nada f�cil...");
				int aliados = 0;
				int inteligencia = 0;
				int sabedoria = 0;

				System.out.println("\n   N�o aceitar ajuda � uma p�ssima forma de estrat�gia!");
				System.out.println(
						"   For�a = 0 || Intelig�ncia = 0 || Coragem = 0 || Sabedoria = 0 || Flexibilidade = 0\n");

				System.out.println("Saci- Antes que a gente chegue na mula sem cabe�a, preciso te avisar...");
				System.out.println(
						"Saci- ...A mula � s� o primeiro de muitos que voc� ir� enfrentar na sua trajet�ria\n");
				System.out.println("    Voc� est� seguindo pela floresta e encontra a Mula sem cabe�a\n ");
				System.out.println("\nMula - Quem � voc� ? Como ousa vir aqui sozinho?");
				System.out.println(nomeP + "- Mula, preciso da sua ajuda para encontrar minha filha");
				System.out.println(nomeP + "- Poderia me dizer qual caminho � o correto?");
				System.out.println("Mula - As coisas n�o s�o f�ceis assim, eu necessito de uma ajuda");
				System.out.println("Mula - Encontrei um pergaminho encriptado contendo informa��es que eu preciso");
				System.out.println("Mula - Decifre o c�digo e eu deixarei voc� prosseguir.\n");

				alternativasmula.add("6");
				alternativasmula.add("5");
				alternativasmula.add("7");
				alternativasmula.add("3");
				alternativasmula.add("2");

				do {
					Collections.shuffle(alternativasmula);
					System.out.println("   RESOLVA A EQUA��O A SEGUIR");
					System.out.println("   DETERMINE O VALOR DE X");
					System.out.println("   *  18x - 43 = 65  * \n");
					System.out.println("A- " + alternativasmula.get(0));
					System.out.println("B- " + alternativasmula.get(1));
					System.out.println("C- " + alternativasmula.get(2));
					System.out.println("D- " + alternativasmula.get(3));
					System.out.println("E- " + alternativasmula.get(4));

					respostamula = entrada.next();
					switch (respostamula.toLowerCase()) {
					case "a":
						if (alternativasmula.get(0).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "b":
						if (alternativasmula.get(1).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "c":
						if (alternativasmula.get(2).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "d":
						if (alternativasmula.get(3).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "e":
						if (alternativasmula.get(4).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					default:
						System.out.println("  Digite um valor v�lido.\n");
						menu = true;
					}

				} while (menu == true);

				break;
			} else {
				System.out.println("  Digite um comando v�lido.\n");
			}

		}

	}
}