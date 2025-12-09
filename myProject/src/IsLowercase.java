import java.util.Scanner;

public class IsLowercase {
    public static void main(String[] args) {
        System.out.println("How many strings would you like to pass?");
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        // String str="ASVXGFD";
        // System.out.println(  isStringLowerCase(str) );
        /*if (isStringLowerCase(string) == true) {
            System.out.println("FOUND! Sequences of lowercase");
        } else
            System.out.println("NOT FOUND! sequences of lowercase");*/
        System.out.println(isMixedCases(string));

    }
    private static boolean isStringLowerCase(String str){
        char[] charArray = str.toCharArray();

        for(int i=0; i < charArray.length; i++){
            if( !Character.isLowerCase( charArray[i] ))
                return false;
        }

        return true;
    }
    public static boolean isAllUpperCase(String word) {
        if ( word == null ) return false; // this just to avoid NPE
        return word.toUpperCase().equals(word);
    }

    public static boolean isAllLowerCase(String word) {
        if ( word == null ) return false; // this just to avoid NPE
        return word.toLowerCase().equals(word);
    }

    public static boolean isMixedCases(String word) {
        if ( word == null ) return false; // unless you consider null to be mix
        return !isAllLowerCase(word) && !isAllUpperCase(word);
    }
}
