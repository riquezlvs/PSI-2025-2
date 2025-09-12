import java.util.*;

public class ExemploVetor {

    public static void main(String[] args) {
        int[] numeros = criaVetor(7);
        System.out.println("*** VETOR ORIGINAL ***");
        imprimirVetor(numeros);
        int qtd = modificaVetor(numeros);
        System.out.println("*** VETOR MODIFICADO ***");
        imprimirVetor(numeros);
        System.out.printf("Quantidade de modificações: %d\n", qtd);
    }

    public static int modificaVetor(int[] vetor){
        int qtde = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] >= 10 && vetor[i] <= 20){
                vetor[i] = 0;
                qtde++;
            }
        }
        return qtde;
    }

    public static int[] criaVetor(int n){
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[n];
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Valor %d: ", i+1);
            vetor[i] = entrada.nextInt();
        }
        entrada.close();
        return vetor;
    }

    public static void imprimirVetor(int[] vetor){
        for(int i =0; i < vetor.length; i++){
            System.out.printf("%2d", vetor[i]);
        }
    }
}