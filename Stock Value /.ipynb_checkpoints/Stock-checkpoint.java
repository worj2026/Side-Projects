/* 
Disc: This program is used to find how mush was earned or lost on a stock for a given day 

Date 10/27/2023
Developed by: Worj

*/
import java.util.Scanner;
import java.text.*;
public class Stock{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("NOTE: ENTER NEGATIVE VALUR TO LEAVE PROGRAM");
        System.out.println("\n\n");
        System.out.print("Enter your buying price: ");
        double buyPrc = scan.nextDouble();
        int day = 1;
        double clsPrc = 0.1;        
        DecimalFormat df = new DecimalFormat("0.00");
        while(true) {
            System.out.print("\nEnter the closing price for the day: ");
            clsPrc = scan.nextDouble();
            if(clsPrc <0.0)break;
            double earnings = clsPrc - buyPrc;
            if(earnings > 0){
                System.out.print("\nAfter day " + day + " you earned " + df.format(earnings) + " per share.");
            }
            else if(earnings < 0.0){
                System.out.print("\nAfter day " + day + " you lost " + df.format((-earnings)) + " per share.");
            }
            else {
                System.out.print("\nAfter day " + day + " you have  earned nothing per share.");
            }
            day += 1;
    }
        scan.close();
}
}