class Test{
public static void main(String []args){
test1 T=new test1();
int A=T.add(10,20);
System.out.println(A);
String S=T.add("abc","def");
System.out.println(S);
}
}
class test1{
int add(int a,int b){
return a+b;
}

String add(String c,String d){
	return c+d;
}

char add(ch a ,ch b){
	return a+b;
}
}
	
