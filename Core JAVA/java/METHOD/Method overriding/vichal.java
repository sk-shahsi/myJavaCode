//cteating a parrent class
class vichal{
void show(){
System.out.println("vichal is runing");
}
}
//creating a child class
class bike extends vichal{
public static void main (String[] args){
	//creating an instance of child class 
bike b=new bike();
  //calling the method with child class instance  

b.show();
}
}
