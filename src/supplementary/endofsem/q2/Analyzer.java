package supplementary.endofsem.q2;

import java.util.Arrays;

public class Analyzer {
    public static void main(String[] args) {
        final int  ARRAY_SIZE = 100;
        float frac[] = new float[ARRAY_SIZE];

        float sum = 0;
        for (int x = 0; x < frac.length; x++) {
            sum += frac[x];
        }

        System.out.println("The sum is " + sum);
    }
}
