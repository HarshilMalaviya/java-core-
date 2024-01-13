import java.lang.*;
import java.util.*;
public class d3_practice2 {
    static void palindrome (String s){
        String s2="";


        for (int i = 0; i < s.length(); i++) {
            s2= s.charAt(i) + s2;
        }
        if(s.equals(s2)){
            System.out.println("it is  palindrom");
        }else{
            System.out.println("it is not palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your word");
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        String s3= sc.nextLine();
        palindrome(s1);
        palindrome(s2);
        palindrome(s3);

    }
}
