class Lab227{
public static void main(String [] args){
Hello H=new Hello();
Hello H1=new Hello();
System.out.println(H.a +"  "+ H1.a);
H.a=99;
System.out.println(H.a +"  "+ H1.a);
}
}
class Hello{
int a;
}
 