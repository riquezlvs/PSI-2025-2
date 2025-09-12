import java.util.*;

public class atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número de estudantes: ");
        int qtdAlunos = sc.nextInt();

        int[] notas = criaVetor(qtdAlunos);

        int media = calcularMediaTurma(notas);

        System.out.println("\nMédia da turma: " + media);

        imprimirResultados(notas);
    }

    public static int[] criaVetor(int n) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Nota final do aluno %d: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        return vetor;
    }

    public static int calcularMediaTurma(int[] vetor) {
        int soma = 0;
        for (int nota : vetor) {
            soma += nota;
        }
        return soma / vetor.length;
    }

    public static void imprimirResultados(int[] vetor) {
        System.out.println("\nResultados dos estudantes:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= 7) {
                System.out.println("Aluno " + (i + 1) + ": Aprovado (Nota: " + vetor[i] + ")");
            } else {
                System.out.println("Aluno " + (i + 1) + ": Recuperação (Nota: " + vetor[i] + ")");
            }
        }
    }
}
