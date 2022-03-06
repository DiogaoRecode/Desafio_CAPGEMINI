package encriptado;

import java.util.Scanner;

public class Encriptado {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite uma frase qualquer:");
        String frase = leia.nextLine();
        
        //Comando que ira retirar os espa�os da frase
        System.out.println("\nprocessando......retirando os espa�os das frase......");
        frase = frase.replaceAll(" ","");
        System.out.println(frase);
        
        //Variaveis necess�rias para seguir as regras iniciais estabelicidas pelo grid
        int compFrase = frase.length();
        int Tcoluna = (int)Math.ceil(Math.sqrt(compFrase));
        int Tlinha = (int)Math.floor(Math.sqrt(compFrase));
        
        //Condi��o que efetua a troca de coluna no grif
        while(Tlinha<Tcoluna){
        	Tcoluna=Tcoluna-1;
            if(compFrase>(Tlinha*Tcoluna)){
            	Tcoluna=Tcoluna+1;
               break;
            }
        } 
        
        
      //Condi��o que efetua a troca de linha no grid
        while((Tlinha<Tcoluna && compFrase>(Tlinha*Tcoluna))){
            Tlinha=Tlinha+1;
        }
        
        
        //Constru��o do novo grid(nova frase)
        
        System.out.print("\nObedecedo a regra do grid, a nova frase ser�......\n");
        for(int i =0;i<Tcoluna;i++){
            
            int linha = 0;
            while(linha<=Tlinha-1){
                if(compFrase>(i+Tcoluna*linha))
                {
                    System.out.print(frase.charAt(i+Tcoluna*linha)); 
                    linha=linha+1;
                }     else{
                   break;
                }        
             
            }
            System.out.print(" ");
        }
    }
}
