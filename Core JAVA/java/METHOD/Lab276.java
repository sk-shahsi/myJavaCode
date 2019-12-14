class Lab276{
public static void main(String[] args){
hello a=null;
a.show();//null pointer exception
hello h=new hello();
h.show();
hello.show(); //non staticwe can not refer from static area
}
}
class hello{
static void show(){
System.out.println("instance show");
}
} 