/*
 * . Rainfall Class
Write a RainFall class that stores the total rainfall for each of 12 months into an array of 
doubles. The program should have methods that return the following:
�	 the total rainfall for the year
�	 the average monthly rainfall
�	 the month with the most rain
�	 the month with the least rain
Demonstrate the class in a complete program.
Input Validation: Do not accept negative numbers for monthly rainfall figures.
 */
import java.util.Scanner;
public class rainFall {
	public static void main(String[] args) {
        double[] rain = new double[12];
        String[] month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        double summing = 0;
        double avg = 0;
        //System.out.print(rain.length);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rainfall for each month.");
        for (int c = 0; c<rain.length; c++){
            System.out.println("Enter rainfall for "+ month[c]);
            rain[c] = scan.nextDouble();
        }

        System.out.println("Total rainfall is: ");
        
        System.out.println(total(summing, rain));

        System.out.println("Average rainfall is: ");
        System.out.println(average(avg, summing, rain));
    }

    public static double total(double s, double[] rainValue){
        //the total rainfall for the year.
        for (int b = 0; b<rainValue.length; b++){
            s += rainValue[b];
        }
        return s;
    }

    public static double average(double average, double s, double[] rainValue){
        // the average monthly rainfall.
        for (int a = 0; a<rainValue.length; a++){
            s += rainValue[a];
        }
        average = s / rainValue.length;
        return average;
    }
    //TODO finish the two methods below.
/*
    public static String mostRainMonth(double[] rainValue){
        //the month with the most rain.
        double low = 0, high = rainValue.length;
        if (){

        }

    }

    public static String leastRainMonth(){
        //the month with the least rain.

    }
 */
}
