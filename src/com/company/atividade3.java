package com.company;

import java.util.Scanner;

public class atividade3 {
    public static void main (String[] args){
        //Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
        double[] notas = new double[4];
        int sum = 0;
        double media = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as notas dos 4 bimestres ");
        for (int i=0; i<notas.length;i++){
            notas[i] = sc.nextDouble();
            media+= notas[i];
        }

        System.out.println("Notas recebidas: ");
        for (int i=0; i< notas.length;i++){
            System.out.print(notas[i] + " ");
        }
        System.out.println("\nMédia entre as notas: " +media/ notas.length);

    }
}
