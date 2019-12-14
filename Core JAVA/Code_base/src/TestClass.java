class A{
    static {
        System.out.println("hello this super static block");
    }
    public void show(){
        System.out.println("hello parant");
    }
}
public class TestClass extends A{
    static {
        System.out.println("this is chaild block");
    }


    public void show() {
        super.show();
        System.out.println("hello child");
    }

    public static void main(String[] args) {
    A t= new TestClass();
    t.show();
    }
}
