import java.util.*;
public class searchingLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String sentence = "Four score and seven years ago";  //"The word and appears at the " +
                                                             //"following locations.
        System.out.println("Enter only one letter for the search position."+sentence.length());
        String letter = scan.nextLine();
        char l =  letter.charAt(0);
        for (int c = 0; c<sentence.length();c++){
            if(l == sentence.charAt(c)){
                list.add(c);
            }
        }

        System.out.println("letter: "+l+ " has appeared at positions: ");
        for(int disp: list){
            System.out.println(disp);
        }

        // or we can code like this below.
        /*
            String str = "Four score and seven years ago";
            int position;
            System.out.println("The letter r appears at the " +
                                "following locations:");
            position = str.indexOf('r');
            while (position != -1)
            {
                System.out.println(position);
                position = str.indexOf('r', position + 1);
             }
         */
    }
}