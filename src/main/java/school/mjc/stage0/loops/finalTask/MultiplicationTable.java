package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint >= 0) {
            for (int i = 1; i <= 10; i++) {
                int product = i * numberTableToPrint;
                System.out.println(i + " x " + numberTableToPrint + " = " + product);
            }
        }
    }

    public static void main(String[] args) {
        MultiplicationTable m = new MultiplicationTable();
        m.printTable(5);
    }
    //Write a program that prompts the user to input a positive integer.
    //It should then print the multiplication table of that number.
}
