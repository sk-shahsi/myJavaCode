interface inner{
	void m1();
	public abstract void m2();
	int A=10;
	public final int B=20;
}
abstract class Hello implements inner{
	public void m1(){
		System.out.println("hello m1()");
	}
}
class hii extends Hello{
	public void m2(){
		System.out.println("hii m2()");
}
void m3(){
	System.out.println("hii m3()");
}
}
class Lab415{
	public static void main(String []args){
		inner N=new hii();
		N.m1();
		N.m2();
		N.m3();
	}
}