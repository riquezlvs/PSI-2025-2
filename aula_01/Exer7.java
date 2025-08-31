import java.util.Scanner;

public class Exer7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual o nome do corredor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a distancia percorrida: ");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o tempo que levou: ");
        double tempo = scanner.nextDouble();

        double VelMedia = distancia / tempo;
        double ritMedio = tempo / distancia;

        System.out.println("--------- RESUMO DE DESEMPENHO ---------");

        System.out.println("----------------------------------------");
        System.out.printf("Corredor(a): %-30s \n",nome);

        System.out.println("----------------------------------------");

        scanner.close();

    }
}