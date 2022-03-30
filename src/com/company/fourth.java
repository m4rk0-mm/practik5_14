package com.company;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        String [] names = new String[2];
        int a = 1;
        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ведіть ім'я " + a +  " : ");
            a++;
            names[i] = sc.nextLine();
        }
        System.out.println(names[0].equalsIgnoreCase(names[1]));
    }
}
