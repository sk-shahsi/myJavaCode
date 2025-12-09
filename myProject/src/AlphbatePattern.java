import java.util.Scanner;

public class AlphbatePattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i = 0; i <= a-1; i++)
        {
            int alphabet = 65;
            for (int j = a-1; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}
