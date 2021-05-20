package com.company;

import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args){
        int[] numeros = new int[10];

        int somaquad = 0;

        System.out.println("Digite 10 números inteiros: ");
        Scanner input = new Scanner(System.in);
        for (int i=0; i< numeros.length; i++){
            numeros[i] = input.nextInt();
        }

        for (int i=0;i< numeros.length;i++){
            somaquad += (numeros[i] * numeros[i]);
        }
        System.out.println("soma dos quadrados dos elementos: " +somaquad);
    }
}
