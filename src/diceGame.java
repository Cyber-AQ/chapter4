import java.util.*;
/*
21. Dice Game
Write a program that plays a simple dice game between the computer and the user. When
the program runs, a loop should repeat 10 times. Each iteration of the loop should do the
following:
•	 Generate a random integer in the range of 1 through 6. This is the value of the
computer’s die.
•	 Generate another random integer in the range of 1 through 6. This is the value of the
user’s die.
•	 The die with the highest value wins. (In case of a tie, there is no winner for that
particular roll of the dice.)
As the loop iterates, the program should keep count of the number of times the computer
wins, and the number of times that the user wins. After the loop performs all of its iterations,
the program should display who was the grand winner, the computer or the user.
 */
public class diceGame {
    public static void main(String[] args) {
        int comp,users;
        int computerCount = 0, userCount = 0;
        Random computer = new Random();
        Random user = new Random();

        for (int a = 0; a < 10; a++){
            comp = computer.nextInt(6)+1;
            users = user.nextInt(6)+1;
            System.out.print(comp+"   ");
            System.out.print(users);
            if (comp > users){
                computerCount++;
            }else if(users > comp){
                userCount++;
            }
            System.out.println();
        }

        if (computerCount > userCount) {
            System.out.println("The winner is: Computer, who won: "+computerCount+" Times");
        }else{
            System.out.println("The winner is: User, who won: "+userCount+" Times");
        }

    }
}
