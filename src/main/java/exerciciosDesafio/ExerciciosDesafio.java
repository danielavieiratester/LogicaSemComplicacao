package exerciciosDesafio;

//Desafio - Dica - Criar uma classe para os m�todos.
public class ExerciciosDesafio{

//Desafio - Exerc�cio 01 - Calcular �rea de um tri�ngulo
	public int calculaAreaTriangulo(int base, int altura) {
		int areat;
		areat = (base*altura)/2;
		return areat;
	}
	
//Desafio - Exerc�cio 02 - Retornar o maior de 3 valores inteiros
	public int retornaMaior(int a, int b, int c) {
		int maior;
		
		if (a > b && a > c) {
			maior = a;
		}else{
			if (b > a && b > c){
				maior = b;
			}else
				maior = c;
			}
		return maior;
	}
	
//Desafio - Exerc�cio 03 - Retornar a soma dos n�meros inteiros positivos do intervalo de um a cem.
	public int retornaSomaPositivos() {
		int somaPositivos = 0;
	
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				somaPositivos = somaPositivos + i;
			}
		}
		return somaPositivos;
	}



}