package org.example;
import java.util.*;
public class uc5tictac {
    public static void main (String args[]){
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(" Fill the operation - add , sub , mul , div ");
        String user = sc.next();


        int add = a+b;
        int sub = a-b;
        int mul = a*b ;
        int div = a/b;



                if (user.equals("add")){
                    System.out.println("addition : " + (a+b));
                }

                else if ( user.equals("sub")) {
                    System.out.println("subtraction : " + sub);
                }
                else if (user.equals("mul")){
                    System.out.println("multiplication : " + mul);}
                else if (user.equals( "div")){
                    System.out.println("division :" + div);
                }

    }
}
