class Test25{
	public static void main(String[] args){
		B ref=new B();
		super.x=999;
		ref.show();
	}
}
class A{
	int x=10;
}
class B extends A{
	String x="jlc";
	void show(){
		System.out.println(super.x);
	}
}
