package Exercicios_slide01;

import java.util.Random;

public class Exec_02 {

    public static void main(String[] args) {
        int tamanho = 100; //Tamanho do vetor original
        int[] vetOriginal = new int[tamanho]; //Vetor original com cem posições
        Random random = new Random(); //Objeto para gerar números aleatórios

        //Preenche o vetor original com números aleatórios entre 0 e 100
        for (int i = 0; i < tamanho; i++) {
            vetOriginal[i] = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        }

        //Encontra a posição do menor valor
        int menorValor = vetOriginal[0]; //Assume o primeiro valor como o menor
        int posicaoMenorValor = 0; //Armazena a posição do menor valor
        for (int i = 1; i < tamanho; i++) {
            if (vetOriginal[i] < menorValor) {
                menorValor = vetOriginal[i]; //Atualiza o menor valor encontrado
                posicaoMenorValor = i; //Armazena a posição do menor valor
            }
        }

        //Calcula a soma dos números armazenados no vetor original
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetOriginal[i]; //Adiciona cada valor ao total da soma
        }

        //Preenche o novo vetor com metade do tamanho do vetor original
        int tamanhoNovoVetor = tamanho / 2;
        int[] novoVetor = new int[tamanhoNovoVetor];
        for (int i = 0; i < tamanhoNovoVetor; i++) {
            novoVetor[i] = vetOriginal[i] + vetOriginal[tamanho - 1 - i]; //Soma dos valores correspondentes
        }

        //Imprime os resultados
        System.out.println("Menor valor: " + posicaoMenorValor);
        //O programa percorre o vetor original e encontra a posição do menor valor. O resultado esperado é a posição (índice) onde ocorre o menor valor.
        System.out.println("Soma dos números armazenados: " + soma);
        //O programa calcula a soma de todos os números armazenados no vetor original. O resultado esperado é a soma total.
        System.out.println("Novo vetor:");
        //O programa cria um novo vetor com metade do tamanho do vetor original.
        //Cada posição do novo vetor é preenchida com a soma dos valores correspondentes do vetor original.
        //A primeira posição do novo vetor é a soma da primeira e da última posição do vetor original, a segunda posição é a soma da segunda e da penúltima posição, e assim por diante.
        //O resultado esperado é o novo vetor preenchido corretamente.
        for (int i = 0; i < tamanhoNovoVetor; i++) {
            System.out.println("Índice " + i + ": " + novoVetor[i]);
        }
    }
}
