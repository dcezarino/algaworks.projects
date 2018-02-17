public class OperadoresRelacionais{

	public static void main(String[] args){

		String imprimeLinha = "===================================";

		Integer primeiraVariavel = 1;
		Integer segundaVariavel =  1;

		System.out.println("O valor da primeira variavel é " + primeiraVariavel + " e o da segunda é " + segundaVariavel);

		Boolean primeiraVariavelEMaiorQueASegunda = primeiraVariavel > segundaVariavel;
		System.out.println("Primeira variavel e maior que a segunda? " + primeiraVariavelEMaiorQueASegunda);

		Boolean primeiraVariavelEMenorQueASegunda = primeiraVariavel < segundaVariavel;
		System.out.println("Segunda variavel e menor que a segunda? " + primeiraVariavelEMenorQueASegunda);

		Boolean primeiraVariavelEMaiorIgualASegunda = primeiraVariavel >= segundaVariavel;
		System.out.println("Primeira variavel e maior e igual a segunda? " + primeiraVariavelEMaiorIgualASegunda);

		Boolean primeiraVariavelEMenorIgualASegunda = primeiraVariavel <= segundaVariavel;
		System.out.println("Primeira variavel e menor e igual a segunda? " + primeiraVariavelEMenorIgualASegunda);

		Boolean primeiraVariavelEIgualASegunda = primeiraVariavel.equals(segundaVariavel);
		System.out.println("Primeira variavel e igual a segunda? " + primeiraVariavelEIgualASegunda);

		// ! e o operador logico de negacao e
		// veremos ele mais para frente
		Boolean primeiraVariavelEDiferenteDaSegunda = !primeiraVariavel.equals(segundaVariavel);
		System.out.println("Primeira variavel e diferente da segunda? " + primeiraVariavelEDiferenteDaSegunda);

		System.out.println("Fim...");
		System.out.println(imprimeLinha);


	}



}