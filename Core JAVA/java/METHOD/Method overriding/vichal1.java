class vichal{
	//defining the method
void run(){
System.out.println("vichal.is runing");
}
}
class bike extends vichal{
	//defining the metho as parrent method
void run(){
System.out.println("bike is runing");
}
public static void main(String[] args){
bike b1=new bike();//creating object of bike
//calling the method
b1.run();
}
}
