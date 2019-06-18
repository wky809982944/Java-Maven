package com.wangkakyi.计算题1;

public class Demo14 {
    public int minArray(int[] arr) {
        int min = arr[0];
        for (int x : arr
        ) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public int minArray(int[][] arr) {
        int min = arr[0][0];
        for (int[] x : arr
        ) {
            for (int y:x
                 ){
               if(y<min)
                   min=y;
            }
        } return min;
    }


    public static void main(String args[]) {

    }
}
