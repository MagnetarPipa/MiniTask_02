package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Main
{

    private static final Scanner scanner=new Scanner(System.in);

    /**
     * Реализовать функцию перемешивания массива целых чисел (кол-во элементов > 100) блоками по K элементов N раз.
     */
    public static void main(String[] args) {

        System.out.print("Введите K: ");
        int K= Integer.parseInt(scanner.next());
        System.out.print("Введите N: ");
        int N= Integer.parseInt(scanner.next());
        int[] array = new int[K];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.print("Массив array: ");


        for (int i = 0; i < array.length; i++) {

        }

        System.out.println();

        System.out.println(Arrays.toString(array));
        System.out.println();

        for (int n=0; n<N; n++)
        {
            for(int i=0;i<5;i++)
            {
                int t=array[i];
                array[i]=array[array.length - 5+i];
                array[array.length - 5+i]=t;
            }


            for(int i=0;i<10;i++)
            {
                int t=array[i];
                array[i]=array[array.length - 10+i];
                array[array.length - 10+i]=t;
            }

        }

        System.out.println(Arrays.toString(array));
        System.out.println();
    }



}







