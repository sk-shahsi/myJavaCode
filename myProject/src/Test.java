import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();

       //int row = 6;

        for (int i=0; i<row; i++)
        {

            for (int j=2*(row-i); j>=0; j--)
            {

                System.out.print(" ");
            }

            for (int j=0; j<=i; j++ )
            {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
