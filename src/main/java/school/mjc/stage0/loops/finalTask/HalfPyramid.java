package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
            int i, j;
            for (i = 1; i <= cathetusLength; i++) {
                for(j = i; j <= cathetusLength; j++) {
                    System.out.print(" ");
                }

                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
