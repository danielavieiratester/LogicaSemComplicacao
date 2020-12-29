package exerciciosDesafio;

//Desafio - Dica - Criar uma classe para os métodos.
public class ExerciciosDesafio{

//Desafio - Exercício 01 - Calcular área de um triângulo
	public int calculaAreaTriangulo(int base, int altura) {
		int areat;
		areat = (base*altura)/2;
		return areat;
	}
	
//Desafio - Exercício 02 - Retornar o maior de 3 valores inteiros
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
	
//Desafio - Exercício 03 - Retornar a soma dos números inteiros positivos do intervalo de um a cem.
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