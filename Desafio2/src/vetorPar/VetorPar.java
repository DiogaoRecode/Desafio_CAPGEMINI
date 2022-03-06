package vetorPar;

//Biblioteca necess�ria para execu��o do programa
import java.util.*;

public class VetorPar {

	//Variveis usadas
	  public static void main(String [] args) {
		  Scanner leia = new Scanner(System.in);
	      int numUsuario;
	      int l= 0;
	      int aux=0;
	        
	      
	    //O momento que o usu�rio ir� atribuir os elementos no vetor
	      System.out.println("Quantos elementos deseja inserir no seu vetor?");
	      numUsuario = leia.nextInt();
	        
	        int []vetor = new int[numUsuario];
	        
	        while(l <= (numUsuario-1)) {
	        	System.out.println("Digite o " + (l+1)+ "� o num�ro: ");
	        	vetor[l] = leia.nextInt();
	        	l++;
	        }
	        
	        int n = vetor.length;
	        
	        
	      //Mostrando na tela o vetor criado pelo usu�rio
	        System.out.print ("O vetor construido foi :(");
	        for (int x=0; x<numUsuario;x++) {
	       	 System.out.print(vetor[x]+" ");
	        } 
	        System.out.println (")");
	        
	        
	       //Pedindo o n�mero que ser� a diferen�a entre os vetores
	        System.out.println("Qual a diferen�a entre os n�meros que deseja formar os pares com o vetor construido?");
	        int dif = leia.nextInt();
	        
	        
	        
	        //Comando para encontrar e mostrar o vetor da diferen�a
	        for (int i = 0; i < (n - 1); i++) {
		          for (int j = (i + 1); j < n; j++) {
		              if ((vetor[i] - vetor[j] == dif) ||(vetor[j] - vetor[i] == dif)) {
		                  System.out.println("vetor com a diferen�a de " + dif +
		                                     " � (" + vetor[i] + ", " + vetor[j] + ")");
		                  aux++;
		              }
		          }
		      }
	        
	        
	        //Condi��o par mostrar a mensagem para o usu�rio sobre a exist�ncia do par
	        if (aux==0) {
	        	 System.out.println("N�o existe par com a diferen�a entre eles de: "+dif);
	        }
	        else if (aux==1){
	        	System.out.println ("Existe "+aux+" par com a diferen�a entre eles de: "+dif);
	        }
	        else {
	        	System.out.println ("Existem "+aux+" pares com a diferen�a entre eles de: "+dif);
	        }
	        
	  }
	}


