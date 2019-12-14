class Lab246
{
public static void main(String[] args){
hello h=new hello();

System.out.println("main");//3
h=new hello();


}
}
class hello{

{System.out.println("instance block");//2 4
}
static{

System.out.println("static block ");//1
}
}