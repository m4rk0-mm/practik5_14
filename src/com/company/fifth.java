package com.company;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        String [] str = new String[2];
        int a = 1;
        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ведіть слово " + a + " : ");
            a++;
            str[i] = sc.nextLine();

        }
        System.out.print("Довжина першого рядка " + str[0].length() + " || ");
        System.out.println("Довжина другого рядка " + str[1].length());
        a = Math.max(str[0].length(), str[1].length());
        if(str[0].length() > str[1].length()){
            System.out.println("Довший рядок №1! Кількість символів : " + a);
        }else System.out.println("Довший рядоку №2! Кількість символів : " + a);
    }
}
