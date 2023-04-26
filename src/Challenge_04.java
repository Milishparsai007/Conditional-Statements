//menu driven program for arithmetic operation

import java.util.Scanner;

public class Challenge_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        float a = sc.nextFloat();
        float b=sc.nextFloat();
        float result;
        int choice;
        do {
            System.out.println("Select operation : ");
            System.out.println("1. Addition\n2. Substraction\n 3. Multiplication\n4. Division");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    result=(a+b);
                    System.out.println("Result : "+result);
                    break;
                case 2:
                    result=a-b;
                    System.out.println("Result : "+result);
                    break;
                case 3:
                    result=a*b;
                    System.out.println("Result : "+result);
                    break;
                case 4:
                    result= a/(float) b;
                    System.out.println("Result : "+result);
                    break;
                default:
                    break;
            }
        }while(choice!=5);
    }
}
