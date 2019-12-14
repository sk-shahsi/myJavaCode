class Lab279{
public static void main(String[] args){
//hello h=null;
//h.show();//null pointer exception
hello h=new hello();
h.show();
//hello.show(); non static can not refer from static area
}
}
class hello{
	static int a;
 show(){//return type missing
System.out.println(a);
}
}  