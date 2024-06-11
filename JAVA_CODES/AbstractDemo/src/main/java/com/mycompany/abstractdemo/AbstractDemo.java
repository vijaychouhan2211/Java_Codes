package com.mycompany.abstractdemo;
//Implemention of Abstract class
abstract class Vechile {
    public abstract void drive() ;
    public abstract void seats() ;
    public abstract void playmusic() ;
}
class Car extends Vechile{
    @Override
    public void drive(){
        System.out.println("Car....");
    }@Override
    public void seats() {
        System.out.println("Four seats");
    }@Override
    public void playmusic() {
        System.out.println("Play Music.....");
    }
}
class Bike extends Vechile {
    @Override
    public void drive(){
        System.out.println("Bike....");
    }@Override
    public void seats() {
        System.out.println("Two seats");
    }@Override
    public void playmusic() {
        System.out.println("Not supported yet.");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Car obj1 = new Car();
        Bike obj2 = new Bike();
        
        obj1.drive();
        obj1.seats();
        obj1.playmusic();
        obj2.drive();
        obj2.seats();
        obj2.playmusic();
    }
}
