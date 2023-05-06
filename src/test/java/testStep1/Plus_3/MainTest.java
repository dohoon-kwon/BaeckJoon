package testStep1.Plus_3;

import Step1.Plus_3.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main main;

    @BeforeEach
    void setMain() {
        main = new Main();
    }

    @Test
    void addNumeric() {
        //given
        int a = 1;
        int b = 1;

        //when
        int result = main.addNumeric(a,b);

        //then
        assertEquals(2,result);
    }

    @Test
    void printNumeric() {
        //given
        int count = 1;
        int[] arr = new int[count];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = main.addNumeric(a,b);
        }

        //then
        main.printNumeric(arr);
    }
}
