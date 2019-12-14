

 class cat {
int j;
cat(int j)
{
	this.j=j;
}
}
class dog implements Cloneable{
	cat c;
	int i;
	dog(cat c,int i)
	{
		this.c=c;
		this.i=i;
}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class ShalloClonable{
	public static void main(String[] args)throws CloneNotSupportedException {
		cat ca=new cat(20);
dog D=new dog(ca,10);
dog d2=(dog)D.clone();
System.out.println(d2.i+" "+d2.c.j);
		
		  d2.i=8888; d2.c.j=9999; System.out.println(d2.i +" " + d2.c.j);
		 
		
	}

	}
