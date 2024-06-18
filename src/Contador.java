import java.util.Scanner;

import excecao.ParametrosInvalidosException;

public class Contador {
	public static void contador(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
		if (numeroUm > numeroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}

		for (int i = numeroUm; i <= numeroDois; i++) {
			System.out.println("Imprimindo número " + i);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Digite o primeiro número: ");
			int numeroUm = scanner.nextInt();
			System.out.print("Digite o segundo número: ");
			int numeroDois = scanner.nextInt();

			contador(numeroUm, numeroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
