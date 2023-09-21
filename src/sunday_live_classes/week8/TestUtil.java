package sunday_live_classes.week8;

import sunday_live_classes.util.CoolCode;

import java.util.Arrays;

public class TestUtil {
    public static void main(String[] args) {

        int[][] arr = {
                {3, 2, 4, 2},
                {1, 3},
                {5, 325, 123}
        };
        System.out.println(Arrays.deepToString(arr));

        System.out.println(CoolCode.print2D(arr));

    }
}