import java.util.Scanner;

public class EstuturaDeDecisaoIf{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		String imprimeLinha = ("===============================");

		System.out.println(imprimeLinha);

		// Atencao, pois quando eu informo o nome do produto
		// a minha variavel seguinte deve seguir o padrao da mensagem
		System.out.print("Informe o preço do produto R$: ");
		Double precoDoProduto = scanner.nextDouble();

		Boolean precoProdutoMaiorOuIgualACem = precoDoProduto >= 100;

		Double percentualDesconto = 0.0;

		if (precoProdutoMaiorOuIgualACem){
			percentualDesconto = 5.0;
		}else{
			System.out.println("Desconto nao aplicado!");
		}

		// Regra de Tres: Calcula o desconto (precoDoProduto * percentualDesconto) / 100;
		Double desconto = (precoDoProduto * percentualDesconto) / 100;
		Double precoComDesconto = precoDoProduto - desconto;

		System.out.println("O valor total do produto é R$: " + precoComDesconto);

		System.out.println("Fim...");
		System.out.println(imprimeLinha);

		scanner.close();

	}

}