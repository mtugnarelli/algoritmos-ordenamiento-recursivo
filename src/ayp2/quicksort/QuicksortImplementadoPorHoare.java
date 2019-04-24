package ayp2.quicksort;

/**
 * Implementación de Quicksort de C.A.R. Hoare
 *
 * https://es.wikipedia.org/wiki/Quicksort
 */
public class QuicksortImplementadoPorHoare extends Quicksort {

	protected void ordenarEntre(int[] valores, int inicio, int fin) {

		if (inicio < fin) {

			int pivote = valores[(inicio + fin) / 2];
			int i = inicio;
			int j = fin;
			
			do {
				while (valores[i] < pivote) {
					i++;
				}
				while (valores[j] > pivote) {
					j--;
				}
				
				if (i <= j) {
					intercambiar(valores, i, j);
					i++;
					j--;
				}
			} while (i <= j);
			
			ordenarEntre(valores, inicio, j);
			ordenarEntre(valores, i, fin);
		}
	}

}
