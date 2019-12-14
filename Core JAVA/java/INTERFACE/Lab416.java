interface inner{
void m1();
int a=10;
}
interface inner2{
void m2();
int b=20;
}
class hello implements inner,inner2{
public void m1(){
System.out.println("m1()");
}
public void m2(){
System.out.println("m2()");
}
}
class Lab416{
public static void main(String[] args){
hello h=new hello();
System.out.println(h.a);
System.out.println(h.b);
h.m1();
h.m2();
}
}

