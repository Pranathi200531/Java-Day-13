import java.util.*;
class a{
    public void a1()
{
    System.out.println("Hello Karishma");
}
}
class b extends a{
    public void b1()
    {
        System.out.println("Hello Pranathi");
    }
}
class c extends a{
    public void c1()
    {
        System.out.println("Hello Fazeela");
    }
}
public class Hierarchical{
    public static void main(String args[]){
        b h=new b();
        h.a1();
        h.b1();
        c h1=new c();
        h1.a1();
        h1.c1();
    }
}