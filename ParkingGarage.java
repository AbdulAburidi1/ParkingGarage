import java.util.Scanner;
import java.text.DecimalFormat;
public class ParkingGarage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Abdalmenem Aburidi
         1510 - Project 4 Program (2)
         A parking garage has 5 customers daily.
         The garage charges a $5.00 minimum fee to park up to two hours.
         The garage charges an additional $1.00 per hour for each hour
         (or part of an hour) over two hours.  The maximum charge for any given
         day is $12.00.  All cars are gone by midnight.  Write a program to
         calculate and print a summary of the charges for a day.  For input
         the program will read the hours of usage for each of the 5 cars.  The program
         will print the result, as shown below.
         */
        double car1, car2, car3, car4, car5, Total1, FirstHr, MinFee, Total2, Total3, Total4, Total5;
        double totalhours, totalcharge, MaxCharge;
        String pattern = "00.0";
        String pattern1 = "$00.00";
        DecimalFormat df, df1;
        df = new DecimalFormat(pattern);
        df1 = new DecimalFormat(pattern1);
        System.out.print("Enter the hours parked for car 1: ");
        car1 = input.nextDouble();
        System.out.print("Enter the hours parked for car 2: ");
        car2 = input.nextDouble();
        System.out.print("Enter the hours parked for car 3: ");
        car3 = input.nextDouble();
        System.out.print("Enter the hours parked for car 4: ");
        car4 = input.nextDouble();
        System.out.print("Enter the hours parked for car 5: ");
        car5 = input.nextDouble();
        FirstHr = 2;
        MinFee = 5;
        MaxCharge = 12;
        {
            if (car1 > FirstHr)
                Total1 = Math.ceil(car1) + MinFee - FirstHr;
            else
                Total1 = MinFee;
            if (car2 > FirstHr)
                Total2 = Math.ceil(car2) + MinFee - FirstHr;
            else
                Total2 = MinFee;
            if (car3 > FirstHr)
                Total3 = Math.ceil(car3) + MinFee - FirstHr;
            else
                Total3 = MinFee;
            if (car4 > FirstHr)
                Total4 = Math.ceil(car4) + MinFee - FirstHr;
            else
                Total4 = MinFee;
            if (car5 > FirstHr)
                Total5 = Math.ceil(car5) + MinFee - FirstHr;
            else
                Total5 = MinFee;
        }
        if (Total1 > MaxCharge)
            Total1 = 12;
        if (Total2 > MaxCharge)
            Total2 = 12;
        if (Total3 > MaxCharge)
            Total3 = 12;
        if (Total4 > MaxCharge)
            Total4 = 12;
        if (Total5 > MaxCharge)
            Total5 = 12;
        totalhours = car1 + car2 + car3 + car4 + car5;
        totalcharge = Total1 + Total2 + Total3 + Total4 + Total5;		
        System.out.println("");
        System.out.println("Total Hours " + df.format(totalhours));
        System.out.println("Total Charge  " + df1.format(totalcharge));
    }
}
