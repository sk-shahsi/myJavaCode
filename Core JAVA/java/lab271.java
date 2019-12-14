class lab271{

public static void main(String[] args){
hello h=new hello(88);
h.show();
}
}
class hello{
int a;
hello(){
System.out.println("hello");
}
hello(int a){
this();
System.out.println("hello 1-args");
this.a=a;
}
void show(){
System.out.println(a);
}
}