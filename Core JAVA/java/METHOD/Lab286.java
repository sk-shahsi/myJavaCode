class Lab286{
public static void main(String []args){
	Hello H=new Hello();
	H.show(10);
	System.out.println(H.show(10));
}
}
class Hello{
int show (int x){
System.out.println("show()");
return 0;
}
}