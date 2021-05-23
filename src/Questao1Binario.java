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
				"Seguindo adiante, Fulano sabe que seu próximo desafio se encontra na Floresta. Em seu caminho ele encontra mais uma criatura peculiar (fala as caracteristicas do curupira). Ao se aproximar ele diz: ");
		System.out.println();
		System.out.println(
				"Fulano: Eae ? Qual o seu nome ? Pode me ajudar ? Você sabe o caminho mais curto da floresta para chegar até a cuca ? Minha filha foi sequestrada, preciso chegar o mais rápido possível!");
		System.out.println();
		System.out.println(
				"Criatura misteriosa: Meu nome é curupira, sou o guardião das nossas florestas. Eu sei sim um caminho mais curto, porém você precisará passar pelo Lobisomem. Caso contrário demorará 4 dias para atravessar a floresta.");
		System.out.println();
		System.out.println("Curupira: O lobisomem é uma dos monstros mais perigosos da região, pense bem na sua escolha.");
		System.out.println();
		System.out.println("Fulano: Estou vendo que você possui algumas armas, pode me empresta-las ?");
		System.out.println();
		System.out.println("Curupira: Já que mencionou, eu posso te ajudar a derrota-lo, já fiz isso uma vez. Mas antes preciso de um favor em troca. O que acha ?");
		System.out.println();
		System.out.println();

		do {
			System.out.println("Computador: Você aceita a ajuda de Curupira ? Lembre-se que você não o conhece...");
			System.out.println();
			System.out.println("1 - Aceitar ajuda.");
			System.out.println();
			System.out.println("2 - Não aceitar ajuda.");
			System.out.println();
			int escolha = entrada.nextInt();

			switch (escolha) {

			case 1:
				System.out.println(
						"Curupira: Ótima escolha. A alguns dias atrás eu encontrei um caçador tentando abater um veado. "
								+ "Depois de derrota-lo e amarrar ele, eu roubei seus pertences e peguei esse celular, só que ele parece usar uma tecnologia mais avançada para mim."
								+ "Pode desbloquear ele para mim conseguir resetar e vender ? Se fizer isso eu te ajudo com o problema da floresta...");
				System.out.println();
				do {
					// questão
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
								"Curupira: Nossa, não acredito que você conseguiu, vou te ajudar na floresta... ");
						System.out.println();
						System.out.println();
						System.out.println("Computador: Você está seguindo sua jornada para floresta...");
						System.out.println();
						System.out.println("Computador: A floresta é densa e escura, ao ouvir alguns barulhos estranhos você já sente calafrios e um arrepio na nuca. Mas o medo nunca irá vencer sua esperança e fé de encontrar sua filha...");
						System.out.println();
						System.out.println("Computador: O barulho fica cada vez mais alto, você olha para o Curupira e percebe que sua feição não muda, parece até que eles está acostumado com aquilo.");
						System.out.println();
						System.out.println("Fulano: Você disse que ja tinha derrotado o Lobisomem, como foi isso ?");
						System.out.println();
						System.out.println("Curupira: Há alguns anos tivemos um problema em comum, depois batalhar com ele sei que ele ficou muito fraco. Hoje em dia só ouço boatos que ele voltou para floresta e está mais forte do que antes."
										+ "Mas desde então decidimos não entrarmos no caminho um do outro, por isso nunca mais nos encontramos...");
						System.out.println();
						System.out.println();
						System.out.println("SCRHHHHH!!!!!!");
						System.out.println();
						System.out.println();
						System.out.println("Computador: Derepente da escuridão surge uma criatura enorme (fala as características do lobisomem) e fala:");
						System.out.println();
						System.out.println("Lobisomem: Quanto tempo em Curupira, pensei que você ja tivesse desistido desse lugar...");
						System.out.println();
						System.out.println("Curupira: Eu que pensei que você não iria mais voltar depois de eu te expulsar, mas pelo visto da pra perceber que você não mudou mesmo");
						System.out.println();
						System.out.println("Curupira: Mas enfim, não quero problemas com você, a gente sabe como isso termina... Queria pedir para você deixar esse rapaz passar, a filha dele foi sequestrada pela cuca e ele precisa encontrar a Eva mate o quanto antes"
										+ "para derrotar a cuca e recuperar sua filha");
						System.out.println();
						System.out.println("Lobisomem: HAHAHAHAHA! A Cuca já havia me avisado que ele viria por aqui... E ela me pagou muito mais para leva-lo para ela também, então peço que não entre no meu caminho novamente, Pé torto!");
						System.out.println();
						System.out.println("Curupira: É... você não aprendeu nada mesmo.");
						System.out.println();
						System.out.println("Fulano: Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
						System.out.println();
						System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
										+ "Eu devo a ela!");
						System.out.println("Curupira: Vou fazer você se arrepender de sua escolha seu lobo mimado.");
						System.out.println();
						System.out.println("Computador: A batalha com o Lobisomem irá acontecer, prepare-se para resolver o desafio."
										+ "Lembre-se que você aceitou ajudar o curupira, então você possui uma dica para resolver o problema.");
						System.out.println();

						do {
							System.out.println("Desafio: Faça a soma apenas do resultado positivo da seginte equação de 2°grau com o resultado da equação de 1°grau."
											+ "Equação1 2°grau: 3x² - 27 = 0"
											+ "Equação2 1°grau: x(x - 14) + (x/3 + 7) = 42"
											+ "Resposta = Resultado positivo equação1 + resultado equação2");
							System.out.println();
							System.out.println("Computador: DICA 1 DO CURUPIRA!!!!! Lembre-se que uma equação de 2°grau pode possuir um x negativo e uma x positivo, o desafio pede apenas a soma dos resultados positivos.");
							System.out.println();
							System.out.println("DICA 2 DO CURUPIRA!!! Lembre-se do que é MMC (mínimo múltiplo comum) que é o menor número, também inteiro, que é múltiplo de todos esses números ao mesmo tempo. "
											+ "Por exemplo, o MMC entre 2 e 12 é 12, pois os múltiplos de 2 são 2, 4, 6, 8, 10, 12… e os de 12 são: 12, 24, …"
											+ "Isso pode ser útil para resolver essa questão...");
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
								System.out.println("Computador: Você acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
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
								System.out.println("Computador: Você errou, volte para o inicio do jogo e tente novamente!");
								System.exit(0);
							default:
								System.out.println("Computador: Opção invalida. Responda o desafio apenas com as opções indicadas.");
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
								"Curupira: Pensei que você fosse mais inteligente. Vou pedir a ajuda de outra pessoa, pode seguir seu caminho sozinho.");
						System.out.println();
						System.out.println("Computador: Você está seguindo sua jornada para floresta sozinho...");
						System.out.println();
						System.out.println("Computador: A floresta é densa e escura, ao ouvir alguns barulhos estranhos você já sente calafrios e um arrepio na nuca. Mas o medo nunca irá vencer sua esperança e fé de encontrar sua filha...");
						System.out.println();
						System.out.println("Computador: O barulho fica cada vez mais alto.");
						System.out.println();
						System.out.println("Fulano: Isso não me cheira nada bem...");
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println("SCRHHHHH!!!!!!");
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println("Computador: Derepente da escuridão surge uma criatura enorme (fala as características do lobisomem) e fala:");
						System.out.println();
						System.out.println("Lobisomem: Eu estava esperando por você! HAHAHAHA...");
						System.out.println();
						System.out.println("Fulano: Voce deve ser o Lobisomem do qual me avisaram... Pode me ajudar ? Preciso encontrar Eva mate para resgatar minha filha que está com a Cuca.");
						System.out.println();
						System.out.println("Lobisomem: HAHAHAHAHA! A Cuca já havia me avisado que viria por aqui... E ela me pagou muito mais para leva-lo para ela, eu aconselho você a ir do jeito mais facíl para não se machucar...");
						System.out.println();
						System.out.println("Fulano: Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
						System.out.println();
						System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
										+ "Eu devo a ela!");
						System.out.println();
						System.out.println("Computador: O que o Lobisomem não sabe é que Fulano tem habilidades especiais.");
						System.out.println();
						System.out.println("Fulano: Eu não quero confusão, mas farei de tudo para chegar até minha menina... Nem você vai me parar!");
						System.out.println();
						System.out.println("Computador: A batalha com o Lobisomem irá acontecer, prepare-se para resolver o desafio."
										+ "Lembre-se que você aceitou ajudar o curupira, então você possui uma dica para resolver o problema.");
						System.out.println();

						do {
							System.out.println(
									"Desafio: Faça a soma apenas do resultado positivo da seginte equação de 2°grau com o resultado da equação de 1°grau."
											+ "Equação1 2°grau: 3x² - 27 = 0"
											+ "Equação2 1°grau: x(x - 14) + (x/3 + 7) = 42"
											+ "Resposta = Resultado positivo equação1 + resultado equação2");
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
										"Computador: Você acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
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
								System.out.println("Computador: Você errou, volte para o inicio do jogo e tente novamente!");
								System.exit(0);
							default:
								System.out
										.println("Computador: Opção invalida. Responda o desafio apenas com as opções indicadas.");
								lobisomem = true;
							}
						} while (lobisomem == true);
						curupira = false;
						break;
					default:
						System.out.println("Computador: Essa opção é invalida. Responda o desafio apenas com as opções indicadas.");
						curupira = true;
					}

				} while (curupira == true);
				escolhaajuda = false;
				break;
			case 2:
				System.out.println(
						"Curupira: OK, é você quem sabe... espero que tenha muita força e coragem para enfrentar o Lobisomem.");
				System.out.println();
				System.out.println("Computador: Você está seguindo sua jornada para floresta sozinho...");
				System.out.println();
				System.out.println("Computador: A floresta é densa e escura, ao ouvir alguns barulhos estranhos você já sente calafrios e um arrepio na nuca. Mas o medo nunca irá vencer sua esperança e fé de encontrar sua filha...");
				System.out.println();
				System.out.println("Computador: O barulho fica cada vez mais alto.");
				System.out.println();
				System.out.println("Fulano: Isso não me cheira nada bem...");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("SCRHHHHH!!!!!!");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("Computador: Derepente da escuridão surge uma criatura enorme (fala as características do lobisomem) e fala:");
				System.out.println();
				System.out.println("Lobisomem: Eu estava esperando por você! HAHAHAHA...");
				System.out.println();
				System.out.println("Fulano: Voce deve ser o Lobisomem do qual me avisaram... Pode me ajudar ? Preciso encontrar Eva mate para resgatar minha filha que está com a Cuca.");
				System.out.println();
				System.out.println("Lobisomem: HAHAHAHAHA! A Cuca já havia me avisado que viria por aqui... E ela me pagou muito mais para leva-lo para ela, eu aconselho você a ir do jeito mais facíl para não se machucar...");
				System.out.println();
				System.out.println("Fulano: Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
				System.out.println();
				System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
						+ "Eu devo a ela!");
				System.out.println();
				System.out.println("Computador: O que o Lobisomem não sabe é que Fulano tem habilidades especiais.");
				System.out.println();
				System.out.println("Fulano: Eu não quero confusão, mas farei de tudo para chegar até minha menina... Nem você vai me parar!");
				System.out.println();
				System.out.println("Computador: A batalha com o Lobisomem irá acontecer, prepare-se para resolver o desafio."
								+ "Lembre-se que você aceitou ajudar o curupira, então você possui uma dica para resolver o problema.");
				System.out.println();

				do {
					System.out.println("Desafio: Faça a soma apenas do resultado positivo da seginte equação de 2°grau com o resultado da equação de 1°grau."
									+ "Equação1 2°grau: 3x² - 27 = 0" + "Equação2 1°grau: x(x - 14) + (x/3 + 7) = 42"
									+ "Resposta = Resultado positivo equação1 + resultado equação2");
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
						System.out.println("Computador: Você acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
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
						System.out.println("Computador: Você errou, volte para o inicio do jogo e tente novamente!");
						System.exit(0);
					default:
						System.out.println("Computador: Opção invalida. Responda o desafio apenas com as opções indicadas.");
						lobisomem = true;
					}
				} while (lobisomem == true);

				escolhaajuda = false;
				break;
			default:
				System.out.println("Computador: Opção invalida. Responda apenas com as opções apresentadas");
				escolhaajuda = true;
			}
		} while (escolhaajuda == true);

	}
}