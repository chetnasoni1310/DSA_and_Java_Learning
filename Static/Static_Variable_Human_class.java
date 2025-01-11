import java.util.*;
//import java.io.*;


public class Static_Variable_Human_class {

int age;
String name;
boolean married;
int salary;
static long population;
public Static_Variable_Human_class(int age, String name, boolean married,int salary){
   this.age=age;
   this.name=name;
   this.married=married;
   this.salary=salary;
   Static_Variable_Human_class.population+=1;
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
Static_Variable_Human_class kunal=new Static_Variable_Human_class(4,"Chetna",false,10000000);
Static_Variable_Human_class chetna=new Static_Variable_Human_class(14,"Kunal",true,100);
System.out.println(Static_Variable_Human_class.population);

sc.close();


}
}
