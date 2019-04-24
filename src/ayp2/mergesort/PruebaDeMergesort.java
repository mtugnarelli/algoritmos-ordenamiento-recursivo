package ayp2.mergesort;

import static org.junit.Assert.assertArrayEquals;

import ayp2.PruebaDeOdenamiento;

import ayp2.mergesort.Mergesort;

public class PruebaDeMergesort extends PruebaDeOdenamiento {

	@Override
	protected void probar(int[] valores, int[] esperados) {
		
		Mergesort algoritmo = new Mergesort();
		
		int[] valoresOrdenados = algoritmo.ordenar(valores);
		
		assertArrayEquals(esperados, valoresOrdenados);
	}
}
