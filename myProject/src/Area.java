import java.text.DecimalFormat;

public class Area extends shape{
    void rectangleArea(int length,int breadth){
        System.out.println(length*breadth);
    }

    void squareArea(int side){
        System.out.println(side*side);
    }
    private static  final DecimalFormat df=new DecimalFormat("0.00");
    void circleArea(double radius){

        System.out.println(df.format(3.142*radius*radius));
    }




}
