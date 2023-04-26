
public class Relational {
    public static void main(String[] args)
    {
        int a=5,b=10,c=4;
        System.out.println(a<b);
        System.out.println(a<b && b<c);
        System.out.println(a<b && b>c);
        System.out.println(a>b || b>c);
        if(a<b)
        {
            System.out.println("A is less than b");
        }
        else
        {
            System.out.println("A is not less than b");
        }
        if(a>b && a>c)
        {
            System.out.println("A is greatest");
        }
        else if (b>c)
        {
            System.out.println("B is greatest");
        }
        else
        {
            System.out.println("C is greatest");
        }
    }

}