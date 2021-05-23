import java.util.Scanner;

public class Questao1Binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String respostalobisomem;
		boolean lobisomem = true;
		boolean curupira = true;
		boolean escolhaajuda = true;
		String respostacurupira;

		System.out.println(
				"Seguindo adiante, Fulano sabe que seu pr�ximo desafio se encontra na Floresta. Em seu caminho ele encontra mais uma criatura peculiar (fala as caracteristicas do curupira). Ao se aproximar ele diz: ");
		System.out.println();
		System.out.println(
				"Fulano: Eae ? Qual o seu nome ? Pode me ajudar ? Voc� sabe o caminho mais curto da floresta para chegar at� a cuca ? Minha filha foi sequestrada, preciso chegar o mais r�pido poss�vel!");
		System.out.println();
		System.out.println(
				"Criatura misteriosa: Meu nome � curupira, sou o guardi�o das nossas florestas. Eu sei sim um caminho mais curto, por�m voc� precisar� passar pelo Lobisomem. Caso contr�rio demorar� 4 dias para atravessar a floresta.");
		System.out.println();
		System.out.println("Curupira: O lobisomem � uma dos monstros mais perigosos da regi�o, pense bem na sua escolha.");
		System.out.println();
		System.out.println("Fulano: Estou vendo que voc� possui algumas armas, pode me empresta-las ?");
		System.out.println();
		System.out.println("Curupira: J� que mencionou, eu posso te ajudar a derrota-lo, j� fiz isso uma vez. Mas antes preciso de um favor em troca. O que acha ?");
		System.out.println();
		System.out.println();

		do {
			System.out.println("Computador: Voc� aceita a ajuda de Curupira ? Lembre-se que voc� n�o o conhece...");
			System.out.println();
			System.out.println("1 - Aceitar ajuda.");
			System.out.println();
			System.out.println("2 - N�o aceitar ajuda.");
			System.out.println();
			int escolha = entrada.nextInt();

			switch (escolha) {

			case 1:
				System.out.println(
						"Curupira: �tima escolha. A alguns dias atr�s eu encontrei um ca�ador tentando abater um veado. "
								+ "Depois de derrota-lo e amarrar ele, eu roubei seus pertences e peguei esse celular, s� que ele parece usar uma tecnologia mais avan�ada para mim."
								+ "Pode desbloquear ele para mim conseguir resetar e vender ? Se fizer isso eu te ajudo com o problema da floresta...");
				System.out.println();
				do {
					// quest�o
					System.out.println("Resolva o seguinte problema: 1000010001(binario) + 226(octal) + 14B(hexa) + 100(decimal) = x(decimal)");
					System.out.println();
					System.out.println("A - 1110(decimal)");
					System.out.println("B - 1000(decimal)");
					System.out.println("C - 15000(decimal)");
					System.out.println("D - 1200(decimal)");
					System.out.println("E - 1310(decimal)");
					System.out.println();
					respostacurupira = entrada.next();

					switch (respostacurupira) {

					case "A":
					case "a":
						System.out.println(
								"Curupira: Nossa, n�o acredito que voc� conseguiu, vou te ajudar na floresta... ");
						System.out.println();
						System.out.println();
						System.out.println("Computador: Voc� est� seguindo sua jornada para floresta...");
						System.out.println();
						System.out.println("Computador: A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
						System.out.println();
						System.out.println("Computador: O barulho fica cada vez mais alto, voc� olha para o Curupira e percebe que sua fei��o n�o muda, parece at� que eles est� acostumado com aquilo.");
						System.out.println();
						System.out.println("Fulano: Voc� disse que ja tinha derrotado o Lobisomem, como foi isso ?");
						System.out.println();
						System.out.println("Curupira: H� alguns anos tivemos um problema em comum, depois batalhar com ele sei que ele ficou muito fraco. Hoje em dia s� ou�o boatos que ele voltou para floresta e est� mais forte do que antes."
										+ "Mas desde ent�o decidimos n�o entrarmos no caminho um do outro, por isso nunca mais nos encontramos...");
						System.out.println();
						System.out.println();
						System.out.println("SCRHHHHH!!!!!!");
						System.out.println();
						System.out.println();
						System.out.println("Computador: Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala:");
						System.out.println();
						System.out.println("Lobisomem: Quanto tempo em Curupira, pensei que voc� ja tivesse desistido desse lugar...");
						System.out.println();
						System.out.println("Curupira: Eu que pensei que voc� n�o iria mais voltar depois de eu te expulsar, mas pelo visto da pra perceber que voc� n�o mudou mesmo");
						System.out.println();
						System.out.println("Curupira: Mas enfim, n�o quero problemas com voc�, a gente sabe como isso termina... Queria pedir para voc� deixar esse rapaz passar, a filha dele foi sequestrada pela cuca e ele precisa encontrar a Eva mate o quanto antes"
										+ "para derrotar a cuca e recuperar sua filha");
						System.out.println();
						System.out.println("Lobisomem: HAHAHAHAHA! A Cuca j� havia me avisado que ele viria por aqui... E ela me pagou muito mais para leva-lo para ela tamb�m, ent�o pe�o que n�o entre no meu caminho novamente, P� torto!");
						System.out.println();
						System.out.println("Curupira: �... voc� n�o aprendeu nada mesmo.");
						System.out.println();
						System.out.println("Fulano: Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
						System.out.println();
						System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
										+ "Eu devo a ela!");
						System.out.println("Curupira: Vou fazer voc� se arrepender de sua escolha seu lobo mimado.");
						System.out.println();
						System.out.println("Computador: A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."
										+ "Lembre-se que voc� aceitou ajudar o curupira, ent�o voc� possui uma dica para resolver o problema.");
						System.out.println();

						do {
							System.out.println("Desafio: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
											+ "Equa��o1 2�grau: 3x� - 27 = 0"
											+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
											+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2");
							System.out.println();
							System.out.println("Computador: DICA 1 DO CURUPIRA!!!!! Lembre-se que uma equa��o de 2�grau pode possuir um x negativo e uma x positivo, o desafio pede apenas a soma dos resultados positivos.");
							System.out.println();
							System.out.println("DICA 2 DO CURUPIRA!!! Lembre-se do que � MMC (m�nimo m�ltiplo comum) que � o menor n�mero, tamb�m inteiro, que � m�ltiplo de todos esses n�meros ao mesmo tempo. "
											+ "Por exemplo, o MMC entre 2 e 12 � 12, pois os m�ltiplos de 2 s�o 2, 4, 6, 8, 10, 12� e os de 12 s�o: 12, 24, �"
											+ "Isso pode ser �til para resolver essa quest�o...");
							System.out.println();
							System.out.println("A - 24");
							System.out.println("B - 26");
							System.out.println("C - 28");
							System.out.println("D - 21");
							System.out.println("E - 22");
							System.out.println();
							respostalobisomem = entrada.next();

							switch (respostalobisomem) {

							case "A":
							case "a":
								System.out.println("Computador: Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
								lobisomem = false;
								break;
							case "B":
							case "b":
							case "C":
							case "c":
							case "D":
							case "d":
								;
							case "E":
							case "e":
								System.out.println("Computador: Voc� errou, volte para o inicio do jogo e tente novamente!");
								System.exit(0);
							default:
								System.out.println("Computador: Op��o invalida. Responda o desafio apenas com as op��es indicadas.");
								lobisomem = true;
							}
						} while (lobisomem == true);

						curupira = false;
						break;
					case "B":
					case "b":
					case "C":
					case "c":
					case "D":
					case "d":
					case "E":
					case "e":
						System.out.println(
								"Curupira: Pensei que voc� fosse mais inteligente. Vou pedir a ajuda de outra pessoa, pode seguir seu caminho sozinho.");
						System.out.println();
						System.out.println("Computador: Voc� est� seguindo sua jornada para floresta sozinho...");
						System.out.println();
						System.out.println("Computador: A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
						System.out.println();
						System.out.println("Computador: O barulho fica cada vez mais alto.");
						System.out.println();
						System.out.println("Fulano: Isso n�o me cheira nada bem...");
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println("SCRHHHHH!!!!!!");
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println("Computador: Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala:");
						System.out.println();
						System.out.println("Lobisomem: Eu estava esperando por voc�! HAHAHAHA...");
						System.out.println();
						System.out.println("Fulano: Voce deve ser o Lobisomem do qual me avisaram... Pode me ajudar ? Preciso encontrar Eva mate para resgatar minha filha que est� com a Cuca.");
						System.out.println();
						System.out.println("Lobisomem: HAHAHAHAHA! A Cuca j� havia me avisado que viria por aqui... E ela me pagou muito mais para leva-lo para ela, eu aconselho voc� a ir do jeito mais fac�l para n�o se machucar...");
						System.out.println();
						System.out.println("Fulano: Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
						System.out.println();
						System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
										+ "Eu devo a ela!");
						System.out.println();
						System.out.println("Computador: O que o Lobisomem n�o sabe � que Fulano tem habilidades especiais.");
						System.out.println();
						System.out.println("Fulano: Eu n�o quero confus�o, mas farei de tudo para chegar at� minha menina... Nem voc� vai me parar!");
						System.out.println();
						System.out.println("Computador: A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."
										+ "Lembre-se que voc� aceitou ajudar o curupira, ent�o voc� possui uma dica para resolver o problema.");
						System.out.println();

						do {
							System.out.println(
									"Desafio: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
											+ "Equa��o1 2�grau: 3x� - 27 = 0"
											+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
											+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2");
							System.out.println();
							System.out.println("A - 24");
							System.out.println("B - 26");
							System.out.println("C - 28");
							System.out.println("D - 21");
							System.out.println("E - 22");

							// String respostalobisomem;

							respostalobisomem = entrada.next();

							switch (respostalobisomem) {

							case "A":
							case "a":
								System.out.println(
										"Computador: Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
								lobisomem = false;
								break;
							case "B":
							case "b":
							case "C":
							case "c":
							case "D":
							case "d":
							case "E":
							case "e":
								System.out.println("Computador: Voc� errou, volte para o inicio do jogo e tente novamente!");
								System.exit(0);
							default:
								System.out
										.println("Computador: Op��o invalida. Responda o desafio apenas com as op��es indicadas.");
								lobisomem = true;
							}
						} while (lobisomem == true);
						curupira = false;
						break;
					default:
						System.out.println("Computador: Essa op��o � invalida. Responda o desafio apenas com as op��es indicadas.");
						curupira = true;
					}

				} while (curupira == true);
				escolhaajuda = false;
				break;
			case 2:
				System.out.println(
						"Curupira: OK, � voc� quem sabe... espero que tenha muita for�a e coragem para enfrentar o Lobisomem.");
				System.out.println();
				System.out.println("Computador: Voc� est� seguindo sua jornada para floresta sozinho...");
				System.out.println();
				System.out.println("Computador: A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
				System.out.println();
				System.out.println("Computador: O barulho fica cada vez mais alto.");
				System.out.println();
				System.out.println("Fulano: Isso n�o me cheira nada bem...");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("SCRHHHHH!!!!!!");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("Computador: Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala:");
				System.out.println();
				System.out.println("Lobisomem: Eu estava esperando por voc�! HAHAHAHA...");
				System.out.println();
				System.out.println("Fulano: Voce deve ser o Lobisomem do qual me avisaram... Pode me ajudar ? Preciso encontrar Eva mate para resgatar minha filha que est� com a Cuca.");
				System.out.println();
				System.out.println("Lobisomem: HAHAHAHAHA! A Cuca j� havia me avisado que viria por aqui... E ela me pagou muito mais para leva-lo para ela, eu aconselho voc� a ir do jeito mais fac�l para n�o se machucar...");
				System.out.println();
				System.out.println("Fulano: Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
				System.out.println();
				System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
						+ "Eu devo a ela!");
				System.out.println();
				System.out.println("Computador: O que o Lobisomem n�o sabe � que Fulano tem habilidades especiais.");
				System.out.println();
				System.out.println("Fulano: Eu n�o quero confus�o, mas farei de tudo para chegar at� minha menina... Nem voc� vai me parar!");
				System.out.println();
				System.out.println("Computador: A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."
								+ "Lembre-se que voc� aceitou ajudar o curupira, ent�o voc� possui uma dica para resolver o problema.");
				System.out.println();

				do {
					System.out.println("Desafio: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
									+ "Equa��o1 2�grau: 3x� - 27 = 0" + "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
									+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2");
					System.out.println();
					System.out.println("A - 24");
					System.out.println("B - 26");
					System.out.println("C - 28");
					System.out.println("D - 21");
					System.out.println("E - 22");

					// String respostalobisomem;

					respostalobisomem = entrada.next();

					switch (respostalobisomem) {

					case "A":
					case "a":
						System.out.println("Computador: Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
						lobisomem = false;
						break;
					case "B":
					case "b":
					case "C":
					case "c":
					case "D":
					case "d":
					case "E":
					case "e":
						System.out.println("Computador: Voc� errou, volte para o inicio do jogo e tente novamente!");
						System.exit(0);
					default:
						System.out.println("Computador: Op��o invalida. Responda o desafio apenas com as op��es indicadas.");
						lobisomem = true;
					}
				} while (lobisomem == true);

				escolhaajuda = false;
				break;
			default:
				System.out.println("Computador: Op��o invalida. Responda apenas com as op��es apresentadas");
				escolhaajuda = true;
			}
		} while (escolhaajuda == true);

	}
}