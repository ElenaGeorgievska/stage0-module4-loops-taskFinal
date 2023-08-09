package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        for (int i=1; i<=cathetusLength; i++){//outer forloop
            for (int j=1; j<=(cathetusLength-i); j++){
                System.out.print(" ");//create initial space for pyramid shape
            }
            for (int k=i; k>=1; k--){//inner for loops
                System.out.print(k+ "");//create left half
            }
            for (int l=2; l<=i; l++){
                System.out.print(l+"");    //create right half
            }//end outer for loop
            System.out.println();
        }

//        for (int i=1; i<=cathetusLength; i++){//outer forloop
//            for (int j=1; j<=(cathetusLength-i)*2; j++){
//                System.out.print(" ");//create initial space for pyramid shape
//            }
//            for (int k=i; k>=1; k--){//inner for loops
//                System.out.print(k+ " ");//create left half
//            }
//            for (int l=2; l<=i; l++){
//                System.out.print(l+" ");    //create right half
//            }//end outer for loop
//            System.out.println();
//        }


    }

    public static void main(String[] args) {

        new Pyramid().printPyramid(9);
    }
}
