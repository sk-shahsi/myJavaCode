public class TestStatic{
public static void main(String[] args){
	B.show();
}
}
class A{
static void show(){
System.out.println("A static show()");
}
static{System.out.println("A static show()");}
}
class B extends A{
static void show(){
//System.out.println("B static Show()");
}
}