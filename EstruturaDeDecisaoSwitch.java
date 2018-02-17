import java.util.Scanner;

public class EstruturaDeDecisaoSwitch{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		String imprimeLinha = "=============================================";

		System.out.println(imprimeLinha);

		System.out.print("Informe o dia (Numero): ");
		Integer diaDaSemana = scanner.nextInt();

		String nomeDoDiaDaSemana = "";

		switch(diaDaSemana){

			case 1 : nomeDoDiaDaSemana = "Domingo";
				break;
			case 2 : nomeDoDiaDaSemana = "Segunda-Feiera";
				break;
			case 3 : nomeDoDiaDaSemana = "Terça-Feira";
				break;
			case 4 : nomeDoDiaDaSemana = "Quarta-Feira";
				break;
			case 5 : nomeDoDiaDaSemana = "Quinta-Feira";
				break;
			case 6 : nomeDoDiaDaSemana = "Sexta-Feira";
				break;
			case 7 : nomeDoDiaDaSemana = "Sábado";
				break;
			default: nomeDoDiaDaSemana = "[Nao Encontrado!]";

		}

		System.out.println("O dia da semana é: " + nomeDoDiaDaSemana);

		System.out.println("Fim...");
		System.out.println(imprimeLinha);

		scanner.close();

	}
}