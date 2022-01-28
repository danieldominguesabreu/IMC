package imc;

public class Imc {

	double calcularImc(int pesoDoUsuario, double alturaDoUsuario) {

		double imc = pesoDoUsuario / (alturaDoUsuario * alturaDoUsuario);
		System.out.println("IMC = " + imc);
		return imc;
	}

	void classificarImc(double imc) {

		// determinar a classifica��o do imc
		if (imc < 18.5) {
			System.out.println("\nVoce est� abaixo do peso ideal!");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("\nVoce est� dentro do peso ideal!");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("\nVoce est� acima do peso ideal!");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("\nVoce esta com obesidade grau 1!");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("\nVoce est� com obesidade grau 2!");
		} else if (imc >= 40) {
			System.out.println("\nVoce est� com obesidade m�rbida grau 3!");
		}
	}

}
