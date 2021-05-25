package com.company;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args){
        //Faça um Programa que leia um vetor de 5 números reais e mostre-os na ordem inversa.
        System.out.println("Digite 5 números: ");
        Scanner sc = new Scanner(System.in);
        float[] nums = new float[5];

        for (int i=0; i< nums.length;i++) {
            nums[i] = sc.nextFloat();
        }
        for (int i=(nums.length-1);i>=0;i--){
            System.out.print(nums[i]+ " ");
        }
    }
}
