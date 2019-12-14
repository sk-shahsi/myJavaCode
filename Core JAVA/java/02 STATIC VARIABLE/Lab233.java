class Lab233{
public static void main(String []args){
hello h=new hello();
hello h1=new hello();

System.out.println(h.b+" "+h1.b);
h1.b=99;
System.out.println(h1.b+" "+h.b);
}
}
class hello{
static int b;
}
