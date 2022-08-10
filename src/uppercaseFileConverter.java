import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
/*
15. Uppercase File Converter
Write a program that asks the user for the names of two files. The first file should be opened
for reading and the second file should be opened for writing. The program should read
the contents of the first file, change all characters to uppercase, and store the results in the
second file. The second file will be a copy of the first file, except that all the characters will
be uppercase. Use Notepad or another text editor to create a simple file that can be used
to test the program.
 */
public class uppercaseFileConverter {
    public static void main(String[] args) throws FileNotFoundException {
        // we are opening on file for reading data and changing letters into capital letters
        String fileName1, fileName2; // file names
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter file 1 path...");
        fileName1 = keyboard.nextLine();  //Enter this,  C://Users//USER//IdeaProjects//chapter 4//src//expression.txt

        System.out.println("Enter file 2 name...");
        fileName2 = keyboard.nextLine();   //Enter this,  writingFile.txt

        File file = new File(fileName1);
        Scanner fileScan1 = new Scanner(file);

        ArrayList file1 = fileReading(fileScan1);

        // we are going now to make a copy of the details/result to another file.
        PrintWriter writeToFile = new PrintWriter(fileName2);
        for (int a = 0; a < file1.size()-2; a++ ){
            writeToFile.println(file1);
        }


        writeToFile.close();
        System.out.println("DONE WRITING TO THE FILE.");
    }


    public static ArrayList fileReading(Scanner files) throws FileNotFoundException{
        String fileDetails = "";
        ArrayList<String> fileLinesDetails = new ArrayList<>();

        while (files.hasNext()){
            fileDetails = files.nextLine();
            fileLinesDetails.add(fileDetails);
            System.out.println(fileDetails.toUpperCase(Locale.ROOT));
        }

        files.close();
        System.out.println("DONE READING FROM FILE 1.");

        return fileLinesDetails;
    }

}
