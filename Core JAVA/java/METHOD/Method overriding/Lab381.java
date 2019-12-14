class Lab381{
public static void main(String[] args){
new B().m1();
}
}
class A{
void m1(){}
}
class B extends A{
private void m1(){}
}