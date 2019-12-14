interface inner1{
void m1();
void m2();
int b=20;
int a=10;
}
interface inner2{
void m2();
void m3();
int c=30;
int d=40;
}
class hello implements inner1,inner2{
public void m1(){
System.out.println("m1()");
}
public void m2(){
System.out.println("m2()");
}
public void m3(){
	System.out.println("m3()");
	System.out.println(inner1.b);
	System.out.println(c);
	System.out.println(a);
}
}
class Lab417{
public static void main(String[] args){
hello h=new hello();
h.m1();
h.m2();
h.m3();
}
}

