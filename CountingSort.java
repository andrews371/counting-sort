package couting_sort;

public class CountingSort {
	public static int[] countingSort(int[] array, int[] array_saida, int t, int k, int neg ) {
		int[] aux = new int[k];
		int i; 
		for (i = 0; i < k; i++) {
			aux[i] = 0;
		}
		for (i = 0; i <= t - 1; i++) {
			aux[array[i]] = aux[array[i]] + 1;
		}
		for (i = 1; i < k; i++){
			aux[i] = aux[i] + aux[i-1];
		}
		for (i = t -1; i >= 0; i--){
			array_saida[aux[array[i]]-1] = array[i];
			aux[array[i]] = aux[array[i]] - 1;
		}
		if (neg < 0) {
			neg = neg * (-1);
			for (i = 0; i <= t - 1; i++)
				array_saida[i] = array_saida[i] - neg;
		}
		return array_saida;
	}

}
