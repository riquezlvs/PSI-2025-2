import java.util.Scanner;

public class Curtida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroPublicacoes;

        do{
            System.out.println("Numero de publicações ");
            numeroPublicacoes = scanner.nextInt();
            if (numeroPublicacoes <= 0) {
                System.out.println("O numero de publicações deve ser um valor positivo.");
            }
        }while(numeroPublicacoes <= 0);

        int totalCurtidas = 0;

        for(int i = 1; i <= numeroPublicacoes; i++){
            System.out.println("Quantidade de Likes: ");
            int qtdCurtidas = scanner.nextInt();
            totalCurtidas += qtdCurtidas;
            if (qtdCurtidas >= 100) {
                System.out.println("\tPublicação popular!");
            }else{
                System.out.println("\tPublicação com poucas curtidas!");
            }
        }
        double mediaCurtidas = totalCurtidas / numeroPublicacoes;
        System.out.printf("Numeros de publicações: %d\n", numeroPublicacoes);
        System.out.printf("Total de curtidas: %d\n", totalCurtidas);
        System.out.printf("Media de curtidas: %d\n", mediaCurtidas);

        scanner.close();
    }
}
