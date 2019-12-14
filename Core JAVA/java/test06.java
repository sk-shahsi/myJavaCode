class test06{
public static void main(String[] args){
	
	B ref=new B();
	ref.x=99;
	ref.show();
}
}
class A{
	
	
		int x=10;
//System.out.println("A static block");

}
class B extends A{
	//boolean x=true;
	void show(){
A ref=new A();
System.out.println(super.x); 
}
}
