import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;
import java.nio.file.FileSystemAlreadyExistsException;

public class CucaEvaMate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		boolean ervamate = false; // boolean para sair do looping do desafio da erva-mate
		ArrayList alternativaservamate = new ArrayList();
		String respostaervamate;
		boolean cuca = false;
		ArrayList alternativascuca = new ArrayList();
		String respostacuca;
		boolean jogotodo = false;
		
		
		do {
			
		System.out.println("COMPUTADOR: Logo após muito sacrifício e muito esforço, você conseguiu passar pelo monstro mais temido da floresta. Agora está continuando sua jornada em busca da Erva mate para ela te ajudar a encontrar "
						+ "sua filha e derrotar a cuca.\n");
		System.out.println(
				"COMPUTADOR: Como o Neguinho do Pastoreiro te contou, a Erva está nessa região da floresta, basta você se concentrar e orar para encontra-la.\n");
		System.out.println(
				"Personagem: Por favor, que eu receba algum sinal para encontrar a Erva, eu preciso encontrar minha filha, POR FAVOR!!!!\n");
		System.out.println(
				"COMPUTADOR: De repente ele ve uma luz forte vindo ao lado de uma árvore, se aproxima e percebe que o sinal que havia pedido foi atendido. Era o Negrinho do Pastoreiro mais uma vez, vindo o ajudar.\n");
		System.out.println(
				"Negrinho do Pastoreiro: Sou eu novamente, eu ouvi o seu pedido, estou aqui para te mostrar onde a Erva está localizada. Ande 30 metros para o leste e encontrará a guardiã da folha, Caá-Yari e peça para ela o poder místico da Erva.\n");
		System.out.println("COMPUTADOR: Você está seguindo para o leste da floresta...\n");
		System.out.println("Personagem: Olá, você é a Caá-Yari ?\n");
		System.out.println("Caá-Yari: Sim... quem é você ?\n");
		System.out.println(
				"Personagem: Meu nome é (personagem), me disseram que você poderia me ajudar a recuperar minha filha das mãos da cuca. Eu preciso do poder da Erva para conseguir derrota-la.\n");
		System.out.println(
				"Caá-Yari: Minha aparição acontece apenas para pessoas e motivos dignos, então se eu estou aqui falando com você, significa que está destinado a receber o poder da folha. Irei dá-lo a você... Mas lembre-se, "
						+ "use-o com sabedoria, esse poder é sagrado e sua história também. Por isso deve passar por um desafio para provar que é merecedor dessa divindade.\n");
		System.out.println("COMPUTADOR: PARA RECEBER O PODER RESOLVA O SEGUINTE DESAFIO: \n");

		alternativaservamate.add("1001(binario)");
		alternativaservamate.add("1000(binario)");
		alternativaservamate.add("1010(binario)");
		alternativaservamate.add("100(binario)");
		alternativaservamate.add("101(binario)"); // respostas correta

		do {
			Collections.shuffle(alternativaservamate);
			Collections.shuffle(alternativaservamate);
			Collections.shuffle(alternativaservamate);
			System.out.println("1° ETAPA DESAFIO: 101110100(binario) x 4E(hexa) = x(decimal)");
			System.out.println("2° ETAPA DESAFIO: x(decimal) / 132(octal) = y(binario) \n");
			System.out.println("A - " + alternativaservamate.get(0));
			System.out.println("B - " + alternativaservamate.get(1));
			System.out.println("C - " + alternativaservamate.get(2));
			System.out.println("D - " + alternativaservamate.get(3));
			System.out.println("E - " + alternativaservamate.get(4) + "\n");
			System.out.println("Qual é o valor de Y em binário ?");
			respostaervamate = entrada.next();

			switch (respostaervamate) {
			case "a":
			case "A":
				if (alternativaservamate.get(0).equals("101(binario)")) {
					System.out.println("Caá-Yari: Você se provou merecedor do poder da Erva-Mate. Parabéns!!!!\n");
					ervamate = true;
				} else {
					System.out.println("Caá-Yari: Eu sinto que você pode fazer melhor para merecer o poder, vamos lá!!!\n");
					jogotodo = false;
				}
				break;
			case "b":
			case "B":
				if (alternativaservamate.get(1).equals("101(binario)")) {
					System.out.println("Caá-Yari: Você se provou merecedor do poder da Erva-Mate. Parabéns!!!!\n");
					ervamate = true;
				} else {
					System.out.println("Caá-Yari: Eu sinto que você pode fazer melhor para merecer o poder, vamos lá!!!\n");
					jogotodo = false;
				}
				break;
			case "c":
			case "C":
				if (alternativaservamate.get(2).equals("101(binario)")) {
					System.out.println("Caá-Yari: Você se provou merecedor do poder da Erva-Mate. Parabéns!!!!\n");
					ervamate = true;
				} else {
					System.out.println("Caá-Yari: Eu sinto que você pode fazer melhor para merecer o poder, vamos lá!!!\n");
				}
				break;
			case "d":
			case "D":
				if (alternativaservamate.get(3).equals("101(binario)")) {
					System.out.println("Caá-Yari: Você se provou merecedor do poder da Erva-Mate. Parabéns!!!!\n");
					ervamate = true;
				} else {
					System.out.println("Caá-Yari: Eu sinto que você pode fazer melhor para merecer o poder, vamos lá!!!\n");
				}
				break;
			case "e":
			case "E":
				if (alternativaservamate.get(4).equals("101(binario)")) {
					System.out.println("Caá-Yari: Você se provou merecedor do poder da Erva-Mate. Parabéns!!!!\n");
					ervamate = true;
				} else {
					System.out.println("Caá-Yari: Eu sinto que você pode fazer melhor para merecer o poder, vamos lá!!!\n");
				}
				break;
			default:
				System.out.println("Computador: Opção invalida. Responda o desafio apenas com as opções indicadas.\n");
				ervamate = false;
			}
		} while (ervamate == false);

		System.out.println("COMPUTADOR: Agora que conseguiu obter a Erva-Mate, você recebeu um buff de 100% de vida e 50% de inteligência. Isso irá te ajudar no seu desafio final contra a cuca... Prepare-se!\n");
		System.out.println("COMPUTADOR: Agora, mais destemido do que nunca, você já sabe que o esconderijo da cuca está próximo.\n");
		System.out.println("Personagem: Eu sei que estou perto, cheguei até aqui e não vou desistir de jeito nenhum...\n");
		System.out.println("COMPUTADOR: Ao se aproximar do esconderijo seu corpo já começa a sentir calafrios, sente que o perigo está proximo.\n");
		System.out.println("SCRHHH!!!!!!!\n");
		System.out.println("COMPUTADOR: Na escuridão da floresta você avista uma criatura esquisita, parecendo um lacoste e fala:\n");
		System.out.println("Personagem: CUCA ? Eu sei que é você, pode sair da escuridão e devolva minha filha, eu não saio daqui sem ela!!!!\n");
		System.out.println("Cuca: HAHAHAHAHAHA!!!! Em poucos minutos os preparativos estarão prontos e o meu plano finalmente poderá acontecer!!! Sua filha é a peça chave para tudo isso dar certo, não existe mais volta!\n");
		System.out.println("Personagem: NADA DISSO! Eu não saio daqui sem ela, já sei como te derrotar e não vou desistir!\n");
		System.out.println("Cuca: Você acha mesmo que tem chances contra mim ? Eu tenho as trevas como minha aliada!\n");
		System.out.println("Personagem: Não me importo, os poderes divinos estão do meu!");
		System.out.println("COMPUTADOR: A batalha final com a cuca irá acontecer... PREPARE-SE!!!");
		System.out.println("COMPUTADOR: PARA DERROTAR A CUCA RESOLVA O SEGUINTE DESAFIO: \n");
		System.out.println("*---- LEMBRE-SE: VOCÊ ESTÁ COM O PODER DIVINO DA ERVA MATE, COM 100% A MAIS DE VIDA NÃO PODE SER DERROTADO. 50% A MAIS DE INTELIGÊNCIA VOCÊ TEM DIREITO A UMA DICA. \n");

		alternativascuca.add("1,35"); // resposta correta
		alternativascuca.add("2,00");
		alternativascuca.add("1,30");
		alternativascuca.add("1,40");
		alternativascuca.add("1,50");

		do {
			Collections.shuffle(alternativascuca);
			Collections.shuffle(alternativascuca);
			Collections.shuffle(alternativascuca);

			System.out.println("DICA 1: A raiz quadrada de 484 é igual a 22. ");
			System.out.println(
					"1° ETAPA DESAFIO: 10000000(binário) + resultado positivo da equação (2x²- 6x - 56 = 0) = x(decimal) \n");
			System.out.println("2° ETAPA DESAFIO: x / E9(hexadecimal) = y(decimal)");

			System.out.println("A - " + alternativascuca.get(0));
			System.out.println("B - " + alternativascuca.get(1));
			System.out.println("C - " + alternativascuca.get(2));
			System.out.println("D - " + alternativascuca.get(3));
			System.out.println("E - " + alternativascuca.get(4) + "\n");
			System.out.println("Qual o valor de Y em decimal ?");
			respostacuca = entrada.next();

			switch (respostacuca) {

			case "a":
			case "A":
				if (alternativascuca.get(0).equals("1,35")) {
					System.out.println("COMPUTADOR: Esse ataque foi certeiro, parabens!!! Você conseguiu derrota-lá. Pegue sua filha e và embora desse lugar!\n");
					cuca = true;
				} else {
					System.out.println("COMPUTADOR: Dessa vez você teve sorte!! O poder da Erva-mate fez você aguentar o tranco!! Preste atenção na dica e tente novamente. Você é capaz!!!\n");
				}
				break;
			case "b":
			case "B":
				if (alternativascuca.get(1).equals("1,35")) {
					System.out.println("COMPUTADOR: Esse ataque foi certeiro, parabens!!! Você conseguiu derrota-lá. Pegue sua filha e và embora desse lugar!\n");
					cuca = true;
				} else {
					System.out.println("COMPUTADOR: Dessa vez você teve sorte!! O poder da Erva-mate fez você aguentar o tranco!! Preste atenção na dica e tente novamente. Você é capaz!!!\n");
				}
				break;
			case "c":
			case "C":
				if (alternativascuca.get(2).equals("1,35")) {
					System.out.println("COMPUTADOR: Esse ataque foi certeiro, parabens!!! Você conseguiu derrota-lá. Pegue sua filha e và embora desse lugar!\n");
					cuca = true;
				} else {
					System.out.println("COMPUTADOR: Dessa vez você teve sorte!! O poder da Erva-mate fez você aguentar o tranco!! Preste atenção na dica e tente novamente. Você é capaz!!!\n");
				}
				break;
			case "d":
			case "D":
				if (alternativascuca.get(3).equals("1,35")) {
					System.out.println("COMPUTADOR: Esse ataque foi certeiro, parabens!!! Você conseguiu derrota-lá. Pegue sua filha e và embora desse lugar!\n");
					cuca = true;
				} else {
					System.out.println("COMPUTADOR: Dessa vez você teve sorte!! O poder da Erva-mate fez você aguentar o tranco!! Preste atenção na dica e tente novamente. Você é capaz!!!\n");
				}
				break;
			case "e":
			case "E":
				if (alternativascuca.get(4).equals("1,35")) {
					System.out.println("COMPUTADOR: Esse ataque foi certeiro, parabens!!! Você conseguiu derrota-lá. Pegue sua filha e và embora desse lugar!\n");
					cuca = true;
				} else {
					System.out.println("COMPUTADOR: Dessa vez você teve sorte!! O poder da Erva-mate fez você aguentar o tranco!! Preste atenção na dica e tente novamente. Você é capaz!!!\n");
				}
				break;
			default:
				System.out.println("Computador: Opção invalida. Responda o desafio apenas com as opções indicadas.\n");
				cuca = false;
			}
		} while (cuca == false);
		} while (jogotodo == false);
	}	
		
}
