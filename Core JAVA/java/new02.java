class lab01{
public static void main(String[] args){
hello h=new hello();
System.out.println(hello.a);
}
}
class hello{
static int a=10;
 hello(){
System.out.println("this.a");
}
static{
	
	System.out.println("a");
}
}
