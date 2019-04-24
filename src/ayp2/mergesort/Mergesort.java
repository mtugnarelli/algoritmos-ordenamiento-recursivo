package ayp2.mergesort;

public class Mergesort {

	public int[] ordenar(int[] valores) {

		int[] mezcla;
		int largo = valores.length;
		
		if (largo <= 1) {
			
			mezcla = valores;
			
		} else {
			
			int[] primerMitad = new int[largo / 2];
			for (int i = 0; i < primerMitad.length; i++) {
				primerMitad[i] = valores[i];
			}

			int[] segundaMitad = new int[largo - (largo / 2)];
			for (int i = 0; i < segundaMitad.length; i++) {
				segundaMitad[i] = valores[i + largo / 2];
			}
			
			mezcla = mezclar(ordenar(primerMitad), ordenar(segundaMitad));
		}
		
		return mezcla;
	}

	private int[] mezclar(int[] primerMitad, int[] segundaMitad) {
		
		int[] mezcla = new int[primerMitad.length + segundaMitad.length];

		int iPrimerMitad = 0;
		int iSegundaMitad = 0;
		
		for (int i = 0; i < mezcla.length; i++) {
			
			if (iPrimerMitad >= primerMitad.length) {
				mezcla[i] = segundaMitad[iSegundaMitad];
				iSegundaMitad++;

			} else if (iSegundaMitad >= segundaMitad.length) {
				mezcla[i] = primerMitad[iPrimerMitad];
				iPrimerMitad++;
				
			} else if (primerMitad[iPrimerMitad] < segundaMitad[iSegundaMitad]) {
				mezcla[i] = primerMitad[iPrimerMitad];
				iPrimerMitad++;
				
			} else {
				mezcla[i] = segundaMitad[iSegundaMitad];
				iSegundaMitad++;
			}
		}
		
		return mezcla;
	}

}














