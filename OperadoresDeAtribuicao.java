public class OperadoresDeAtribuicao{

	public static void main(String[] args){

		String imprimeLinha = "===================================";

		System.out.println(imprimeLinha);

		Integer umNumero = 5;

		umNumero += 2;
		System.out.println("Resultado da adicao de 5 com 2: " + umNumero);

		umNumero = 5; // Volta o valor para 5
		umNumero -= 2;
		System.out.println("Resultado da subtracao de 5 pelo 2: " + umNumero);

		umNumero = 5; // Volta o valor para 5
		umNumero *= 2;
		System.out.println("Resultado da multiplicacao de 5 pelo 2: " + umNumero);

		umNumero = 5; // Aqui deveria ser atribuido um valor do tipo Double, mas a variavel e do tipo Integer
		umNumero /= 2;
		System.out.println("Resultado da divisao de 5 pelo 2: " + umNumero);

		umNumero = 5; // Volta o valor para 5
		umNumero %= 2;
		System.out.println("Resultado do resto da divisao de 5 pelo 2: " + umNumero);


		System.out.println("Fim...");
		System.out.println(imprimeLinha);



	}




}