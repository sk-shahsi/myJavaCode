abstract class Shape{
abstract void area();
}
class Squrare extends Shape{}
class Lab400{
public static void main(String []args){
Shape sp=new Squrare();//we can not creat object of abstract class;
sp.area();
}
}