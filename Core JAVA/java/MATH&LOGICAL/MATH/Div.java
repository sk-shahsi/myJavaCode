class divesion{
public static void main(String[] args){
div D=new div();
D.show(10,2);
//System.out.println(D.show(10,5));
D.show(5,0);
}
}
class div{
void  show(int a,int b){
	if (b==0)
return;
System.out.println(a/b);

//return a%b;
}
}

