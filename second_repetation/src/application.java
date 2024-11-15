public class application extends polymorphism
{
@Override
    public void func()
{
    System.out.println("this is child class method");
}
public static void main(String[] args)
{
    application ap =new application();
   System.out.println(ap.sum(1,1,1));
   System.out.println(ap.sum(1,1));
   System.out.println(ap.sum(2000,2000));
   ap.func();
}
}

