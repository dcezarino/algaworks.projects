public class OperadoresLogicos{

	public static void main(String[] args){

		String imprimeLinha = "=========================================";

		System.out.println(imprimeLinha);

		Boolean usuarioVip = true;
		Boolean aCompraUltrapassou100Reais = true;
		Boolean menorDeIdade = true;
		Boolean temProdutoAlcoolicoNoCarrinho = true;

		System.out.println("Usuario e VIP? " + usuarioVip);
		System.out.println("A compra e maior que R$100? " + aCompraUltrapassou100Reais);
		System.out.println("E menor de idade? " + menorDeIdade);
		System.out.println("Tem produto alcoolico no carrinho? " + temProdutoAlcoolicoNoCarrinho);

		System.out.println(imprimeLinha);

		Boolean aplicarDesconto = usuarioVip && aCompraUltrapassou100Reais;
		System.out.println("O desconto deve ser aplicado? "
			+ "(usuarioVip && aCompraUltrapassou100Reais): "
			+ aplicarDesconto);

		aplicarDesconto = usuarioVip || aCompraUltrapassou100Reais;
		System.out.println("O desconto deve ser aplicado? "
			+ "(usuarioVip || aCompraUltrapassou100Reais): "
			+ aplicarDesconto);

		// Leia assim: " se nao for menor de idade ou se
		// nao tiver produto alcoolico".
		Boolean permiteConcluirCompra = !menorDeIdade || !temProdutoAlcoolicoNoCarrinho;
		System.out.println("Pode concluir compra? "
			+ "(!menordeIdade || !temProdutoAlcoolicoNoCarrinho): "
			+ permiteConcluirCompra);


		System.out.println("Fim...");
		System.out.println(imprimeLinha);


    }




}