class lab01{
public static void main(String []args){
new C();

}
}
class A{
A(int x){
System.out.println("A()");
}
}
class B extends A{
B(){
	super(1);
System.out.println("B()");
}
}class C extends B{
	C(){
		
		System.out.println("C()");
}}
	
