class test05{
	public static void main(String[] args){
		new c();
	}
}
class a{
static int a=10;
static{
System.out.println("A static block");
System.out.println(a);
}
}
class b extends a{
static int a=20;
static{
System.out.println("b static block");
System.out.println(a);
}
}
class c extends b{
	static int b=30;
	static{
		System.out.println("c Static block");
		System.out.println(b);
	}
}