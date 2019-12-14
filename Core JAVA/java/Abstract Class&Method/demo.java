class labTest{
public static void main(String[] args){
demo d=new A();
d.show();
System.out.println(d.x);
}
}
abstract class demo{
int x=10;
void show(){
System.out.println("abstract class");
}
}
class A extends demo{}
