class test04{
public static void main(String[] args){
D ref=new D();

System.out.println(ref.x);
}
}
class A{
int x=10;
}
class B extends A{}
class C extends B{
	String x="jlc";
}
class D extends B{
	//boolean x=false;
}