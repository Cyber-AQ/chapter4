import java.util.*;
/*
2. Word Counter
Write a method that accepts a String object as an argument and returns the number of
words it contains. For instance, if the argument is “Four score and seven years ago” the
method should return the number 6. Demonstrate the method in a program that asks the
user to input a string and then passes it to the method. The number of words in the string
should be displayed on the screen.
 */
public class wordCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence."); //“Four score and seven years ago”
        String name = scan.nextLine();

        System.out.println("There are: "+wordsContained(name)+" words.");


    }

    public static int wordsContained(String str){
        int c = 0;
        String st = str.trim();
        String[] saving = st.split("[@.,!:'/-_()>=]");
        for (String save: saving){
            c++;
        }
        return c;
    }
}