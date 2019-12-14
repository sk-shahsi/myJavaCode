class Lab380{
public static void main(String[] args){
hii h=new hii();
h.m1();
}}
class hello{
 void m1(){

}
}
class hii extends hello{
final void m1(){

}
}
class Lab379{
public static void main(String[] args){
hii h=new hii();
h.m1();
}}
class hello{
A m1(){
return new A();
}
}
class hii extends hello{
B m1(){
return new B();
}
}
class A{}
class B extends A{}