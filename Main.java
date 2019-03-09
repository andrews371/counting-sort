import java.util.Scanner;

public class Main {
	
	/* funcao para imprimir array de tamanho n */
	public static void printArray(int array[])
	{  
		int n = array.length;  
		for (int i=0; i<n; ++i)  
	    	System.out.print(array[i] + " ");  
		System.out.println();  
	}  
	
	public static void main(String[] args) {
		int tam, k, menor, neg = 0;
		k = 0;
		menor = 0;
		CountingSort cs = new CountingSort();
   	 
    	Scanner entrada = new Scanner(System.in);
    	 
    	System.out.print("Informe o tamanho do array: ");
    	tam = entrada.nextInt();
    	 
    	int[] array = new int[tam];
    	int[] array_saida = new int[tam];
    	 
    	for (int i = 0; i < tam; i++) {
        	System.out.print("Digite um elemento " + (i+1) + ": ");
        	array[i] = entrada.nextInt();
        	if ( k < array[i] )
        		k = array[i];
        	if ( array[i] < menor )
        		menor = array[i];
        	
    	}
    	

    	System.out.println();
    	System.out.println("array inicial");  
    	printArray(array);  
    	
    	if (menor < 0) {
    	    neg = menor;
    		menor = menor * (-1);
    		for (int j = 0; j < tam; j++)
    			array[j] = array[j] + menor;
    	}
    	
    	k = k + menor + 2;
 
    	cs.countingSort(array, array_saida, tam, k, neg);
   
    	System.out.println("\narray ordenado");  
    	printArray(array_saida);  
    	System.out.println();
	} 

}

