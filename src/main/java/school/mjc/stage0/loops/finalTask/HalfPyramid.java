package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {

        // Outer for loop.
        for (int i = 1; i <= cathetusLength; i++) {
            // Inner for loop.
            for (int j = cathetusLength; j >= 1; j--) {
                if (j > i)
                    System.out.print(" ");
                else
                    System.out.print("*" + "");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        new HalfPyramid().printHalfPyramid(5);
    }
}
