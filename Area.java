import java.util.*;
class Area
{
    int len,breadth;
    Area(int l,int b)
    {
        len=l;
        breadth=b;
    }
    double returnArea()
    {
        double A;
        A=len*breadth;
        return A;
    }
    public static void main(String [] args)
    {
        int l,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        l=sc.nextInt();
        b=sc.nextInt();
        Area sn = new Area(l,b);
        System.out.println("Area is" +sn.returnArea());
    }
}
        
        