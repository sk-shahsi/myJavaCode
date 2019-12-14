class Lab385{
public static void main(String[] args){
new B().m2();
}}
class A{
//protected void m1(){}
public void m2(){}
protected void m3(){}
}
class B extends A{
//private void m1(){}
protected void m2(){}
 //void m3(){}
}
