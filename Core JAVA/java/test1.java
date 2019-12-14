class test1{
public static void main(String[] args){
	B ref=new B();
	ref.x=101
System.out.println(ref.ref.x);
}
}
class A{
	int x=99;
}
class B extends A{
	int y=99;
	A ref=new ref();
}
