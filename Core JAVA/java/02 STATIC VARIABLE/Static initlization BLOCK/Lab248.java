class Lab248
{
public static void main(String[] args){
System.out.println(hello.a);
}
}
class hello{
 static int a;
int b;

static{
a=10;
//b=20;//error
System.out.println("static block ");//1
}
}