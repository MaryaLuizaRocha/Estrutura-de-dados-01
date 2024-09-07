package Exercicios_slide01;

import java.util.Scanner;

public class Exec_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5; //Tamanho dos vetores
        int[] vetoresPares = new int[tamanho]; //Vetor para armazenar os números pares
        int[] vetoresImpares = new int[tamanho]; //Vetor para armazenar os números ímpares
        int contadorPares = 0; //Contador para controlar a posição no vetor de pares
        int contadorImpares = 0; //Contador para controlar a posição no vetor de ímpares

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < tamanho; i++) {
            int numero = scanner.nextInt(); //Lê o número digitado pelo usuário

            if (numero % 2 == 0) { //Verifica se o número é par
                vetoresPares[contadorPares] = numero; //Armazena o número no vetor de pares
                contadorPares++; //Incrementa o contador de pares
            } else { //Caso contrário, o número é ímpar
                vetoresImpares[contadorImpares] = numero; //Armazena o número no vetor de ímpares
                contadorImpares++; //Incrementa o contador de ímpares
            }
        }

        System.out.println("Vetores de números pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.println(vetoresPares[i]); //Exibe os números pares armazenados no vetor
        }

        System.out.println("Vetores de números ímpares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.println(vetoresImpares[i]); //Exibe os números ímpares armazenados no vetor
        }

        scanner.close();
    }
}
