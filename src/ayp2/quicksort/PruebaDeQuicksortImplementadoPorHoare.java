package ayp2.quicksort;

import static org.junit.Assert.assertArrayEquals;

import ayp2.PruebaDeOdenamiento;
import ayp2.quicksort.Quicksort;
import ayp2.quicksort.QuicksortImplementadoPorHoare;


public class PruebaDeQuicksortImplementadoPorHoare extends PruebaDeOdenamiento {

	@Override
	protected void probar(int[] valores, int[] esperados) {
		
		Quicksort algoritmo = new QuicksortImplementadoPorHoare();
		
		algoritmo.ordenar(valores);
		
		assertArrayEquals(esperados, valores);
	}

	
}
