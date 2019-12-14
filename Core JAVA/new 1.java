 class tostringmethode {
	public static void main(String[] args) {
		Student s=new Student("aashish",101,856958);
		Student s1=new Student("ravi",102,458796);
		System.out.println(s);
		System.out.println(s1);
		
	}

}
class Student{
	String name;
	int roll;
	long mob;
	public Student(String name, int roll, long mob) {
		this.name = name;
		this.roll = roll;
		this.mob = mob;
	}
	
}