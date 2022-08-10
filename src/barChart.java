import java.util.*;
/*
12. Bar Chart
Write a program that asks the user to enter today’s sales for five stores. The program should
display a bar chart comparing each store’s sales. Create each bar in the bar chart by displaying a row of asterisks.
Each asterisk should represent $100 of sales. Here is an example of
the program’s output:
Enter today's sales for store 1: 1000 [Enter]
Enter today's sales for store 2: 1200 [Enter]
Enter today's sales for store 3: 1800 [Enter]
Enter today's sales for store 4: 800 [Enter]
Enter today's sales for store 5: 1900 [Enter]
SALES BAR CHART
Store 1: **********
Store 2: ************
Store 3: ******************
Store 4: ********
Store 5: *******************
 */
public class barChart {
    public static void main(String[] args){

        int[] sales = new int[6];
        Scanner scan = new Scanner(System.in);

        for (int a = 1; a < sales.length; a++){
            System.out.print("Enter today's sales for store "+a+":");
            sales[a] = scan.nextInt();
            System.out.println("");
        }

        System.out.println("");

        System.out.println("SALES BAR CHART");
        for (int a = 1; a < sales.length; a++){
            int aster = 100;
            int result = sales[a] / aster;
            System.out.print("Store "+a+": ");

            for(int b = 1; b <= result; b++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
