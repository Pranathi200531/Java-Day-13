 import java.util.*;
class a{
    public void pl()
    {
        System.out.println("Hello Students");
    }
}
class b extends a{
    public void r(){
        System.out.println("Hello Teacher");
    }
}
class c extends b{
    public void r1(){
        System.out.println("Hello Professors");
    }
}
public class Multilevel{
    public static void main(String args[]){
        c f=new c();
        f.pl();
        f.r();
        f.r1();
        
    }
} 