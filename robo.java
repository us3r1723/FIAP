package estudo_java;

import java.util.Scanner;

public class robo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int i = 0, var = 0, valor = 0, ener = 0, bateu = 0, venceu = 0;
		// var = direcao
		// var=1 direita
		// var=2 esquerda
		// var=3 baixo
		// var=4 cima
		// valor= valor a percorer

		System.out.println(
				"                                                                                                                        \n"
						+ "                                                                                                                        \n"
						+ "                                                                                                                        \n"
						+ "                          .                                                                  .                          \n"
						+ "                           :#::                                                          ::#:                           \n"
						+ "                             :###!:.                                                .:!###:                             \n"
						+ "                               :#####!:                                          :!#####:                               \n"
						+ "                             ##. .:######!.                                  .!######:. .!!                             \n"
						+ "                               ##############                              ##############                               \n"
						+ "                               ...##############                        ##############...                               \n"
						+ "                                !#################!.                .!#################!.                               \n"
						+ "                                 .!!################!.            .!################!!.                                 \n"
						+ "                                 !###!###############!. ::##:    .!###############!###!.                                \n"
						+ "                                   .!#################!..#####: .!#################!.                                   \n"
						+ "                                    .:#################!.######!!#################:.                                    \n"
						+ "                                      .:########################################:.                                      \n"
						+ "                                     .!##########################################!.                                     \n"
						+ "                                       .:!####################################!:.                                       \n"
						+ "                                         .:!##!##########################!##!:.                                         \n"
						+ "                                         ...:!!##########################!!:  .                                         \n"
						+ "                                           ..:.!!######################!!....                                           \n"
						+ "                                                .::!!:!##########!:!!::.                                                \n"
						+ "                                                     :############.                                                     \n"
						+ "                                                    :#############!:                                                    \n"
						+ "                                                   .!##############:                                                    \n"
						+ "                                                 :!##################:.                                                 \n"
						+ "                                                :!!!###!!###########!#.                                                 \n"
						+ "                                                 ..... :####!##!:.:::...                                                \n"
						+ "                                                       ..::!::::                                                        \n"
						+ "                                                        .   ..                                                          \n"
						+ "                                                                                                                        \n"
						+ "                               ####! :##  #.  ###!      :#!##: .##!!#.  !#### .##  #  ##.                               \n"
						+ "                                !#.   :#  #.  ##        !!     .#   #.  ## ##  :#  #  #.                                \n"
						+ "                                !#.  :#####. !###!      !#     :#!.#!.  #! ##  .#  #  #.                                \n"
						+ "                                !#:   :#  #.  ##        !#     .#  #!. .#! ##  .#  # ##.                                \n"
						+ "                                !#:   :#  #.  ####.     !####! .#   #:  ##.##   :#####.                                 \n"
						+ "                                ...  .......  ....       ....   ......  .....   ......                                  \n"
						+ "                                                                                                                                      \n"
						+ "");
		System.out.println("");
		System.out.println("membros:");
		System.out.println("");
		System.out.println("RM99831 - Arthur Badu Reis");
		System.out.println("RM98041 - Arthur Medeiros Isique de Souza");
		System.out.println("RM99472 - Kauã Granata Monteiro");
		System.out.println("RM99657 - Matheus Roberto Santos de Sousa");
		System.out.println("RM98845 - Rafael Jun Miura");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("o seu objetivo é ir do ponto de partida até linha de chegada em verde");
		System.out.println("o seu robô somente anda de 3 em 3 qudrados");
		System.out.println("o seu robô consome 6 J por instrução ");
		System.out.println("então tome coidado com o numero de instruções");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("digite a potência da bateria do robô em J");
		System.out.println("lembrando que se não for o suficiente ela vai acabar no meio do caminho");
		ener = entrada.nextInt();

		while (venceu != 1 && bateu != 1) {

			while (i >= 0 && i < 12 && bateu != 1) {
				var = 0;
				valor = 0;
				System.out.println("");
				System.out.println("1 segmento");
				System.out.println("");
				System.out.println("1-direita, 2-esquerda, 3-cima, 4-baixo");
				System.out.println("");
				var = entrada.nextInt();
				System.out.println("");
				System.out.println("quantidade obs: precisa ser múltiplo de 3");
				System.out.println("");
				valor = entrada.nextInt();

				if (valor % 3 == 0 && var < 5 && var > 0) {
					ener -= 6;
					if (var == 1) {
						i += valor;
					} else {
						if (var == 2) {
							i -= valor;
						}
					}
					if (var == 3 || var == 4 || i < 0 || i > 12 || ener < 0) {
						bateu++;
					}

				} else {
					System.out.println("valores inválidos");
				}

			}
			while (i >= 12 && i < 21 && bateu != 1) {
				var = 0;
				valor = 0;
				System.out.println("");
				System.out.println("2 segmento");
				System.out.println("");
				System.out.println("1-direita, 2-esquerda, 3-cima, 4-baixo");
				System.out.println("");
				var = entrada.nextInt();
				System.out.println("");
				System.out.println("quantidade obs: precisa ser múltiplo de 3");
				valor = entrada.nextInt();

				if (valor % 3 == 0 && var < 5 && var > 0) {
					ener -= 6;
					if (var == 4) {
						i += valor;
					} else {
						if (var == 3 || var == 2 && i == 12) {
							i -= valor;

						} else {
							if (var == 1 || var == 2 || i < 12 || i > 21 || ener < 0) {
								bateu++;

							}
						}
					}
				} else {
					System.out.println("valores inválidos");
				}

			}
			while (i >= 21 && i < 33 && bateu != 1) {
				var = 0;
				valor = 0;
				System.out.println("");
				System.out.println("3 segmento");
				System.out.println("");
				System.out.println("1-direita, 2-esquerda, 3-cima, 4-baixo");
				System.out.println("");
				var = entrada.nextInt();
				System.out.println("");
				System.out.println("quantidade obs: precisa ser múltiplo de 3");
				System.out.println("");
				valor = entrada.nextInt();

				if (valor % 3 == 0 && var < 5 && var > 0) {
					ener -= 6;
					if (var == 1) {
						i += valor;
					} else {
						if (var == 2 || var == 3 && i == 21) {
							i -= valor;
						} else {

							if (var == 3 || var == 4 || i < 21 || i > 33 || ener < 0) {
								bateu++;
							}
						}
					}
				} else {
					System.out.println("valores inválidos");
				}

			}
			while (i < 39 && i >= 33 && bateu != 1) {
				var = 0;
				valor = 0;
				System.out.println("");
				System.out.println("4 segmento");
				System.out.println("");
				System.out.println("1-direita, 2-esquerda, 3-cima, 4-baixo");
				System.out.println("");
				var = entrada.nextInt();
				System.out.println("");
				System.out.println("quantidade obs: precisa ser múltiplo de 3");
				System.out.println("");
				valor = entrada.nextInt();

				if (valor % 3 == 0 && var < 5 && var > 0) {
					ener -= 6;
					if (var == 3) {
						i += valor;
					} else {
						if (var == 4 || var == 2 && i == 33) {
							i -= valor;
						} else {

							if (var == 1 || var == 2 || i < 33 || i > 39 || ener < 0) {
								bateu++;
							}
						}
					}
				} else {
					System.out.println("valores inválidos");
				}

			}
			while (i >= 39 && bateu != 1 && i < 51) {
				var = 0;
				valor = 0;
				System.out.println("");
				System.out.println("5 segmento");
				System.out.println("");
				System.out.println("1-direita, 2-esquerda, 3-cima, 4-baixo");
				System.out.println("");
				var = entrada.nextInt();
				System.out.println("");
				System.out.println("quantidade obs: precisa ser múltiplo de 3");
				System.out.println("");
				valor = entrada.nextInt();

				if (valor % 3 == 0 && var < 5 && var > 0) {
					ener -= 6;
					if (var == 1) {
						i += valor;
					} else {
						if (var == 2 || var == 4 && i == 39) {
							i -= valor;
						} else {

							if (var == 3 || var == 4 || i < 39 || i > 51 || ener < 0) {
								bateu++;
							}
						}
					}

				} else {
					System.out.println("valores inválidos");
				}

			}
			while (i >= 51 && bateu != 1 && venceu != 1) {
				var = 0;
				valor = 0;
				System.out.println("");
				System.out.println("6 segmento");
				System.out.println("");
				System.out.println("1-direita, 2-esquerda, 3-cima, 4-baixo");
				System.out.println("");
				var = entrada.nextInt();
				System.out.println("");
				System.out.println("quantidade obs: precisa ser múltiplo de 3");
				System.out.println("");
				valor = entrada.nextInt();

				if (valor % 3 == 0 && var < 5 && var > 0) {
					ener -= 6;
					if (var == 4) {
						i += valor;
					} else {
						if (var == 3 || var == 2 && i == 51) {
							i -= valor;
						} else {

							if (var == 1 || var == 2 || i < 51 || ener < 0) {
								bateu++;
							}
						}

					}
				}
				if (i >= 60) {
					venceu++;

				} else {
					System.out.println("valores inválidos");
				}

			}

			if (venceu == 1) {
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println(
						"██████   █████  ██████   █████  ██████  ███████ ███    ██ ███████     ██    ██  ██████   ██████ ███████     ██    ██ ███████ ███    ██  ██████ ███████ ██    ██ \n"
								+ "██   ██ ██   ██ ██   ██ ██   ██ ██   ██ ██      ████   ██ ██          ██    ██ ██    ██ ██      ██          ██    ██ ██      ████   ██ ██      ██      ██    ██ \n"
								+ "██████  ███████ ██████  ███████ ██████  █████   ██ ██  ██ ███████     ██    ██ ██    ██ ██      █████       ██    ██ █████   ██ ██  ██ ██      █████   ██    ██ \n"
								+ "██      ██   ██ ██   ██ ██   ██ ██   ██ ██      ██  ██ ██      ██      ██  ██  ██    ██ ██      ██           ██  ██  ██      ██  ██ ██ ██      ██      ██    ██ \n"
								+ "██      ██   ██ ██   ██ ██   ██ ██████  ███████ ██   ████ ███████       ████    ██████   ██████ ███████       ████   ███████ ██   ████  ██████ ███████  ██████  \n"
								+ "                                                                                                                                                                \n"
								+ "                                                                                                                                                                ");
				System.out.println("");
				System.out.println("");
			}

			if (bateu != 0) {
				if (ener < 0) {
					System.out.println("");
					System.out.println("");
					System.out.println(
							"             _           _            _                         _                              \n"
									+ "     /\\     | |         | |          (_)                       | |                  _        _ \n"
									+ "    /  \\    | |__   __ _| |_ ___ _ __ _  __ _    __ _  ___ __ _| |__   ___  _   _  (_)______(_)\n"
									+ "   / /\\ \\   | '_ \\ / _` | __/ _ \\ '__| |/ _` |  / _` |/ __/ _` | '_ \\ / _ \\| | | |   |______|  \n"
									+ "  / ____ \\  | |_) | (_| | ||  __/ |  | | (_| | | (_| | (_| (_| | |_) | (_) | |_| |  _        _ \n"
									+ " /_/    \\_\\ |_.__/ \\__,_|\\__\\___|_|  |_|\\__,_|  \\__,_|\\___\\__,_|_.__/ \\___/ \\__,_| ( )      ( )\n"
									+ "                                                                                   |/       |/ \n"
									+ "                                                                                               ");
					System.out.println("");
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("");
					System.out.println(
							"               _        __     _ _                          _                     _           _                           \n"
									+ " _        _   (_)      / _|   | (_)                        | |                   | |         | |               _        _ \n"
									+ "(_)______(_)   _ _ __ | |_ ___| |_ _____ __ ___   ___ _ __ | |_ ___  __   _____  | |__   __ _| |_ ___ _   _   (_)______(_)\n"
									+ "  |______|    | | '_ \\|  _/ _ \\ | |_  / '_ ` _ \\ / _ \\ '_ \\| __/ _ \\ \\ \\ / / __| | '_ \\ / _` | __/ _ \\ | | |    |______|  \n"
									+ " _        _   | | | | | ||  __/ | |/ /| | | | | |  __/ | | | ||  __/  \\ V / (__  | |_) | (_| | ||  __/ |_| |   _        _ \n"
									+ "( )      ( )  |_|_| |_|_| \\___|_|_/___|_| |_| |_|\\___|_| |_|\\__\\___|   \\_/ \\___| |_.__/ \\__,_|\\__\\___|\\__,_|  ( )      ( )\n"
									+ "|/       |/                                                                                                   |/       |/ \n"
									+ "                                                                                                                          ");
					System.out.println("");
					System.out.println("");
				}
			}

		}

	}

}
