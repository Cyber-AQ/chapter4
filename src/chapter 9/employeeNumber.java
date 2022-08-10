import java.util.*;
public class employeeNumber {
    public static void main(String[] args){
        /*Employee number in the format XXX–L, where each X is a digit within the range 0–9
        and the L is a letter within the range A–M.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a a proper number as XXX-L.");
        System.out.println("XXX-L, where X = digit(0-9) and L = letter(A-M).");
        String number = scan.nextLine();
//        char num = number.charAt(0);
        int count = 0;

        boolean isTrue = true;

        if (number.length() != 4){
            isTrue = false;
        }

        while(isTrue && count < 3){
            if(!Character.isDigit(number.charAt(count))){
                isTrue = false;
            }
            count++;
        }

        while(isTrue && count < 4){
            if(!Character.isLetter(number.charAt(count))){
                isTrue = false;
            }
            count++;
        }

        /* while(isTrue && count < 5){
            if(!Character.isLetter(number.charAt(count))){
                isTrue = false;
            }
            count++;
        } */

        if (isTrue){
            System.out.println("The phone number: "+number+", is same format as: XXX-L");
        }else{
            System.out.println("The phone number: "+number+", is a wrong format of: XXX-L");
        }

    }
}