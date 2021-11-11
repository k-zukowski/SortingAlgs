package com.a;

public class Bbl implements Sort{

    @Override
    public void sort(int num, int[] arr) {
        int i, j, temp;

        for (j = 0; j < num - 1; j++) {
            for (i = 0; i < num - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

}
