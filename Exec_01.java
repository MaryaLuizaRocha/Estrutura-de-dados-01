package Exercicios_slide01;

import java.util.Scanner;

public class Exec_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10]; //Vetor para armazenar os valores do primeiro vetor
        int[] vetorB = new int[10]; //Vetor para armazenar os valores do segundo vetor
        double[] vetorMedia = new double[10];

        //Lê o primeiro vetor
        System.out.println("Primeiro vetor: Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetorA[i] = scanner.nextInt();
        }

        //Lê o segundo vetor
        System.out.println("Segundo vetor: Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetorB[i] = scanner.nextInt();
        }

        //Calcula a média dos elementos do mesmo índice
        for (int i = 0; i < 10; i++) {
            vetorMedia[i] = (vetorA[i] + vetorB[i]) / 2.0;
        }

        //Exibe o terceiro vetor
        System.out.println("Resultado com as médias:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Índice " + i + ": " + vetorMedia[i]);
        }
        scanner.close();

        //Primeiro vetor: Digite 10 números inteiros:
        //1 10 9 8 7 34 2 20 5 9
        //Segundo vetor: Digite 10 números inteiros:
        //80 40 2 4 1 12 55 30 21 7

        //Resultado esperado:
        //Índice 0: 40.5 (80+1)/2
        //Índice 1: 25.0 (40+10)/2
        //Índice 2: 5.5 (9+2)/2
        //Índice 3: 6.0
        //Índice 4: 4.0
        //Índice 5: 23.0
        //Índice 6: 28.5
        //Índice 7: 25.0
        //Índice 8: 13.0
        //Índice 9: 8.0
    }
}
