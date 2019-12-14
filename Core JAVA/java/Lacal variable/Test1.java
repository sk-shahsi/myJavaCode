class test{
public static void main(String args[]){
System.out.println("b-----------"+ A.a);
}
}
class A{
static int a;
static{
final int b=10;
System.out.println(a);
//System.out.println(c);
System.out.println(b);
}
}