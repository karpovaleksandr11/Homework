package ru.geekbrains.lesson4;

import java.util.Arrays;

public class Game {



    public static void main(String[] args) {

        fillArray();

        int[] arr = {5, 6, 9, 4};
        System.out.println(Arrays.toString(arr));
        replaceArray(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};



        changeArray(arr2);
        System.out.println(Arrays.toString(arr2));



        fillArray3();

    }



    private static void fillArray() {

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

    }



    public static void replaceArray(int[] arr) {



        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                arr[i] = 9;
            }
            if (arr[i] == 9) {
                arr[i] = 6;
            }
            if (arr[i] == 4) {

                arr[i] = 5;

            }
        }
    }

    private static void changeArray(int[] arr2) {

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }

        }
    }

    private static void fillArray3(){

        int[][] arr3 = new int[8][8];
        arr3[0][0] = 1;
        arr3[1][1] = 1;
        arr3[2][2] = 1;
        arr3[2][2] = 1;
        arr3[3][3] = 1;
        arr3[4][4] = 1;
        arr3[5][5] = 1;
        arr3[6][6] = 1;
        arr3[7][7] = 1;
        arr3[0][7] = 1;
        arr3[1][6] = 1;
        arr3[2][5] = 1;
        arr3[3][4] = 1;
        arr3[4][3] = 1;
        arr3[5][2] = 1;
        arr3[6][1] = 1;
        arr3[7][0] = 1;





        for (int i = 0; i < arr3.length; i++){

            for (int j = 0; j < arr3.length; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }



}
