abstract class person{
abstract void walking();
abstract void sleaping();

}
abstract class student extends person{
	 void walking(){
		System.out.println("abstract method over ride");
	}
}
class currentStudent extends student{
	void sleaping(){
		System.out.println("sleaping");
	}
}
class Lab405{
public static void main(String []args){
person cs=new currentStudent();
cs.walking();
cs.sleaping();
}
}