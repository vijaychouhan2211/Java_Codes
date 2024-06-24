package Multi_Threading.DemoThreadCase;

//CASE 6: Overriding of start(); method
//If we override the start() method then over start() method will be executed just like a normal method call and the new thread
// won't be created. Generated by only main thread.
//Note:
//It's not recommend the start(); method otherwise don't go for multithreading concept.
//Example-->>

class Case6 extends Thread{
    public void start(){
        System.out.println("Start Method");
    }
    public void run(){
        System.out.println("Run Method");
    }

}
public class ThreadCase6 {
    public static void main(String[] args) {
        Case6 t = new Case6();
        t.start();
        System.out.println("Main Method");
    }
}
