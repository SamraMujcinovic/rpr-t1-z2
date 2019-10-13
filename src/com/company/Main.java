package com.company;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int c  = 0;
        int suma = 0;
        while(n != 0){
            c = n%10;
            suma += c;
            n/=10;
        }
        return suma;
    }

    public static boolean djeljivSumomSvojihCifara(int n, int suma){
        if(n%suma == 0) return true;
        return false;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner x  = new Scanner(System.in);

        System.out.println("Unesite broj n: ");
        int n = x.nextInt();

        StringBuilder s = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(djeljivSumomSvojihCifara(i, sumaCifara(i))){
                s.append(i);
                s.append(" ");
            }
        }

        String s1 = s.toString();
        System.out.println(s1);

    }
}
