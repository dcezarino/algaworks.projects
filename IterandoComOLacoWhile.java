import java.util.Random;
import java.util.Scanner;

public class IterandoComOLacoWhile{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		String imprimeLinha = "=======================================";
		System.out.println(imprimeLinha);

		// Aleatorios de 0 ate 9
		Integer numeroAleatorio = random.nextInt(10);
		Boolean tantarNovamente = true;

		System.out.println("Aperte CTRL + C, a qualquer momento, para parar.");

		// Enquanto tentarNovamente igual a true, itera novamente
		while(tantarNovamente){

			System.out.print("Tente adivinhar o numero: ");
			Integer numero = scanner.nextInt();

			// Enquanto diferente, tenta novamente
			tantarNovamente = !numeroAleatorio.equals(numero);

			if(tantarNovamente){

				System.out.println("Errado");

			}

		}

		System.out.println("Parabens! Voce adivinhou. Era o numero " + numeroAleatorio + " mesmo.");
		System.out.println("Fim...");
		System.out.println(imprimeLinha);




	}


}