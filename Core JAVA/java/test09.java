class test09{
public static void main (String []args){
A ref=new A();
ref.x=99;
System.out.println(ref.x);
}
}
class A {
	int x;
}

class B extends A{
	String x;

}
