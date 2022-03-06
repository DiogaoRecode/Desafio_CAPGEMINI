package mediana;

//Biblioteca utilizada para a execu��o do programa
import java.util.*;

public class Mediana {
	
	
	/*Fun��o necess�ria para ordenar e classificar o tipo de agrupamento que iremos tratar entre
	entre par ou impar*/
	public static double ordenaEidentifica(int vetor[], int y)
    {
        //M�todo necess�rio para colocar o Array em ordem crescente
        Arrays.sort(vetor);
 
        // Identificando o Array entre par ou impar para o calculo da mediana
        //se for par
        if (y % 2 == 0) 
        	return (double)(vetor[(y - 1) / 2] + vetor[y / 2]) / 2;
        
        //se for impar
            return (double)vetor[y / 2];  
        
    }
 
	
    // Executando o programa
    public static void main(String args[])
    {
    	Scanner leia = new Scanner(System.in);
    	int numUsuario;
        int i= 0;
        
        System.out.println("Quantos elementos deseja inserir no seu vetor?");
        numUsuario = leia.nextInt();
        
        int []vetor = new int[numUsuario];
        
        while(i <= (numUsuario-1)) {
        	System.out.println("Digite o " + (i+1)+ "�  num�ro: ");
        	vetor[i] = leia.nextInt();
        	i++;
        }
        
        
        //Mostrando na tela o vetor criado pelo usu�rio
        System.out.print ("O vetor construido foi :(");
        for (int x=0; x<numUsuario;x++) {
       	 System.out.print(vetor[x]+" ");
        } 
        System.out.println (")");
        
        
        //Mostrando na tela o valor da mediana 
        int y = vetor.length;
        System.out.println("A Mediana desse vetor � = " + ordenaEidentifica(vetor, y));
        
        
        //Mostrando na tela o vetor ordenado de forma crescente
        System.out.print ("O vetor ordenado:(");
        for (int x=0; x<numUsuario;x++) {
       	 System.out.print(vetor[x]+" ");
        } 
        System.out.println (")");
       
       }
    
}
    
    
    



