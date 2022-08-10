import java.util.*;
/*
1. Backward String
Write a method that accepts a String object as an argument and displays its contents backward.
For instance, if the string argument is “gravity” the method should display -“ytivarg”.
Demonstrate the method in a program that asks the user to input a string and then passes it
to the method.
 */
public class backwardString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.println("Enter a word."); //Eg: Gravity
        word = scan.nextLine();

        reversed(word);
    }

    public static void reversed(String str){
        //StringBuilder strb = new StringBuilder(str);
        char[] c;
        c = str.toCharArray();

        System.out.println("Now we reverse your words.");
        //for (int count = 0; count < c.length;count++){  //normal looping.
        for (int count = c.length-1; 0 <= count; count--){
            System.out.print(c[count]);
        }

    }
}