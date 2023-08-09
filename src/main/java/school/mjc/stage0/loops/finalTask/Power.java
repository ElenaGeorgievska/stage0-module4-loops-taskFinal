package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {

        int powerNumber = (int) Math.pow(numberToPrint,power);
        System.out.println(powerNumber);

    }

    public static void main(String[] args) {

        new Power().printPower(10, 3);
    }

    //Write a program that will find power of any number using for loop
}
