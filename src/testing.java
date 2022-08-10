import java.util.Scanner;
import java.util.Random;
public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello, welcome to the game!");
		System.out.println("Enter yhour name.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Hello, "+ name);
		
		Random rand = new Random();
		int number = rand.nextInt(10) + 1;
		System.out.println("Shall the game begin?");
		String answer = scanner.next();
		
		//if(answer.toLowerCase() == "yes") {
			int value = 0;
			while(value <= 5){
			System.out.println("Enter a digit(1-10) of your guess.");
			int guess = scanner.nextInt();
			if(guess == number) {
				System.out.println("Hurray! you made it, congratulations.");
				break;
			}else if(guess < number) {
				System.out.println("Guess an upper value.");
			}else if(guess > number) {
				System.out.println("Guess a lower value.");
			}
			value ++;
			
		}
	 /* }else{
		  System.out.println("Mh! sorry to know you disliked the game.");
	  }*/
	}

}
