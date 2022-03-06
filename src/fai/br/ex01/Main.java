package fai.br.ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
		realizar();

	}

	private void realizar() {
		int i = 0;
		Scanner leitura = new Scanner(System.in);

		int[] valor = new int[4];

		while (i < 4) {
			System.out.print("Digite o Valor " + (i + 1) + ": ");
			valor[i] = leitura.nextInt();
			i = i + 1;
		}
		calculo(valor);
	}

	private void calculo(int valor[]) {

		int menorValor = valor[0];
		int maiorValor = valor[0];

		for (int i = 0; i < valor.length; i++) {
			if (menorValor > valor[i]) {
				menorValor = valor[i];
			}
		}

		for (int i = 0; i < valor.length; i++) {
			if (maiorValor < valor[i]) {
				maiorValor = valor[i];
			}
		}

		System.out.println("O menor valor é: " + menorValor);
		System.out.println("O maior valor é: " + maiorValor);

		if (maiorValor > 50) {
			System.out.println("Valor muito alto");
		} else {
			System.out.println("Valor Normal");
		}
	}
}
