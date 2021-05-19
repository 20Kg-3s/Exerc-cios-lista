package com.company;

import java.util.Scanner;

public class atividade6 {

    public static void main(String[] args) {
        float[][] notasAlunos = new float[10][4];
        float[] mediaAlunos = new float[10];
        int media7  = 0;

        for(int i=0;i<notasAlunos.length;i++){
            System.out.println((i+1)+ "° aluno");
            for (int j=0;j<4;j++){
                System.out.println("Digite as notas do " +(j+1)+ "° período.");
                Scanner sc = new Scanner(System.in);
                notasAlunos[i][j] = sc.nextFloat();
            }

        }
        for (int i=0;i<notasAlunos.length;i++){
            for (int j=0;j<4;j++){
                mediaAlunos[i] = mediaAlunos[i] + notasAlunos[i][j];
            }
            mediaAlunos[i] = (mediaAlunos[i]/4);
        }
        System.out.println("Número de alunos aprovados:");
        for (int i=0;i<10;i++){
            if (mediaAlunos[i] >= 7){
                media7++;
            }
        }
        System.out.println(media7);






    }
}
