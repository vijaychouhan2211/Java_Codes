package InnerClassDemo;

//outer class can not be static
class A{
    void show() {
        System.out.println("Outer Class ");
    }
    //inner class
     class B{
        void disply() {
            System.out.println("Inner Class");
        }
        //static inner class
        static class C{
            void out() {
                System.out.println("Inner Static Class");
            }
        }
    }
}
public class DemoInnerClass {
    public static void main(String[] args) {
        //obj of Outer class
        A obj = new A();
        obj.show();
        //obj of inner class
        A.B obj1 = obj.new B();
        obj1.disply();
        //obj of Inner static class
        A.B.C obj2 = new A.B.C();
        obj2.out();
    }
}
