package Step1.Plus_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for(int i=0; i<arr.length; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = addNumeric(a,b);
        }
        printNumeric(arr);
    }

    public static int addNumeric(int a, int b) {
        return a+b;
    }

    public static void printNumeric(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
