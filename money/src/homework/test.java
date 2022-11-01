package homework;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nums = s.nextInt();
        int[] arr = new int[nums];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1])
                    sort(arr,j,j+1);
            }
        }
        int k = delete(arr);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    //排序
    public static void sort(int[] arr ,int i ,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
    //去掉重复的数字
    public static int delete(int[] arr){
       int p = 0;
       int q = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[p] != arr[q]){
                arr[p+1] = arr[q];
                p++;
            }
            q++;

        }
        return p + 1;
    }
}







