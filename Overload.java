import java.util.*;
class Overload
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Overload sn= new Overload();
        System.out.println("Enter the radius of circle");
        int r = sc.nextInt();
        System.out.println("Enter the length and breadth of rectangle");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sn.Area(r);
        sn.Area(x,y);
    }
    void Area(int r)
    {
        double A;
        double pi=3.1415;
        A= pi*r*r;
        System.out.println("Area of circle is "+A);
    }
    void Area(int x, int y)
    {
        int a;
        a=x*y;
        System.out.println("Area of rectangle is "+a);
    }
}
        
        
        