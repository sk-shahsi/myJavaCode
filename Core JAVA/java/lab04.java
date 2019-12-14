class lab04{
public static void main(String []args){
	System.out.println(hello.a);
}}
class hello{
	static int a=10;
	static hello h=new hello();
	{
		System.out.println("IB");
	}
	static{
		System.out.println("sb");
	}
}
