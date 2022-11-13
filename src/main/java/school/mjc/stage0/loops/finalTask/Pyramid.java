package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int i,j, num;
        num = 1;


        for (i = cathetusLength; i > 0; i--) {

            int x = cathetusLength + 1 - i;
            int y = 2;
             for(j = 1 ; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= num; j++) {

                System.out.print(x);
                x--;
            }
            //v++;
            for (j = num - 1; j >= 1; j--){
                System.out.print(y);
                y++;
            }
            System.out.println();
            num++;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
