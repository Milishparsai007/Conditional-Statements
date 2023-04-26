//check the radix of the given number string
//find if a year is leap year or not

import java.util.Scanner;
public class Challenge_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string as number");
        String number = sc.next();
        if(number.matches("[01]+"))
        {
            System.out.println("Radix of the given number is 2 i.e., it i s binary number");
        }
        else if (number.matches("[0-7]+")) {
            System.out.println("Radix of the given number is 8 i.e., it i s octal number");
        }
        else if(number.matches("[0-9][A-F]+"))
        {
            System.out.println("Radix of the given number is 16 i.e., it i s Hexadecimal number");

        }
        else if(number.matches("[0-9]+"))
        {
            System.out.println("Radix of the given number is 10 i.e., it is real number");
        }
        else
        {
            System.out.println("Not a number");
        }


        System.out.println("Enter the year : ");
        int year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("year "+year+" is a leap year");
                }
                else
                {
                    System.out.println("year is not a leap year");
                }

            }
            else {
                System.out.println("Year "+year+" is a leap year");
            }
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
}
