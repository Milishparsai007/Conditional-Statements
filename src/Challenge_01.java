/*
1. Number is odd or even
2. Person is young or not
3. grades for given marks

*/

import java.util.Scanner;
public class Challenge_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Solution to problem 1st :-");
        System.out.println("Enter a number : ");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
        System.out.println("solution to problem 2:-");
        System.out.println("enter the age of person : ");
        int age = sc.nextInt();
        if(age<12)
        {
            System.out.println("Person is child");
        }
        else if (age>11 && age<20) {
            System.out.println("person is teenager");
        }
        else if (age>19 && age<50) {
            System.out.println("Person is young");
        }
        else
        {
            System.out.println("Person is not young`");
        }

        System.out.println("Solution to problem 3 :-");
        System.out.println("Enter marks : ");
        float marks=sc.nextFloat();
        if(marks<20)
        {
            System.out.println("D grade");
        }
        else if(marks>20 && marks<40)
        {
            System.out.println("C grade");
        }
        else if (marks>40 && marks<60) {
            System.out.println("B grade");
        }
        else if (marks>60 && marks<80) {
            System.out.println("A grade");
        }
        else
        {
            System.out.println("O grade");
        }
    }
}
