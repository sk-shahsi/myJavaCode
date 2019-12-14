class emp1{
int id;
String name;
float salary;
long mob;
void insert(int i,String n,float f,long m){
id=i;
name=n;
salary=f;
mob=m;
}
void show(){
System.out.println("id is "+id+ ",name "+name + ",salary is "+ salary + " ,mob "+mob);
}
}
class employe{
public static void main(String[] args){
emp1 E1=new emp1();
emp1 E=new emp1();
E.insert(101,"aashish",50000,65512215);
E1.insert(102,"ranjan",40000,512215);

E.show();
E1.show();

}
}