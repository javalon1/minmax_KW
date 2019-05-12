package com.sda.algorytmy;


import static sun.swing.MenuItemLayoutHelper.max;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 2, 1, 3};

        min(arr);
        max(arr);

    }

    private static void min(int[] arr) {
        int a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < a) {
                a= arr[i];
            }


        }
        System.out.println("element minimalny " + a);
    }

    public static void max(int[] arr){
        int a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
                a= arr[i];
            }


        }
        System.out.println("element maksymalny " + a);
    }
}
