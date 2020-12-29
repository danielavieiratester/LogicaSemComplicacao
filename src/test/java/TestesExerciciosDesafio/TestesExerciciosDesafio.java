package TestesExerciciosDesafio;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import exerciciosDesafio.ExerciciosDesafio;


public class TestesExerciciosDesafio {
	@Test
	public void testeCalculaAreaTriangulo() {
		ExerciciosDesafio atriangulo = new ExerciciosDesafio();
		int areatriangulo = atriangulo.calculaAreaTriangulo(10,20);
		assertEquals(100, areatriangulo);
	}

	@Test
	public void testeRetornaMaior() {
		ExerciciosDesafio maiorNum = new ExerciciosDesafio();
		int maiorNumero = maiorNum.retornaMaior(10,30,20);
		assertEquals(30, maiorNumero);
	}
	
	@Test
	public void testeRetornaSomaPositivos(){
		ExerciciosDesafio totalSoma = new ExerciciosDesafio();
		int somaPositivos = totalSoma.retornaSomaPositivos();
		assertEquals(2550, somaPositivos);		
	}
}


