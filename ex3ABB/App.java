package ex3ABB;

import java.util.Scanner;

public class App {

	public static int votamSim = 0;
	public static int votamNao = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira a opção desejada");
		System.out.println("1 - Votar");
		System.out.println("2 - Resultados");
		System.out.println("3 - Sair");

		int opcao;
		opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			votar("Marcos", "15925928290");
			break;
		case 2:
			resultados();
			break;
		case 3:
			sair();
			break;
		}
		scan.close();
	}

	public static void votar(String nome, String cpf) {
		Scanner scan = new Scanner(System.in);

		System.out.println("1 - SIM");
		System.out.println("2 - NÃO");
		System.out.println("3 - CANCELAR");

		int op;
		op = scan.nextInt();

		switch (op) {
		case 1:
			votamSim++;
			resultados();
			break;
		case 2:
			votamNao++;
			resultados();
			break;
		case 3:
			break;
		}
		scan.close();
	}

	public static void resultados() {
		System.out.println("Quantidade de pessoas que votaram SIM " + votamSim);
		System.out.println("Quantidade de pessoas que votaram NÃO " + votamNao);
	}

	public static void sair() {
		System.exit(0);
	}

}
