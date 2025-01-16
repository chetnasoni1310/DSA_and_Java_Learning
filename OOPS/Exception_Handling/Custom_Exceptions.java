package OOPS.Exception_Handling;

import java.util.Scanner;

public class Custom_Exceptions {
    //yeh wala syntax error deta hai
    //toh isko 2 tarike se resolve kr skte hai followed by hai
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter age: ");
//        int age=sc.nextInt();
//        if(age>100)
//        {
//            throw new My_Self_Exception();
//        }
//    }
//}
//class My_Self_Exception extends Exception
//{
//
//}

    //Not so useful
    //not handling gracefully
//public static void main(String[] args) throws My_Self_Exception1{
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Enter age: ");
//    int age=sc.nextInt();
//    if(age>100)
//    {
//        throw new My_Self_Exception1("My error is this"); //
//    }
//}
//}
//class My_Self_Exception1 extends Exception
//{
//
//    public My_Self_Exception1(String message) {
//        super(message);
//    }
//}


    //YAA PHIRRRR

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        try {
            int age = sc.nextInt();
            if (age > 100) {
                throw new My_Self_Exception2("This is the correct way of handling this error");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
        class My_Self_Exception2 extends Exception
        {
            public My_Self_Exception2(String message) {
        super(message);
    }
       }