package estudo_java;

import java.util.Scanner;

public class GS {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);



		int j = 0;
		int j2 = 0;
		int ctl = 0;
		double soma0 = 0.0;
		double soma1 = 0.0;
		double soma2 = 0.0;
		double fatMax = 0.0;
		double fatMin = 0.0;
		System.out.print("Digite o número de famílias: ");
		int quantF = entrada.nextInt();
		String[] nomesFamilias = new String[quantF]; // Vetor para armazenar os nomes das famílias
		double[][] vetorFamilias = new double[quantF][3]; // Vetor de vetores para armazenar os valores de cada
																// família

		while (ctl < quantF) {
			System.out.print("Digite o nome da família " + (ctl + 1) + ": ");
			String nomeFamilia = entrada.next();
			nomesFamilias[ctl] = nomeFamilia; // Armazena o nome da família

			j = 0;
			//  0 Investimento mensal recebido em reais.
			//  1 Faturamento Mensal das vendas dos alimentos cultivados.
			//  2 Lucro sobre as vendas mensais dos alimentos (Faturamento –
			// Investimento recebido)

			System.out.println("Digite o Investimento mensal recebido em reais  para a família " + nomeFamilia + ": ");
			double valor = entrada.nextInt();
			vetorFamilias[ctl][0] = valor; // Armazena o valor no vetor da família atual

			System.out.println("Digite o Faturamento Mensal das vendas dos alimentos cultivados para a família "
					+ nomeFamilia + ": ");
			vetorFamilias[ctl][1] = entrada.nextInt();

			vetorFamilias[ctl][2] = vetorFamilias[ctl][1] - vetorFamilias[ctl][0];
			// 			  aqui >< muda sobre qual valor da faamilia esta lidando
			//		 aqui >< muda com qual familia esta lidando
			ctl++;
		}

		// ctl = qual familia vc esta modificando

		System.out.println("Valores das famílias:");

		ctl = 0;
		while (ctl < quantF) {
			System.out.println("Família " + nomesFamilias[ctl] + ": ");
			System.out.println("");
			System.out.print("Investimento mensal recebido em reais: ");
			System.out.println(vetorFamilias[ctl][0]);
			System.out.println("");
			System.out.print("Faturamento Mensal das vendas dos alimentos cultivados: ");
			System.out.println(vetorFamilias[ctl][1]);
			System.out.println("");
			System.out.print("Lucro sobre as vendas mensais dos alimentos: ");
			System.out.println(vetorFamilias[ctl][2]);
			System.out.println("");
			soma0 += (vetorFamilias[ctl][0]); //soma custo
			soma1 += (vetorFamilias[ctl][1]); //soma receita 
			soma2 += (vetorFamilias[ctl][2]); //soma lucro 
		
			System.out.println("");
			
			System.out.println("");
			System.out.println("");
			ctl++;
		}
		System.out.print("A soma dos investimento de todas as famílias : ");
		System.out.println(soma0);
		ctl = 0;
		while (ctl < quantF) {
			if (fatMax < vetorFamilias[ctl][1]) {
				fatMax = vetorFamilias[ctl][1];
				j2 = ctl;
			}
			if (fatMin == 0) {
				fatMin = vetorFamilias[ctl][1];
			} else {
				if (fatMin > vetorFamilias[ctl][1]) {
					fatMin = vetorFamilias[ctl][1];
					j = ctl;

				}

			}

			ctl++;
		}
		
		System.out.print("Família com maior faturamento mensal : ");
		System.out.println(nomesFamilias[j2]);
		System.out.print("O valor :");
		System.out.println(vetorFamilias[j2][1]);
		System.out.println("");
		System.out.print("Família com menor faturamento mensal : ");
		System.out.println(nomesFamilias[j]);
		System.out.print("O valor :");
		System.out.println(vetorFamilias[j][1]);
		System.out.println("");
		System.out.println("");
		System.out.print("lucro medio de todas as familias: ");
		System.out.println( soma2 / soma0*100 +"%" );

	}

}

// string
//    f1   f2  
// 2 == quntF

//int
//	1		4
//	2		5
//	3		6
//
//
