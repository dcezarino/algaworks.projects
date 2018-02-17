public class IterandoComOLacoFor{

	public static void main(String[] args){

		String imprimeLinha = "============================================";
		System.out.println(imprimeLinha);

		Double[] carrinhoDeCompras = new Double[] {57.0, 175.0, 25.0, 10.0};

		Double valorTotalDoCarrinho = 0.0;

		for (int i = 0; i < carrinhoDeCompras.length; i++){
			valorTotalDoCarrinho += carrinhoDeCompras[i];
			System.out.println(">>>> Iteracao " + i);
			System.out.println(">>> Valor do produto corrente R$ " + carrinhoDeCompras[i] + ".");
			System.out.println(">> O total parcial e de R$ " + valorTotalDoCarrinho + ".");

		}

		System.out.println("O valor total é: " + valorTotalDoCarrinho);

		System.out.println("Fim!");
		System.out.println(imprimeLinha);

	}

}