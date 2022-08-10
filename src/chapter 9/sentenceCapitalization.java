import java.util.*;
/*
3. Sentence Capitalizer
Write a method that accepts a String object as an argument and returns a copy of the string
with the first character of each sentence capitalized. For instance, if the argument is “hello.
my name is Joe. what is your name?” the method should return the string “Hello. My name
is Joe. What is your name?” Demonstrate the method in a program that asks the user to
input a string and then passes it to the method. The modified string should be displayed on
the screen.
 */
public class sentenceCapitalization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String byUser = scan.nextLine();  //“hello. my name is Joe. what is your name?”

        System.out.println("The original sentence was: "+byUser);
        System.out.println("The modified sentence is: "+getString(byUser));

    }

    public static String getString(String str){
        String word = " ";
        String[] saving = str.split("[.]");
        for (int a = 0; a< saving.length; a++){
            //TODO please enter codes here.
        }
//        for (String save: saving){
//            if (save)
//        }
        return word;
    }
}