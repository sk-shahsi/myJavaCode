class Lab244
{
public static void main(String[] args){
//hello h=new hello();
System.out.println("main"+hello.a);
System.out.println("main"+hello.a);

}
}
class hello{
static int a;
{System.out.println("instance block");
}
static{
a=10;
System.out.println("static block ");
}
}