package testStep1.Alram;

import Step1.Alram.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main main;

    @BeforeEach
    void setMain() {main = new Main();}

    @Test
    void calTime() {
        //given
        int hour = 0;
        int min = 30;

        //when
        int[] timeArr = Main.calTime(hour, min);

        //then
        int[] assertArr = new int[2];
        assertArr[0] = 23;
        assertArr[1] = 45;
        assertArrayEquals(assertArr, timeArr);
    }
}
