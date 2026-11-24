//7. Find a year Leap-year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt(); //Taking a year input.

        if ((year%400==0)||((year%4==0)&&(year%100!=0))) //The Year Divisible by 400 or divisible by 4 and not by 100 is a Leap year.
        {
            System.out.println(year+" is a Leap year.");
        }
        else //Else the year is not a leap year.
        {
            System.out.println(year+" is not a Leap year.");
        }
        input.close();
    }
}
