package imc;

import java.util.Scanner;

public class Resultado {

	void executar() {

		// Declara��o das variaveis
		int pesoDoUsuario;
		double alturaDoUsuario, valorImc;
		String nomeDoUsuario;
		Imc imc = new Imc();

		// ler os dados do usu�rio
		Scanner leitor = new Scanner(System.in);

		System.out.print("Qual seu nome?");
		nomeDoUsuario = leitor.nextLine();

		System.out.print("\n" + nomeDoUsuario + ", digite seu peso: ");
		pesoDoUsuario = leitor.nextInt();

		System.out.print("\n" + nomeDoUsuario + ", digite sua altura: ");
		alturaDoUsuario = leitor.nextDouble();

		leitor.close();

		valorImc = imc.calcularImc(pesoDoUsuario, alturaDoUsuario);

		System.out.println("\n" + nomeDoUsuario + ", seu  valor do IMC � " + valorImc + ".");

		imc.classificarImc(valorImc);
	}

}
