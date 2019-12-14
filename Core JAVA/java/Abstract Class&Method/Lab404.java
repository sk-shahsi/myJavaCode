abstract class Shape{
abstract void area();
}
class Squrare extends Shape{
	 void area(){
		System.out.println("abstract method over ride");
	}
}
class Lab404{
public static void main(String []args){
Shape sp=new Squrare();
sp.area();
}
}