package ayp2;

import org.junit.Test;

public abstract class PruebaDeOdenamiento {

	protected abstract void probar(int[] valores, int[] esperados);
	
	@Test
	public void arregloVacio() {
		
		probar(	new int[] {}, 
				new int[] {});
	}
	
	@Test
	public void arregloConUnUnicoElemento() {
		
		probar(	new int[] { 4 }, 
				new int[] { 4 } );
	}
	
	@Test
	public void arregloConDosElementosDesordenados() {
		
		probar(	new int[] { 9, 5 }, 
				new int[] { 5, 9});
	}
	
	@Test
	public void arregloConDosElementosOrdenados() {
		
		probar(	new int[] { 3, 10 }, 
				new int[] { 3, 10 });
	}
	
	@Test
	public void arregloConTresElementosDesordenados() {
		
		probar(	new int[] { 9, 1, 4 }, 
				new int[] { 1, 4, 9 });
	}
	
	@Test
	public void arregloConTrestElementosConOrdenInverso() {
		
		probar(	new int[] { 22, 13, 9 }, 
				new int[] { 9, 13, 22 });
	}
	
	@Test
	public void arregloConCuatroElementosDesordenados() {

		probar(	new int[] { 9, 1, 67, 23},
				new int[] { 1, 9, 23, 67});
	}
	
	@Test
	public void arregloConOchoElementosOrdenados() {
		
		probar( new int[] { 4, 5, 9, 13, 24, 45, 67, 68 },
				new int[] { 4, 5, 9, 13, 24, 45, 67, 68 });	
	}
	
	@Test
	public void arregloConDiezElementosDesordenados() {
		
		probar( new int[] { 98, 45, 1, 3, 5, 89, 32, 11, 34, 63 },
				new int[] { 1, 3, 5, 11, 32, 34, 45, 63, 89, 98 });
	}
	
	@Test
	public void arregloConDiezElementosCasiOrdenados() {
		
		probar( new int[] { 3, 5, 6, 89, 7, 8, 9, 12, 34, 78 },
				new int[] { 3, 5, 6, 7, 8, 9, 12, 34, 78, 89 });
	}
	
	@Test
	public void arregloConOnceElementosConOrdenInverso() {
		
		probar( new int[] { 89, 78, 65, 45, 32, 21, 20, 19, 18, 2, 1 },
				new int[] { 1, 2, 18, 19, 20, 21, 32, 45, 65, 78, 89 });
	}
	
	@Test
	public void arregloConDiezElementosDesordenadosConDosRepetidos() {
		
		probar( new int[] { 9, 8, 3, 1, 22, 2, 22, 5, 8, 13 } ,
				new int[] { 1, 2, 3, 5, 8, 8, 9, 13, 22, 22 });
	}
	
	@Test
	public void arregloConSieteElementosDesordenadosConDosRepetidosAlInicio() {
		
		probar( new int[] { 4, 4, 23, 1, 8, 56, 0 }, 
				new int[] { 0, 1, 4, 4, 8, 23, 56 });	
	}
	
	@Test
	public void arregloConOchoElementosCuyasMitadesEstanOrdenadas() {
		
		probar( new int[] { 1, 6, 18, 90, 3, 8, 12, 21 }, 
				new int[] { 1, 3, 6, 8, 12, 18, 21, 90 });
	}
	
	
	
	
	
	
	
	
	
	
	
}
