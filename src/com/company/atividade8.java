package com.company;

import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args){
        float idadeAltura[][] = new float[5][2];

        for(int i=0;i<idadeAltura.length;i++){
            System.out.println("Digite o peso e a altura (cm) da "+ (i+1)+ "° pessoa");
            for (int j=0;j<2;j++){
                Scanner sc = new Scanner(System.in);
                idadeAltura[i][j] = sc.nextFloat();
            }
        }
        for (int i=4;i>-1;i--){
            System.out.println((i+1)+ "° pessoa " + "\nIdade: " +idadeAltura[i][0] + " | Altura: " +idadeAltura[i][1]);
        }
    }
}
