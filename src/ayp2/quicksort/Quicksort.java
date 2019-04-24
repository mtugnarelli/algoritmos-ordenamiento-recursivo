package ayp2.quicksort;

public abstract class Quicksort {

	public void ordenar(int[] valores) {
		
		ordenarEntre(valores, 0, valores.length - 1);
	}

	protected abstract void ordenarEntre(int[] valores, int inicio, int fin);
	
	protected void intercambiar(int[] valores, int i, int j) {

		int valoresI = valores[i];
		valores[i] = valores[j];
		valores[j] = valoresI;
	}

}
