package com.company;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args){
        //Faça um Programa que leia 10 números inteiros e armazene-os num vetor.
        // Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.
        int parPosicao = -1;
        int impPosicao = -1;
        int[] todosNumeros = new int[10];
        int[] numPar = new int[10];
        int[] numImpar = new int[10];
        boolean verificarNumerosB = false;

        System.out.println("digite 10 valores para serem divididos em par e ímpar:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< todosNumeros.length; i++){
            todosNumeros[i] = sc.nextInt();
        }
        for (int i = 0; i< todosNumeros.length; i++){
            int verificarNumeros = todosNumeros[i];
            verificarNumerosB = true;

            while(verificarNumerosB){
                if(verificarNumeros == 0){
                    parPosicao++;
                    numPar[parPosicao] = todosNumeros[i];
                    verificarNumerosB = false;
                    break;

                }else if (verificarNumeros == 1){
                    impPosicao++;
                    numImpar[impPosicao] = todosNumeros[i];
                    verificarNumerosB = false;
                    break;
                }else {
                    verificarNumeros = verificarNumeros -2;
                }
            }
        }
        System.out.println("Numeros informados ao sistema: ");
        for (int i = 0; i< todosNumeros.length; i++){
            System.out.print(todosNumeros[i] + " ");
        }

        System.out.println("\nValores Pares recebidos: ");
        for (int i = 0; i< todosNumeros.length; i++){
            System.out.print(numPar[i] + " ");
        }

        System.out.println("\nValores ímpar recebidos");
        for (int i = 0; i< todosNumeros.length; i++){
            System.out.print(numImpar[i] + " ");
        }
    }
}
