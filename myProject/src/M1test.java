import java.util.Scanner;

public class M1test {
//    public static void main(String[] args) {
//        System.out.println("'Hi'");
//        M1 m=new M1();
//
//        m.main(" ");
//        m.main(" "," ");
//        Area a=new Area();
//        a.rectangleArea(2,5);
//        a.squareArea(8);
//        a.circleArea(3.2);
//        Scanner sc=new Scanner(System.in);
//        boolean b=sc.hasNext();


    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int side=sc.nextInt();
        double radius=sc.nextDouble();
        Area area=new Area();
        area.rectangleArea(length,breadth);
        area.squareArea(side);
        area.circleArea(radius);
    }
    }


    /*The first line of the output should display 'Hi'.

        The second line of the output should display 'Overloaded: Hello World'.

        The third line of the output should display 'Overloaded: Tom & Jerry'.
*/