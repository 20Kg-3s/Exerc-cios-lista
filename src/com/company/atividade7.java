package com.company;

import java.util.Scanner;

public class atividade7 {
    public static void main (String[] args){
        int[] numeros = new int[5];
        int soma = 0;
        int mult = 1;

        System.out.println("Digite 5 números inteiros: ");
        Scanner input = new Scanner(System.in);
        for (int i=0; i< numeros.length; i++){
            numeros[i] = input.nextInt();
        }
        System.out.print("Número recebidos: ");
        for (int i=0; i< numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        for (int i=0; i< numeros.length; i++){
            soma = soma + numeros[i];
        }

        for (int i=0; i< numeros.length;i++){
            mult = mult * numeros[i];
        }
        System.out.println("\nsoma dos valores: " + soma + " \nProduto dos valores: " + mult + ".");
    }
}
