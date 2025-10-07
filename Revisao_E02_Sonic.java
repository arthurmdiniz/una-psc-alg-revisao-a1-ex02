import java.util.Scanner;

public class Revisao_E02_Sonic {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int novosAliados, esperança = 0, medo = 0;
        int desafio1, desafio2, desafio3, confiança = 0, desanimo = 0;
        double media;
        int estrategiasAnalisadas, determinacao = 0, incerteza = 0;
        int positivos, negativos;

        System.out.print("Quantos novos aliados Sonic, Knuckles e Tails conseguiram encontrar? ");
        novosAliados = scanner.nextInt();
        if (novosAliados > 0) {
            esperança = novosAliados * 15;
            System.out.println("A equipe ganhou " + esperança + " pontos de Esperança.");
        } else {
            medo = 40;
            System.out.println("A equipe ganhou " + medo + " pontos de Medo.");
        }

        System.out.print("Qual a pontuação obtida no Desafio 1 (0-10)? ");
        desafio1 = scanner.nextInt();
        System.out.print("Qual a pontuação obtida no Desafio 2 (0-10)? ");
        desafio2 = scanner.nextInt();
        System.out.print("Qual a pontuação obtida no Desafio 3 (0-10)? ");
        desafio3 = scanner.nextInt();

        media = (desafio1 + desafio2 + desafio3) / 3;
        if (media >= 7) {
            confiança = 60;
        } else {
            desanimo = 60;
        }

        do{
            System.out.print("Quantas estratégias a equipe conseguiu analisar completamente (0-12)? ");
            estrategiasAnalisadas = scanner.nextInt();
        }while(estrategiasAnalisadas < 0 || estrategiasAnalisadas > 12);

        if (estrategiasAnalisadas >= 0 && estrategiasAnalisadas <= 12) {
            determinacao = estrategiasAnalisadas * 10;
            incerteza = (12 - estrategiasAnalisadas) * 10;
        } 

        System.out.println("\nResumo dos Pontos da Equipe:"
        +"\nPontos de Esperança: " + esperança
        + "\nPontos de Medo: " + medo
        + "\nPontos de Confiança: " + confiança
        + "\nPontos de Desânimo: " + desanimo
        + "\nPontos de Determinação: " + determinacao
        + "\nPontos de Incerteza: " + incerteza
        );

        positivos = esperança + confiança + determinacao;
        negativos = medo + desanimo + incerteza;

        if (positivos > negativos) {
            System.out.println("\nO Shadow foi derrotado.");
        } else  {
            System.out.println("\nO Shadow venceu o time do Sonic..");
        }

        scanner.close();

    }
}
