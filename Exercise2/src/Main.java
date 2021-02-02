import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Please enter number of columns: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        // rows = array.length
        // columns = array[i].length

        for(int i = 0; i < rows; i++){
            System.out.print("Enter row "+ i+": ");
            for(int j = 0; j < columns; j++){
                int integer = scanner.nextInt();
                array[i][j] = integer;
            }
        }
        printMatrix(array);

        int[][] invertMatrix = new int[rows][columns];
        for(int i = rows - 1,inti = 0; i>= 0; i--,inti++){
            for(int j = columns -1, intj = 0; j>= 0; j--,intj++){
                invertMatrix[inti][intj]= array[i][j];
            }
        }

        System.out.println("This is our invert Matrix ");
        printMatrix(invertMatrix);

//        int[][] intArray = invertMatrix(rows, columns);
//
//        printMatrix(intArray, rows);

    }

    public static void printMatrix(int[][] array){
        for(int i = 0; i< array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }

//    public static int[][] invertMatrix(int rows, int columns){
//        int[][] intArray = new int[rows][columns];
//        int count = 0;
//        for(int i = rows -1 ; i >= 0 ; i--){
//            // r =3
//            System.out.print("Enter row in index "+count+": ");
//            for(int j = columns -1; j >= 0; j--){
//                int a = in.nextInt();
//                intArray[i][j] = a;
//            }
//            in.nextLine();
//            count++;
//        }
//        return intArray;
//    }

}
