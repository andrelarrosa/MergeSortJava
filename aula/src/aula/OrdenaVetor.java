package aula;

public class OrdenaVetor {

	
	public static int[] sort(int n, int[] elementos){
		if(n < 0 || n > 65530) throw new IndexOutOfBoundsException("Tamanho inválido para um vetor");
		if(elementos.length != n) throw new IndexOutOfBoundsException("Número de elementos divergente do informado");
		mergeSort(elementos, 0, n - 1); 
		return elementos;
	}
	
	
	 public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
 
  private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        
        for (int i = 0; i < n2; i++) {
            rightArr[i] = arr[mid + i + 1];
        }
        
        int i = 0;
        int j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
