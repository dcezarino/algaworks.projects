import java.util.Scanner;

public class CalcularVelocidadeMedia{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("=== CALCULO DA VELOCIDADE MEDIA ==========");

		System.out.print("Informe a distancia percorrida (em quilometros): ");
		Double distanciaPercorrida  = scanner.nextDouble();

		System.out.print("Informe o tempo gasto (em horas): ");
		Double tempoGasto = scanner.nextDouble();

		Double velocidadeMedia = distanciaPercorrida / tempoGasto;

		System.out.println("A velocidade media e de: " + velocidadeMedia + " Km/h");

		scanner.close();

	}

}