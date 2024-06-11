package com.mycompany.dog;

//Implemention of Class And Object with the Example of dog class
public class Dog {
    //variable declartion  or methods of the class
    String name;
    String breed;
    int age;
    String color;
    //non-parameterized constructor
    public Dog(){
        System.out.println("creating Object non-parameterized");
    }
    //constructor Decalartion of class
    //parameterized constructor
    //constructor overloading
    public Dog(String name, String bread, int age, String color){
        System.out.println("creating Object parameterized");
        this.name = name;
        this.breed = bread;
        this.age = age;
        this.color = color;
    }
    //Methods overloading in constructor 
    public String getName(String Name){
        return Name; }
    //Methods of the class 
    public String getName(){
        return name; }
    public String getBreed(){
        return breed; }
    public Integer getAge(){
        return age; }
    public String getColor(){
        return color; }
    @Override public String toString()
    {
        return ("Hi my name is " + this.getName()
                + ".\nMy breed,age and color are "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }   
    public static void main(String[] args) {
        Dog D = new Dog();
        Dog d = new Dog("Jack", "Indian", 5, "white");
       
        System.out.println("Methods overloading in constructor " + D.getName("Tom"));
        //by toString
        System.out.println(d.toString());

    }
}
