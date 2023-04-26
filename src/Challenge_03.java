//1. Display name of the day based on the number
//2. find type of website and the protocol used


import java.util.Scanner;
public class Challenge_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to know the day : ");
        short n=sc.nextShort();
        if(n<=7)
        {
            if (n==1)
                System.out.println("Monday");
            else if(n==2)
                System.out.println("tuesday");
            else if(n==3)
                System.out.println("wednesday");
            else if(n==4)
                System.out.println("thursday");
            else if(n==5)
                System.out.println("friday");
            else if(n==6)
                System.out.println("saturday");
            else
                System.out.println("SUNDAY!!");
        }
        else
            System.out.println("Enter a valid week number");


        System.out.println("Enter the url of a website");
        String url = sc.next();
        if(url.startsWith("http://") || url.startsWith("https://") || url.startsWith("ftp://"))
        {
            System.out.println("Protocol used in this website is : ");
            System.out.println(url.substring(0,url.indexOf(":")));
            if(url.endsWith(".com"))
            {
                System.out.println("This website is an commercial website");
            }
            else if(url.endsWith(".org"))
                System.out.println("This website is an organisational website");
            else if(url.endsWith(".gov"))
                System.out.println("This website is an government website");
            else if(url.endsWith(".net"))
                System.out.println("This website is an network website");
            else if(url.endsWith(".biz"))
                System.out.println("This website is an business website");
        }
        else
            System.out.println("Please enter a valid url");
    }
}
