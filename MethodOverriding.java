class Department{
void run(){
System.out.println("Department");
}
}
class Car extends Vehicle{
@Override
void run(){
System.out.println("Bca Department");
}
}
public class MethodOverriding{
public static void main(String[]args)
{
Department d=new Department();
d.display();
BCA b=new BCA();
b.display();
Department obj=new BCA();
obj.display();
}
}

