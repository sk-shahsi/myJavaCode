class Lab296{
public static void main(String[]args){
hello h=new hello();
int a=h.add(10,20);
System.out.println(a);
h.add(10,20);
}
}
class hello{
int add(int a,int b){
return a+b;
}
void add(byte b,int a){
System.out.println("add(int,int)");
}
}