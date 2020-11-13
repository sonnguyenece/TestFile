import java.util.LinkedList;
import java.util.List;

public class Test {
    static int jumpingOnClouds(int[] c) {
        int jumpCount = 0;
        int countZero = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == 0) {
                countZero++;
            }

            if (c[i] == 0 && c[i + 1] == 1) {
                jumpCount += countZero / 2;
                countZero = 0;
            }

            if (c[i] == 1 && c[i + 1] == 0) {
                jumpCount++;
            }

            if ((i == c.length - 2) && c[c.length - 2] == 0 && c[c.length - 1] == 0) {
                jumpCount += (countZero + 1) / 2;
                countZero = 0;
            }
        }
        return jumpCount;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 0}));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 0, 1}));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 1, 1, 0}));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0}));
    }
}
