class Extend
{
    public static void main (String[] args)
    {
        First sn=new First();
        Second sc= new Second();
        sn.first();
        sc.second();
        sc.first();
    }
}


class First
{
    void first()
    {
        System.out.println("THIS IS PARENT CLASS");
    }
}
class Second extends First
{
    void second()
    {
        System.out.println("THIS IS CHILD CLASS");
    }
}
