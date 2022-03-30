package com.company;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        int a = 1;
        String [] str = new String[5];
        for(int i = 0; i < 5; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ведіть " + a + " слово : ");
            a++;
            str[i] = sc.nextLine();
        }
        System.out.println(str[0].charAt(0) + " " + str[1].charAt(0) + " " + str[2].charAt(0) + " " + str[3].charAt(0) + " " + str[4].charAt(0));

    }
}
