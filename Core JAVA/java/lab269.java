class lab260{
public static void main(String[] args){
//Student S=new Student(99,"sri","sri@",99999);
//S.show();
Student S1=new Student(100,"ram");
//S1.show();
Student S2=new Student(101,"xyz");
//S2.show();
/*Student S3=new Student(102);
//S3.show();
//Student S4=new Student();
//S4.show();*/
}
}
class Student{
int id;
String name;
//String email;
//long mob;

/*Student(int i ,String n,String e,long m){
	System.out.println("4 args constructor");
	id=i;
	name=n;
	email=e;
	mob =m;
}
Student(int i,String n){
	System.out.println("2 args constructor");
	id=i;
	name=n;

}*/
	Student(int i,String n){
		System.out.println("2 args constructor");
		this.id=i;
		this.name=n;
	}
	
	Student(){
		System.out.println("no args");

}
void show(){
System.out.println(id+" \t"+name);
}
}