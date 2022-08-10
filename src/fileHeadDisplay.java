import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
13. File Head Display
Write a program that asks the user for the name of a file. The program should display only
the first five lines of the file’s contents. If the file contains fewer than five lines, it should
display the file’s entire contents.
 */
public class fileHeadDisplay {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:\\Users\\USER\\IdeaProjects\\chapter 4\\src\\names.txt";
        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);

        for (int a = 0; a < 5; a++){
            String fileDetails = fileScanner.nextLine();
            System.out.println(fileDetails);
        }

       /* while(fileScanner.hasNext()){
            String contents = fileScanner.nextLine();
            System.out.println(contents);
        }

        */

        fileScanner.close();
        System.out.println("WE ARE OUT OF THE FILE.");

    }
}
