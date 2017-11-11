package com.epam.javaschool.shefer.chapter1.task5;

public class Tasker {

    public static void main(String[] args) {
        int SIZE = 10;
        printMatrix(buildMatrix(SIZE));
    }

    public static void printMatrix(int[][] matrix){
        for (int [] n : matrix) {
            for (int v : n) {
                System.out.print(v);
            }
            System.out.println();
        }
    }

    public static int[][] buildMatrix(int size){
        int [][] matrix = new int [size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size-1-i]=1;
        }
        return matrix;
    }
}
