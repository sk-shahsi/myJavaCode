class test06{
public static void main(String[] args){
	
	B ref=new B();
	ref.show();
}
}
class A{
	
	
		int x=10;
//System.out.println("A static block");

}
class B extends A{
	boolean y=true;
	void show(){
A ref=new A();
System.out.println(x); 
}
}
