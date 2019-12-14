
class test05 {
	public static void main(String [] args){
C ref=new C();
ref.super.x=999;
ref.show();
	}
}
class A{
	int x=99;
}
class B extends A{
	String x="jlc";
}
class C extends B{
	float x=11.1f;
void show(){
	System.out.println(super.x);
}
}
