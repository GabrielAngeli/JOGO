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
				" 	    A Floresta Criptografada é um mundo cultural brasileiro de RPG, gratuito e em tempo real. ");
		System.out.println(
				"   Mundo baseado na cultura popular brasileira, expressando a identidade social da comunidade através de criações.");
		System.out.println(
				"          Jogo criado por: Caue Angelo, Gabriel Angeli, Gabriel Borges, Leonardo Lorena e Rafael Gomes.\n");

		do {
			System.out.println("  Escolha uma das opções abaixo: ");
			System.out.println("       1 – Jogar ");
			System.out.println("       2 – Intruções ");
			System.out.println("       3 – Créditos ");
			System.out.println("       4 - Sair");
			System.out.println("  Digite a opção escolhida: ");
			inicio = entrada.nextInt();

			switch (inicio) {
			case 1:

				System.out.println("  Iniciando o jogo...\n");

				break;
			case 2:
				System.out.println(
						"  Crie seu personagem e faça suas próprias características de acordo com seu modo de jogo.\n"
								+ "  Suas escolhas interferem diretamente no seu destino, pense bem antes de fazer sua escolha.\n "
								+ " Selecione apenas os valores válidos.\n");

				break;
			case 3:
				System.out.println(
						"  Jogo criado por: Caue Angelo, Gabriel Angeli, Gabriel Borges, Leonardo Lorena e Rafael Gomes.\n"
								+ "  Projeto Integrador: Desenvolvimento de Lógica.\n"
								+ "  Centro Universitário Senac - Grupo 6.\n ");
				break;
			case 4:
				System.out.println("  Saindo do jogo...");
				System.exit(0);
				break;

			default:
				System.out.println("  Valor Inválido, digite novamente.\n");

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
				System.out.println("  Que pena que não deseja ser " + nomeP + ", é um excelente nome.");
				System.out.println("  Digite o nome do seu personagem novamente:\n ");
				nomeP = entrada.next();
				System.out.println("  Agora sim " + nomeP + ", esse nome é realmente melhor.");
				System.out.println("  Deseja que seu nome seja " + nomeP + "?\n");
				System.out.println("  Digite SIM ou NAO ");
				simnao = entrada.next();

			} else {
				System.out.println("  Valor Inválido, digite novamente.");
				System.out.println("  Deseja que seu nome seja " + nomeP + "?\n");
				System.out.println("  Digite SIM ou NAO ");
				simnao = entrada.next();

			}
		}

		System.out.println("  Seu personagem será Homem ou Mulher? ");
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
				System.out.println("  Comando inválido.\n ");
				System.out.println("  Seu personagem será Homem ou Mulher? ");
				System.out.println("  Digite HOMEM ou MULHER\n");
				personagem = entrada.next();

			}

		}

		System.out.println("  Escolha uma das regiões abaixo:\n");
		System.out.println("  *Norte\n" + "  *Nordeste\n" + "   \n  Digite o nome da região para ler mais a respeito.");
		regiao = entrada.next();
		while (menu3 = true) {
			if (regiao.equalsIgnoreCase("Nordeste")) {
				System.out.println(" " + "     A Região Nordeste do Brasil apresenta diversas configurações quanto\r\n"
						+ "  aos aspectos naturais dos principais elementos da natureza tais como\r\n"
						+ "  relevo, vegetação, clima, hidrografia, devido a essas variações essa região foi regionalizada\r\n"
						+ "  ou dividida em sub-regiões, são elas zona da mata, meio-norte, agreste e sertão.\r\n"
						+ "  Clima tropical que possui características de temperaturas elevadas e altos índices pluviométricos.\r\n"
						+ "  \n " + "  Você deseja que essa seja sua região natal??\n   "
						+ "Digite SIM para escolher esta região ou NÃO para consultar outras: ");

				simnao = entrada.next();
				if ((simnao.equalsIgnoreCase("SIM"))) {
					menu3 = false;
					break;
				} else if ((simnao.equalsIgnoreCase("NAO"))) {
					System.out.println("  Escolha uma das regiões abaixo:\n");
					System.out.println("  *Norte\n" + "  *Nordeste\n"
							+ "   \n  Digite o nome da região para ler mais a respeito.");
					regiao = entrada.next();

				}

				else {
					System.out.println("  Digite um valor válido.\n");

				}
			} else if (regiao.equalsIgnoreCase("Norte")) {
				System.out.println(" "
						+ "     A região Norte é bastante conhecida por dois aspectos principais: é a maior região do Brasil\r\n"
						+ "  em termos de extensão territorial e é a que concentra a maior biodiversidade\r\n"
						+ "  graças à existência da Floresta Amazônica. Mais da metade dessa floresta está localizada no território brasileiro.\r\n"
						+ "  Devido à presença da floresta, é na região Norte que percebemos a grande influência que a\r\n"
						+ "  paisagem natural possui sobre as ocupações humanas no espaço geográfico. \r\n" + "  \n "
						+ "  Você deseja que essa seja sua região natal??\n   "
						+ "Digite SIM para escolher esta região ou NÃO para consultar outras: ");

				simnao = entrada.next();
				if ((simnao.equalsIgnoreCase("SIM"))) {
					menu3 = false;
					break;
				} else if ((simnao.equalsIgnoreCase("NAO"))) {

					System.out.println("  Escolha uma das regiões abaixo:\n");
					System.out.println("  *Norte\n" + "  *Nordeste\n"
							+ "   \n  Digite o nome da região para ler mais a respeito.");
					regiao = entrada.next();

				}

			}

			else {
				System.out.println("  Digite um valor válido.\n");
				System.out.println("  Escolha uma das regiões abaixo:\n");
				System.out.println(
						"  *Norte\n" + "  *Nordeste\n" + "   \n  Digite o nome da região para ler mais a respeito.");
				regiao = entrada.next();
			}

		}
		System.out.println("    Seja bem vindo " + nomeP + " à nossa Floresta, você está no centro do " + regiao + "."
				+ " O centro do " + regiao + " é um lugar extremante encantador.\n" + "    \n    Habilidades: \n"
				+ "    Força = 0 || Inteligência = 0 || Coragem = 0 || Sabedoria = 0 || Flexibilidade = 0\n");
		System.out.println("\n" + nomeP + "-  Essa floresta me encanta mais cada dia que passa!  ");
		System.out.println(nomeP + "-  Hoje o céu está tão lindo... O que você acha filha?  ");
		System.out.println("Iara-  É... o dia ta lindo e o clima ensolarado.");
		System.out.println(nomeP + "-  Você tá bem? To te achando meio pra baixo esses dias  ");
		System.out.println(
				"Iara-  Pai, eu não me sinto bem nessa floresta. De dia, ela é um lugar maravilhoso, mas a noite,"
						+ " não sei o que acontece, vira um lugar cabreiro.");
		System.out.println(nomeP + "-  Isso é coisa da sua cabeça, só existe nós dois nessa floresta  ");
		System.out.println(
				nomeP + "-  E o mais importante de tudo, enquanto eu estiver aqui, nada de mal acontecerá com você  ");
		System.out.println("Iara-  Só nós?? Não é isso que eu vejo  ");
		System.out.println("Iara-  Quando você vai dormir, eu ouço vozes e vejo coisas nesta floresta ");
		System.out.println("Iara-  Eu acho, não, eu não acho, eu tenho certeza que tem algo nessa floresta ");
		System.out.println("Iara-  Só você não ve... ");
		System.out.println(nomeP + "-  Isso é sua imaginação  ");
		System.out.println(nomeP + "-  Posso provar que você está errada, a noite vamos explorar esse mato  ");
		System.out.println("\n  A noite fica fria nesta madrugada, como se algo estivesse por vir...");
		System.out.println("  Mas como promessa é compromisso, " + nomeP + " e sua filha saíram na madrugada.\n");
		System.out.println(nomeP + "- Juntou tudo o que precisa? Pegarei a vela e poderemos partir ");
		System.out.println("Iara-  Sim, estou pronta.  ");
		System.out.println("Iara-  Tem certeza pai? Quer realmente fazer isso?  ");
		System.out.println(nomeP + "- Sim filha, as vezes precisamos mostrar o que é real e o que não é.\n ");
		System.out.println(" ''Por vezes as pessoas não querem ouvir a verdade ");
		System.out.println("   porque não desejam que as suas ilusões sejam destruídas.'' ");
		System.out.println("                                      -Friedrich Nietzsche.\n");
		System.out.println("  Você e sua filha finalmente chega ao centro da floresta.");
		System.out.println("  Está tudo muito calmo, até demais...\n");
		System.out.println(nomeP + "- Pronto, até que enfim chegamos ");
		System.out.println(nomeP + "- Vamos arrumar nossas coisas para passar a noite aqui ");
		System.out.println("Iara-  Esse lugar me da arrepios, acho que foi uma péssima ideia dormir aqui  ");
		System.out.println(
				nomeP + "- Relaxa filha, aqui vai ser bom pra você, faz bem descontrair um pouco com a natureza\n ");
		System.out.println("  Com toda calmaria da floresta, você e sua filha acaba adormecendo rápido");
		System.out.println("  Que noite calma! É tão bom dormir sem barulho nenhu... CRACCC CRACCC!!\n");
		System.out.println(nomeP + "- Filha, que barulho é esse? ");
		System.out.println(nomeP + "- Iara? Pode parar com essa brincadeira de mal gosto ");
		System.out.println(nomeP + "- Iara? Iaraaa???????????? ");
		System.out.println(nomeP + "- Pela mor de deus, alguém me ajuda!!\n ");
		System.out.println("  Parece que sua filha estava certa...");
		System.out.println("  O seu desespero começou a bater, até que uma luz no meio da floresta surge ");
		System.out.println("  Vindo lentamente em seu cavalo, o negrinho do pastoreio aparece para te ajudar\n");
		System.out.println(nomeP + "- Quem é você? ");
		System.out.println("Negrinho do Pastoreio- Parece que você está procurando algo, vim aqui para te ajudar.");
		System.out.println(nomeP + "- Como posso confiar ? Você não me diz seu nome ");
		System.out.println(
				"Negrinho do Pastoreio- Sua filha foi envenenada e levada pela Cuca, eu vi tudo enquanto você estava dormindo");
		System.out.println(nomeP + "- E você não fez nada?? que tipo de pessoa vc é ?! ");
		System.out.println(
				"Negrinho do Pastoreio- Você precisa encontrar a Erva Caá-Yaríi, ela irá salvar a sua filha. ");
		System.out.println(
				"Negrinho do Pastoreio- Siga à frente na floresta, e você encontrará uma pessoa que te guiará até sua filha.\n ");

		while (menu = true) {

			System.out.println("  Você possui três caminhos em sua frente:");
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
				System.out.println("  Digite um comando válido.\n");

			}

		}
		
		System.out.println("\nSaci- Ora ora, o que temos por aqui!");
		System.out.println("Saci- É muito dificil encontrar alguem nesse bosque");
		System.out.println("Saci- Por que andas por aqui?");
		System.out.println(nomeP + "- Estou a procura da Cuca, ela envenenou e levou minha filha");
		System.out.println("Saci- Essa Cuca viu, sempre causando problemas");
		System.out.println(nomeP + "- Você conhece ela? ");
		System.out.println("Saci- Sim, porém você precisa passar pelo caminho da mula sem cabeça");
		System.out.println("Saci- Se você quiser, eu posso te ajudar\n");
		while (menu = true) {
			System.out.println("  Você aceita a ajuda do Saci?");
			System.out.println("  Digite SIM ou NAO");
			simnao = entrada.next();

			if (simnao.equalsIgnoreCase("sim")) {
				System.out.println("Saci- Ótima escolha, você não conseguiria passar sozinho...\n");
				System.out.println("  Escolher aliados é uma ótima forma de estratégia!");
				System.out.println(
						"   Força = 0 || Inteligência = +20 || Coragem = 0 || Sabedoria = +10 || Flexibilidade = 0");
				int aliados = 1;
				int inteligencia = 20;
				int sabedoria = 10;
				System.out.println("Saci- Antes que a gente chegue na mula sem cabeça, preciso te avisar...");
				System.out.println(
						"Saci- ...A mula é só o primeiro de muitos que você irá enfrentar na sua trajetória\n");
				System.out.println("    Você está seguindo o Saci pela floresta e encontra a Mula sem cabeça\n ");
				System.out.println("\nMula - Saci? Você aqui novamente? e pelo visto trouxe alguém");
				System.out.println("Saci- Mula, preciso da sua ajuda para encontrar a criança perdida");
				System.out.println("Saci- Poderia me dizer qual caminho é o correto?");
				System.out.println("Mula - As coisas não são fáceis assim, eu necessito de uma ajuda");
				System.out.println("Mula - Encontrei um pergaminho encriptado contendo informações que eu preciso");
				System.out.println("Mula - Decifre o código e eu deixarei vocês prosseguirem.\n");

				alternativasmula.add("6");
				alternativasmula.add("5");
				alternativasmula.add("7");
				alternativasmula.add("3");
				alternativasmula.add("2");

				do {
					Collections.shuffle(alternativasmula);
					System.out.println("   RESOLVA A EQUAÇÃO A SEGUIR");
					System.out.println("   DETERMINE O VALOR DE X");
					System.out.println("   *  18x - 43 = 65  * \n");
					System.out.println("A- " + alternativasmula.get(0));
					System.out.println("B- " + alternativasmula.get(1));
					System.out.println("C- " + alternativasmula.get(2));
					System.out.println("D- " + alternativasmula.get(3));
					System.out.println("E- " + alternativasmula.get(4));
					System.out.println("  \n*POR VOCÊ TER ACEITADO A AJUDA DO SACI, ELE TE AJUDARÁ COM O DESAFIO*");
					System.out.println("  * SACI DICA  -  X>5*\n");
					respostamula = entrada.next();
					switch (respostamula.toLowerCase()) {
					case "a":
						if (alternativasmula.get(0).equals("6")) {
							System.out.println("Mula- Até que você é inteligente...");
							System.out.println("Mula- Não conseguia de jeito nenhum!\n");
							System.out.println(
									"   Você recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   Força = 0 || Inteligência = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro também...\n");

						}
						break;

					case "b":
						if (alternativasmula.get(1).equals("6")) {
							System.out.println("Mula- Até que você é inteligente...");
							System.out.println("Mula- Não conseguia de jeito nenhum!\n");
							System.out.println(
									"   Você recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   Força = 0 || Inteligência = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro também...\n");

						}
						break;

					case "c":
						if (alternativasmula.get(2).equals("6")) {
							System.out.println("Mula- Até que você é inteligente...");
							System.out.println("Mula- Não conseguia de jeito nenhum!\n");
							System.out.println(
									"   Você recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   Força = 0 || Inteligência = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro também...\n");

						}
						break;

					case "d":
						if (alternativasmula.get(3).equals("6")) {
							System.out.println("Mula- Até que você é inteligente...");
							System.out.println("Mula- Não conseguia de jeito nenhum!\n");
							System.out.println(
									"   Você recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   Força = 0 || Inteligência = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro também...\n");

						}
						break;

					case "e":
						if (alternativasmula.get(4).equals("6")) {
							System.out.println("Mula- Até que você é inteligente...");
							System.out.println("Mula- Não conseguia de jeito nenhum!\n");
							System.out.println(
									"   Você recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   Força = 0 || Inteligência = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro também...\n");

						}
						break;

					default:
						System.out.println("  Digite um valor válido.\n");
						menu = true;
					}

				} while (menu == true);

				menu = false;
				break;
			} else if (simnao.equalsIgnoreCase("nao")) {
				System.out.println("Saci- Bom, te desejo boa sorte!");
				System.out.println("Saci- Mas já te aviso, não será nada fácil...");
				int aliados = 0;
				int inteligencia = 0;
				int sabedoria = 0;

				System.out.println("\n   Não aceitar ajuda é uma péssima forma de estratégia!");
				System.out.println(
						"   Força = 0 || Inteligência = 0 || Coragem = 0 || Sabedoria = 0 || Flexibilidade = 0\n");

				System.out.println("Saci- Antes que a gente chegue na mula sem cabeça, preciso te avisar...");
				System.out.println(
						"Saci- ...A mula é só o primeiro de muitos que você irá enfrentar na sua trajetória\n");
				System.out.println("    Você está seguindo pela floresta e encontra a Mula sem cabeça\n ");
				System.out.println("\nMula - Quem é você ? Como ousa vir aqui sozinho?");
				System.out.println(nomeP + "- Mula, preciso da sua ajuda para encontrar minha filha");
				System.out.println(nomeP + "- Poderia me dizer qual caminho é o correto?");
				System.out.println("Mula - As coisas não são fáceis assim, eu necessito de uma ajuda");
				System.out.println("Mula - Encontrei um pergaminho encriptado contendo informações que eu preciso");
				System.out.println("Mula - Decifre o código e eu deixarei você prosseguir.\n");

				alternativasmula.add("6");
				alternativasmula.add("5");
				alternativasmula.add("7");
				alternativasmula.add("3");
				alternativasmula.add("2");

				do {
					Collections.shuffle(alternativasmula);
					System.out.println("   RESOLVA A EQUAÇÃO A SEGUIR");
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
							System.out.println("Mula- Até que você é inteligente...");
							System.out.println("Mula- Não conseguia de jeito nenhum!\n");
							System.out.println(
									"   Você recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   Força = 0 || Inteligência = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro também...\n");

						}
						break;

					case "b":
						if (alternativasmula.get(1).equals("6")) {
							System.out.println("Mula- Até que você é inteligente...");
							System.out.println("Mula- Não conseguia de jeito nenhum!\n");
							System.out.println(
									"   Você recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   Força = 0 || Inteligência = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro também...\n");

						}
						break;

					case "c":
						if (alternativasmula.get(2).equals("6")) {
							System.out.println("Mula- Até que você é inteligente...");
							System.out.println("Mula- Não conseguia de jeito nenhum!\n");
							System.out.println(
									"   Você recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   Força = 0 || Inteligência = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro também...\n");

						}
						break;

					case "d":
						if (alternativasmula.get(3).equals("6")) {
							System.out.println("Mula- Até que você é inteligente...");
							System.out.println("Mula- Não conseguia de jeito nenhum!\n");
							System.out.println(
									"   Você recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   Força = 0 || Inteligência = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro também...\n");

						}
						break;

					case "e":
						if (alternativasmula.get(4).equals("6")) {
							System.out.println("Mula- Até que você é inteligente...");
							System.out.println("Mula- Não conseguia de jeito nenhum!\n");
							System.out.println(
									"   Você recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   Força = 0 || Inteligência = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro também...\n");

						}
						break;

					default:
						System.out.println("  Digite um valor válido.\n");
						menu = true;
					}

				} while (menu == true);

				break;
			} else {
				System.out.println("  Digite um comando válido.\n");
			}

		}

	}
}