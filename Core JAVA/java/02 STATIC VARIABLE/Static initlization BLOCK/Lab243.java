class Lab243
{
public static void main(String[] args){
hello h=new hello();
System.out.println("main"+h.a);
}
}
class hello{
static int a;
static{
a=10;
System.out.println("instance "+a);
}
}