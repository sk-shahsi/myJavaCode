class Lab247
{
public static void main(String[] args){
//hello h=new hello();
hello h=null;
System.out.println("main");//1
h=new hello();


}
}
class hello{

{System.out.println("instance block");//3
}
static{

System.out.println("static block ");//2
}
}