/*
 * 6. Driver�s License Exam
The local Driver�s License Office has asked you to write a program that grades the written 
portion of the driver�s license exam. The exam has 20 multiple choice questions. Here are 
the correct answers:
1. B   	6. A  	11. B  	16. C
2. D   	7. B  	12. C  	17. C
3. A   	8. A  	13. D  	18. B
4. A   	9. C  	14. A  	19. D
5. C  	10. D  	15. D  	20. A
A student must correctly answer 15 of the 20 questions to pass the exam.
Write a class named DriverExam that holds the correct answers to the exam in an array field. 
The class should also have an array field that holds the student�s answers. The class should 
have the following methods:
�	 passed. Returns true if the student passed the exam, or false if the student failed
�	 totalCorrect. Returns the total number of correctly answered questions
�	 totalIncorrect. Returns the total number of incorrectly answered questions
�	 questionsMissed. An int array containing the question numbers of the questions that 
the student missed
Demonstrate the class in a complete program that asks the user to enter a student�s answers, 
and then displays the results returned from the DriverExam class�s methods.
Input Validation: Only accept the letters A, B, C, or D as answers.
 */

import java.util.Scanner;

public class driverLicenceExam {
	public static void main(String[] args) {
		char[] markingScheme = {'B','D','A','A','C','A','B','A','C','D','B','C',
								'D','A','D','C','C','B','D','A'};
		char[] studAnswers = new char[20];
		//Scanner scan = new Scanner(System.in);
		
		if(passed(markingScheme, studAnswers)) {
			System.out.println("You have passed driving exam.");
		}else {
			System.out.println("You have failed driving exam.");
		}
	}
	
	/*public static void gettingAnswers(char[] studAns) {
		Scanner scan = new Scanner(System.in);
		for(char ans: studAns) {
			ans = scan.next().charAt(0);
		}
	}*/
	
	public static boolean passed(char[] marking, char[] studAns) {
		boolean ans = true;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		for(int a = 0; a < studAns.length; a++) {
			System.out.println("Enter marks for question: "+a);
			studAns[a] = scan.nextLine().charAt(0);
		}
		
		for(int a = 0; a < studAns.length; a++) {
			if(marking[a] == studAns[a]) {
				count++;
			}
		}

		ans = count == 15;
		
		return ans;
		
	}

}
