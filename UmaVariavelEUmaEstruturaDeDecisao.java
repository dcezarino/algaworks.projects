import java.util.Scanner;

public class UmaVariavelEUmaEstruturaDeDecisao{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor do produto: ");
		Double precoProduto = scanner.nextDouble();

		Boolean precoProdutoMaiorOuIgualACem = precoProduto >= 100;

		Double percentualDesconto = 0.0;

		if (precoProdutoMaiorOuIgualACem){ // Estrutura de decisao if
			percentualDesconto = 5.0; // Variavel alterada
		}

		System.out.println("Aplique desconto de: " + percentualDesconto + "%.");

		scanner.close();

	}

}