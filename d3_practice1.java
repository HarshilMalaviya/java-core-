import java.util.*;
import java.lang.*;

public class d3_practice1 {
    public static void main(String[] args) {
        String s="peep";
        String s2="";


        for (int i = 0; i < s.length(); i++) {
            s2= s.charAt(i) + s2;
        }
        if(s.equals(s2)){
            System.out.println("it is  palindrom");
        }else{
            System.out.println("it is not palindrom");
        }


    }
}
