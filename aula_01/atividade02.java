import java.util.Scanner;

public class atividade02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdDias;

        do{
            System.out.print("Digite a quantidade de dias que deseja analisar: ");
            qtdDias = scanner.nextInt();
                if(qtdDias < 0){
                    System.out.println("Digite um valor valido.");
                }
        }while(qtdDias < 0);
        
        double totalVendas = 0;
        double maiorVenda = 0;
        int diaMaiorVenda = 0;

        for(int i = 1; i <= qtdDias; i++){
            double valorVenda;
            do{
                System.out.printf("Digite o valor de venda do dia (%d): ",i);
                valorVenda = scanner.nextDouble();
                if(valorVenda < 0){
                    System.out.println("Digite um valor valido.");
                }
            }while(valorVenda <0);

            totalVendas += valorVenda;
            
            if(valorVenda > maiorVenda){
                maiorVenda = valorVenda;
                diaMaiorVenda = i;
            }
        }

        double media = totalVendas / qtdDias;
        System.out.println("\n--- Resultado da Análise ---");
        System.out.printf("Total de vendas: R$ %.2f%n", totalVendas);
        System.out.printf("Média das vendas diárias: R$ %.2f%n", media);
        System.out.printf("Maior venda foi no dia %d com valor de R$ %.2f%n", diaMaiorVenda, maiorVenda);
        scanner.close();
    }
}