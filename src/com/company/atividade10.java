package com.company;

import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args){
        float vetor1 []= new float[5];
        float vetor2 []= new float[5];
        float vetmerge[]= new float[vetor1.length + vetor2.length];

        System.out.println("Valores do primeiro vetor: ");

        for(int i=0; i< vetor1.length;i++){
            Scanner sc = new Scanner(System.in);
            vetor1[i] = sc.nextInt();

        }

        System.out.println("Valores do segundo vetor: ");

        for(int i=0; i< vetor2.length;i++){
            Scanner sc = new Scanner(System.in);
            vetor2[i] = sc.nextInt();

        }

        int n=0;
        int j=0;
        while (n< vetmerge.length){
            vetmerge[n] = vetor1[j];
            n++;
            vetmerge[n] = vetor2[j];
            n++;
            j++;
        }
        System.out.println("vetores intercalados: ");
        for (int i=0; i< vetmerge.length;i++){
        System.out.println( vetmerge[i]+ ", ");
        }
    }
}
