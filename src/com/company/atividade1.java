package com.company;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args){
        //Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
        System.out.println("Digite 5 números: ");
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i< numeros.length;i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println("Números Recebidos:");
        for (int i=0;i< numeros.length;i++){
            System.out.print(numeros[i]+ " ");
        }
    }
}
