class Lab388{
public static void main(String []args){
B b =new B();
B.m1();
}
}
class A{
 void m1(){
 System.out.println("A");
 }
 }
 class B extends A{
 static void m1(){
 System.out.println(" static b");
}
}
