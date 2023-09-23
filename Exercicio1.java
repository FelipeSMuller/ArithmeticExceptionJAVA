package Exercicio2;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 * Escreva um programa que tenta dividir dois números e capture qualquer exceção
		 * de divisão por zero usando try-catch. No bloco finally, exiba uma mensagem de
		 * encerramento.
		 */

		int numero1 = 0, numero2 = 0, resultado = 0;

		do {

			try {

				numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número "));

				numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número "));

				resultado = numero1 / numero2;

				if (numero1 < 0 || numero2 < 0) {
					JOptionPane.showMessageDialog(null, "Erro , números negativos são inválidos!");
					break;
				}

			} catch (ArithmeticException | NumberFormatException e) {

				JOptionPane.showMessageDialog(null,
						"Erro! \nVocê pode ter efetuado uma operação incorreta ou preencheu o campo de maneira incorreta! \nCertifique-se de não efetuar uma divisão com zeros(0)");
				break;
			}

			finally {

				JOptionPane.showMessageDialog(null, " Resultado final = " + resultado + "\n Fim da execução");
			}

		} while (numero1 > 0 && numero2 > 0);

	}
}
