import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        /*int c =33*36;
        if (c%2==0){
            System.out.printf("YES");
        }else {
            System.out.println("NO");
        }*/
//        int a=1;
//        int b=10;
//        for (int i = a+1; i <b ; i++) {
//            if (i%3==0 || i%5==0 || i%7==0){
//                System.out.println(i);
//            }
//        }
      //  Scanner sc=new Scanner(System.in);
        //System.out.println("Enter n");
       // int x=sc.nextInt();

    int a=2,b=3;

        float newTotal=0.0f;

        long total=a*250+b*500;
        if(total==0){
            System.out.println("Total Price 0.0");
        }
        else if(total>3000){
            float discount=(total*10)/100;
            newTotal=total-discount;

            System.out.println("Total Price "+newTotal);
        }
        else{
            System.out.println("Total Price "+newTotal);
        }
    }
}