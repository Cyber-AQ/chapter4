import java.util.*;
/*
20. Square Display
Write a program that asks the user for a positive integer no greater than 15. The program
should then display a square on the screen using the character ‘X’. The number entered by
the user will be the length of each side of the square. For example, if the user enters 5, the
program should display the following:
XXXXX
XXXXX
XXXXX
XXXXX
XXXXX
If the user enters 8, the program should display the following:
XXXXXXXX
XXXXXXXX
XXXXXXXX
XXXXXXXX
XXXXXXXX
XXXXXXXX
XXXXXXXX
XXXXXXXX
 */
public class squareDisplay {
    public static void main(String[] args) {
        int numsides;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of sides to display rectangle, not greater than 15.");
        numsides = keyboard.nextInt();

        for (int a = 0; a < numsides; a++){
            for (int b = 0; b < numsides; b++){
                System.out.print("X");
            }
            System.out.println("");
        }
    }
}
