import java.util.*;
interface a{
    public void r();
}
interface b{
    public void r1();
}
class c implements a,b{
    public void r(){
        System.out.println("Hello Teacher");
    }
    public void r1(){
        System.out.println("Hello Pranathi");
    }
}
public class Multipleinheritance{
    public static void main(String args[]){
        c h=new c();
        h.r();
        h.r1();
    }
}
