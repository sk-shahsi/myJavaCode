class L03{
int id;
String name;
void insert(int i,String n){
id=i;
name=n;
}
void show(){
System.out.println(id+" "+name);
}
}
class lab03{
public static void main(String[] args){
L03 LL=new L03();
L03 LL1=new L03();
LL.insert(101,"ashish");
LL1.insert(102,"ranjan");
LL.show();
LL1.show();
}
}