//1.display name of day based on number
//2.display name of month based on number
//3.display type of website

import java.util.Scanner;
public class Challenge_04_switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        byte n=sc.nextByte();
        switch (n)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("enter a valid number");
                break;
        }

        System.out.println("Enter a number : ");
        byte month = sc.nextByte();
        switch (month)
        {
                case 1:
                    System.out.println("january");
                    break;
                case 2:
                    System.out.println("february");
                    break;
                case 3:
                    System.out.println("march");
                    break;
                case 4:
                    System.out.println("april");
                    break;
                case 5:
                    System.out.println("may");
                    break;
                case 6:
                    System.out.println("june");
                    break;
                case 7:
                    System.out.println("july");
                    break;
            case 8:
                    System.out.println("august");
                    break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("Enter a valid number");
                break;

        }

        System.out.println("Enter url of website : ");
        String url = sc.next();
        String type=url.substring(url.lastIndexOf(".")+1);
        switch (type)
        {
            case "com" :
                System.out.println("commercial");
                break;
            case "org":
                System.out.println("Organization");
                break;
            case "net":
                System.out.println("Network");
                break;
            case "biz":
                System.out.println("Business");
                break;
            case "gov":
                System.out.println("Government");
                break;
            default:
                System.out.println("none type");
                break;
        }
    }
}
