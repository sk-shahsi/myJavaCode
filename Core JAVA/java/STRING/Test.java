class Test{
public static void main(String []args){
        String S= "hello";
		String S1="hello";
		String S2=new String("hello");
		String S3=new String("hello");
		String S4=new String("hello"+"java");
		String S4=new String 'a';
		String S5=new String('a');
		System.out.println(S==S1);
		System.out.println(S2==S1);
		System.out.println(S3==S2);
		System.out.println(S4==S1);
		System.out.println(S4==S2);
		System.out.println(S4==S1);
		System.out.println(S4==S5);
		}
		}