class Shape{//if abstract method is avlable in side class, class must define abstract.
abstract void area(){}//abstract dos't have body.
}
class Squrare extends Shape{}
class Lab400{
public static void main(String []args){
Shape sp=new Squrare();
sp.area();
}
}