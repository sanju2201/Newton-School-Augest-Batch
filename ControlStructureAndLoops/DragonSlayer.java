package ControlStructureAndLoops;

public class DragonSlayer {
    static int DragonSlayer(int A, int B, int C, int D) {
        while (A > 0 && C > 0) {
            A = A - D;
            if (A <= 0)
                break;
            C = C - B;
            if (C <= 0)
                break;

        }
        if (C > 0) {
            return 1;
        }

        else {
            return 0;
        }
    }

}
