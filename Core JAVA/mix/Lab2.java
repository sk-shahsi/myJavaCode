class Lab2{
public static void main(String []args){
hello h=new hello();
hello h2=new hello();

System.out.println(h.a +"  "+h2.a);
h.a=33;
h2.a=44;
System.out.println(h.a+" "+h2.a);

}
}
class hello{
int a;// instance permative variable
}
