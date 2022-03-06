package vetorPar;

//Biblioteca necessária para execução do programa
import java.util.*;

public class VetorPar {

	//Variveis usadas
	  public static void main(String [] args) {
		  Scanner leia = new Scanner(System.in);
	      int numUsuario;
	      int l= 0;
	      int aux=0;
	        
	      
	    //O momento que o usuário irá atribuir os elementos no vetor
	      System.out.println("Quantos elementos deseja inserir no seu vetor?");
	      numUsuario = leia.nextInt();
	        
	        int []vetor = new int[numUsuario];
	        
	        while(l <= (numUsuario-1)) {
	        	System.out.println("Digite o " + (l+1)+ "º o numéro: ");
	        	vetor[l] = leia.nextInt();
	        	l++;
	        }
	        
	        int n = vetor.length;
	        
	        
	      //Mostrando na tela o vetor criado pelo usuário
	        System.out.print ("O vetor construido foi :(");
	        for (int x=0; x<numUsuario;x++) {
	       	 System.out.print(vetor[x]+" ");
	        } 
	        System.out.println (")");
	        
	        
	       //Pedindo o número que será a diferença entre os vetores
	        System.out.println("Qual a diferença entre os números que deseja formar os pares com o vetor construido?");
	        int dif = leia.nextInt();
	        
	        
	        
	        //Comando para encontrar e mostrar o vetor da diferença
	        for (int i = 0; i < (n - 1); i++) {
		          for (int j = (i + 1); j < n; j++) {
		              if ((vetor[i] - vetor[j] == dif) ||(vetor[j] - vetor[i] == dif)) {
		                  System.out.println("vetor com a diferença de " + dif +
		                                     " é (" + vetor[i] + ", " + vetor[j] + ")");
		                  aux++;
		              }
		          }
		      }
	        
	        
	        //Condição par mostrar a mensagem para o usuário sobre a existência do par
	        if (aux==0) {
	        	 System.out.println("Não existe par com a diferença entre eles de: "+dif);
	        }
	        else if (aux==1){
	        	System.out.println ("Existe "+aux+" par com a diferença entre eles de: "+dif);
	        }
	        else {
	        	System.out.println ("Existem "+aux+" pares com a diferença entre eles de: "+dif);
	        }
	        
	  }
	}


