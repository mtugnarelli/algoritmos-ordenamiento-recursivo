package ayp2.quicksort;

/**
 * Implementación de Quicksort dada por Brian Kernighan y Dennis Ritchie (K&R)
 * 
 */
public class QuicksortImplementadoPorKAndR extends Quicksort {

	protected void ordenarEntre(int[] valores, int inicio, int fin) {

		if (inicio < fin) {
			
			int ultimoIntercalado = inicio;
			
			for (int i = inicio + 1; i <= fin; i++) {
				
				if (valores[i] < valores[inicio]) {
					ultimoIntercalado++;
					intercambiar(valores, i, ultimoIntercalado);
				}
			}
			intercambiar(valores, inicio, ultimoIntercalado);
			
			ordenarEntre(valores, inicio, ultimoIntercalado - 1);
			ordenarEntre(valores, ultimoIntercalado + 1, fin);
		}
	}

}
