package OOPS.Interfaces.InterfacesExtend_Default.InterfacesExtendsEachOther;

public interface A {

  //Static interface methods should have body here bcz they can't be overridden
  static void Yooyo()
  {
    System.out.println("I am static method and i can only accessed by a static method");
  }


  //IMPORTANT ==== We call interfaces in main method directly by it's name
  // A.fun();


 default public void fun()
 {
   System.out.println("I am in A");
 }
}
