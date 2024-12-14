//import java.util.*;
class library{
String name;
int bb;
library(String name)
{
    this.name=name;
    this.bb=0;
}
public boolean cb()
{
    return false;
}
public void bob()
{
    if(cb())
    {
        bb++;
         System.out.println(name+"you borrowed"+bb+"books");
    }
    else
    {
        System.out.println("your limit Exceeded!");
    }
}
}
class students extends library{
    students(String name)
    {
        super(name);
    }
}
class teachers extends library
{
    teachers(String name)
    {
        super(name);
    }
    public boolean cb()
    {
        return bb<10;
    }
}
public class Libraryexample{
    public static void main(String []args){
        library a=new students("A");
        library b=new teachers("B");
        a.bob();
        b.bob();

    }
}
