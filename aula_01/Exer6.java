import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o título do livro: ");
        String tituloLivro = sc.nextLine();

        System.out.println("Digite o número de dias em atraso: ");
        int diasAtrasados = sc.nextInt();

        double multaTotal = (diasAtrasados * 1.25);

        System.out.println("\n+------------------------------+");
        System.out.println("| AVISO DE MULTA - BIBLIOTECA  |");
        System.out.println("+------------------------------+");
        System.out.printf("| Livro: %-30s|\n", tituloLivro);
        System.out.printf("| Dias em Atraso: %-30" + "d|\n", diasAtrasados);
        System.out.printf("| Multa Total: R$ %-30"+ ".2f|\n", multaTotal);
        System.out.println("+------------------------------+");
        System.out.println("Por favor, regularize sua situação.");

        sc.close();

    }
}
