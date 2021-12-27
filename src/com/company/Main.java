package com.company;
import java.util.Arrays;
import java.util.Random;
import  java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int[] array = new int[7];
        for(int i = 0;i < array.length;i++){
            array[i] =  (int) (Math.random()*(200+1)) - 100;
//            array[i] = in.nextInt();
        }
        System.out.println(" ");
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        replaceNullElements(array);
        System.out.println(" ");
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
    private static void replaceNullElements(int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] != 0)
                array[count++] = array[i];
        }
        while (count < array.length){
            array[count++] = 0;
        }
    }


}
