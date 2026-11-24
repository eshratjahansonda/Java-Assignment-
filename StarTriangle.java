//13. Star Triangle.

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt(); //Taking input of star triangle size.

        for (int i = 1; i <= size; i++) { //Outer loop for column.

            for (int j = 1; j <= i; j++) { //Inner loop for row.
                System.out.print("* "); //prints star.
            }
            System.out.println(); //for new line.
        }

        input.close();
    }
}
