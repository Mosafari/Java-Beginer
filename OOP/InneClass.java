package OOP;

// In Java, it is also possible to nest classes (a class within a class). 
// The purpose of nested classes is to group classes that belong together, 
// which makes your code more readable and maintainable.

// To access the inner class, create an object of the outer class, and then 
// create an object of the inner class

// Unlike a "regular" class, an inner class can be private or protected. 
// If you don't want outside objects to access the inner class, declare the class as private(like -1-)

// ** If you try to access a private inner class from an outside class, an error occurs
// An inner class can also be static, which means that you can access it without 
// creating an object of the outer class
// ** Note: just like static attributes and methods, a static inner class does not
// have access to members of the outer class.

// Access Outer Class From Inner Class
// One advantage of inner classes, is that they can access attributes and methods of the outer class

class OuterCls {
    int x = 10;
  
    /* -1- private */ class InnerCls {
      int y = 5;
    }
    static class StaticInnerCls {
        int z = 1;
    }
    class InnerClass2 {
        public int myInnerMethod() {
        return x;
        }
  }
}
public class InneClass {
    public static void main(String[] args) {
        OuterCls myOuter = new OuterCls();
        OuterCls.InnerCls myInner = myOuter.new InnerCls();
        OuterCls.StaticInnerCls staticInner = new OuterCls.StaticInnerCls();
        System.out.println(myInner.y + myOuter.x + staticInner.z);
        OuterCls.InnerClass2 myInner2 = myOuter.new InnerClass2();
        System.out.println(myInner2.myInnerMethod());
      }
    
}
