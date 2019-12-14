class Lab241
{
public static void main(String[] args){
hello h=new hello();
System.out.println("main"+h.a);
}
}
class hello{
int a;
{
a=10;
System.out.println("instance "+a);
}
}