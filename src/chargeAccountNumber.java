import java.util.Scanner;

/*
 * 3. Charge Account Validation
Create a class with a method that accepts a charge account number as its argument. The 
method should determine whether the number is valid by comparing it to the following list 
of valid charge account numbers:
5658845 4520125 7895122 8777541 8451277 1302850
8080152 4562555 5552012 5050552 7825877 1250255
1005231 6545231 3852085 7576651 7881200 4581002
These numbers should be stored in an array or an ArrayList object. Use a sequential search 
to locate the number passed as an argument. If the number is in the array, the method 
should return true, indicating the number is valid. If the number is not in the array, the 
method should return false, indicating the number is invalid.
Write a program that tests the class by asking the user to enter a charge account number. 
The program should display a message indicating whether the number is valid or invalid.
 */
public class chargeAccountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter charge account number");
		int chargeNumber = scan.nextInt();
		int result;
		int[] chargeNumberArray = {
				5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
				8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
				1005231, 6545231, 3852085, 7576651, 7881200, 4581002 };
		result = detectingValue(chargeNumberArray, chargeNumber);
		
		if(result != -1) {
			System.out.println("Value is: "+ chargeNumber+ ", found at index: "+result);
		}else {
			System.out.println("Value: "+chargeNumber+ " was not found!");
		}
	}
	
	public static int detectingValue(int[] chargeArray, int value) {
		int start = 0;
		int elementFoundAt = -1;
		boolean found = true;
		while(found && start<chargeArray.length) {
			if(chargeArray[start] == value) {
				found = true;
				elementFoundAt = start;
			}
			start++;
		}
		
		return elementFoundAt;
	}

}
