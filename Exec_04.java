package Exercicios_slide01;

import java.util.Arrays;
import java.util.Random;

public class Exec_04 {

    public static void main(String[] args) {
        int tamanho = 10; //Tamanho do vetor
        int[] vetor = new int[tamanho]; //Vetor para armazenar os números aleatórios
        Random random = new Random(); //Objeto para gerar números aleatórios

        //Preenche o vetor com números aleatórios
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100); //Gera um número aleatório entre 0 e 99
        }

        //Ordenar o vetor em ordem crescente
        Arrays.sort(vetor);

        //Exibe o vetor ordenado
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        //Valor a ser pesquisado
        int valorPesquisado = 42;

        //Realiza a busca binária
        int indice = buscaBinaria(vetor, valorPesquisado);

        //Exibe o resultado da busca
        if (indice != -1) {
            System.out.println("O valor " + valorPesquisado + " foi encontrado no índice " + indice + " do vetor.");
        } else {
            System.out.println("O valor " + valorPesquisado + " não foi encontrado no vetor.");
        }
    }

    //Implementação do algoritmo de busca binária
    public static int buscaBinaria(int[] vetor, int valor) {
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (vetor[meio] == valor) {
                return meio; // Valor encontrado
            } else if (vetor[meio] < valor) {
                esquerda = meio + 1; // Busca na metade direita do vetor
            } else {
                direita = meio - 1; // Busca na metade esquerda do vetor
            }
        }

        return -1; //Valor não encontrado
    }
}
