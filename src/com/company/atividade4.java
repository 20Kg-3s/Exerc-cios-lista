package com.company;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args){
        //Faça um Programa que leia um vetor de 10 caracteres,
        // e diga quantas consoantes foram lidas. Imprima as consoantes.

        char[] inputLetras = new char[10];
        char[] vogais = {'a', 'e', 'i','o','u'};
        int vogaisSoma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite 10 caracteres:");
        for (int i=0;i<inputLetras.length;i++) {
            inputLetras[i] = sc.next().charAt(0);
        }
        for (int i=0; i<10; i++){
            for (int j=0;j<5;j++){
                if (inputLetras[i]==vogais[j]){
                    inputLetras[i] = ' ';
                    vogaisSoma++;
                }
            }
        }
        System.out.println("Consoantes Lidas:");
        for (int i=0;i< inputLetras.length;i++){
            if (inputLetras[i] != ' '){
                System.out.print(inputLetras[i] + " ");
            }
        }
        System.out.println("("+(10-vogaisSoma)+ ")");




    }
}
