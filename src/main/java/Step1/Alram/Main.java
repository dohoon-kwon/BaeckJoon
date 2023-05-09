package Step1.Alram;

import java.util.Scanner;

//2884번
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        sc.close();
        int[] result = calTime(hour, min);
        System.out.print(result[0] + " " + result[1]);
    }

    public static int[] calTime(int hour, int min) {
        int[] result = new int[2];
        if(min < 45) {
            result[0] = hour < 1 ? 23 : hour - 1;
            result[1] = 60 - (45 - min);
        } else{
            result[0] = hour;
            result[1] = min - 45;
        }
        return result;
    }
}
