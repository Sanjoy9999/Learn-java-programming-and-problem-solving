// class Pen{
//     String color;
//     String type; //ballpoint ;gel 

//     public void write(){
//         System.out.println("Writing something");
//     }

//     public void printColor(){
//         System.out.println(this.color);
//     }
// }

// class Student{
//     String name;
//     int age;

//     // public void printInfo(){
//     //     System.out.println(this.name);
//     //     System.out.println(this.age);
//     // }


//     //non parameterized constructor
//     // Student(){
//     //     System.out.println("Constructor called");
//     // }


//     //Parameterized constructor 

//     // Student(String name,int age){
//     //     this.name = name;
//     //     this.age = age;
//     // }


//     // Student(Student s2){
//     //     this.name = s2.name;
//     //     this.age = s2.age;
//     // }

//     // Student(){
        
//     // }


//     //Polymorphism

//     public void printInfo(String name){
//         System.out.println(name);
//     }


//     public void printInfo(int age){
//         System.out.println(age);
//     }


//     public void printInfo(String name,int age){
//         System.out.println(name +" " +age);
//     }
// }


// public class OPPS{

//     public static void main(String [] args){
//         // Pen pen1 = new Pen();
//         // pen1.color = "Blue";
//         // pen1.type = "gel";

//         // Pen pen2 = new Pen();
//         // pen2.color = "Black";
//         // pen2.type = "BallPoint";

//         // // pen1.write();
//         // pen1.printColor();
//         // pen2.printColor();






//         // Student s1 = new Student("Sanjoy",27);
//         //non parameterized constructor
//         // s1.name = "Payel";
//         // s1.age = 25;
       
//         Student s1 = new Student();
//         s1.name = "Sanjoy";
//         s1.age  = 27;

//        s1.printInfo(s1.name,s1.age);
//     }

// }











//Inheritance 


// class Shape{
//     String color;
// }

// class Triangle extends Shape{
    
// }

// public class OOPS{
//     public static void main(String args[]){
//         Triangle t1 = new Triangle();
//         t1.color = "Red";
//     }
// }



//Single Level Inheritance


// class Shape{
//     public void area(){
//         System.out.println("Display area");
//     }
// }

// class Triangle extends Shape{
//    public void area(int l,int h){
//     System.out.println(0.5*l*h);
//    }
// }


// public class OOPS{
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//          t1.area(2,3);
//     }
// }











//Multilevel Inheritance


// class Shape{
//     public void area(){
//         System.out.println("Display area");
//     }
// }

// class Triangle extends Shape{
//    public void area(int l,int h){
//     System.out.println(0.5*l*h);
//    }
// }

// class EquilateralTriangle extends Triangle{
//    public void area(int l,int h){
//     System.out.println(0.5*l*h);
//    }
// }


// public class OOPS{
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//          t1.area(2,3);
//     }
// }




//Hierarchical Inheritance


// class Shape{
//     public void area(){
//         System.out.println("Display area");
//     }
// }

// class Triangle extends Shape{
//    public void area(int l,int h){
//     System.out.println(0.5*l*h);
//    }
// }

// class Circle extends Shape{
//     public void area(int r){
//         System.out.println(3.14*r*r);
//     }
// }


// public class OOPS{
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//          t1.area(2,3);
//     }
// }




//Hybrid Inheritance
//Singlelevel inheritance 
//Multilevel inheritance 

// class Shape{
//     public void area(){
//         System.out.println("Display area");
//     }
// }

// class Triangle extends Shape{
//    public void area(int l,int h){
//     System.out.println(0.5*l*h);
//    }
// }

// class Circle extends Shape{
//     public void area(int r){
//         System.out.println(3.14*r*r);
//     }
// }


// public class OOPS{
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//          t1.area(2,3);
//     }
// }


//===================================================================================

// import java.util.*;

// import bank;



// public class OOPS{
//     public static void main(String[] args) {
//     bank.Account account1 = new bank.Account();
//     account1.name = "Customer1";
//     }
// }

// ================================================================================


// class Animal{
//     public void walk(){

//     }
// } 

//No need make class of animal because we can not make any specific animal
//So

// it is a concepts we can create but we cannot use 
//Walk() not work .It is just exist 
// abstract class Animal{
//     abstract void walk();// walk() it should be exist all type of class 
//     Animal(){
//         System.out.println("You are creative a new animal");
//     }
//     public void eat(){
//         System.out.println("Animals eats");
//     }
// }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("Created a Horse");
//     }
//     public void walk(){
//         System.out.println("Walk on 4 legs");
//     }
// }

// class Chicken extends Animal{
//   public void walk(){
//     System.out.println("Walk on 2 legs");
//   }
// }




// public class OOPS{
//     public static void main(String[] args) {
//         Horse horse = new Horse();
        

//         //Runtime error
//         // Animal animal = new Animal();
//         // animal.walk();
//     }
// }


// ==================================================================================


// Pure Abstraction happen by interface 


// interface Animal{
//     int eyes = 2; //static or final
//     public void walk(); //Here i remove public word by default public and abstract 
//     //int interface function 
//     //1)Do not make any constructor function
//     //2)Do not make any normal function
// }



// interface Herbivore{

    
// }


// //In interface only write implements instead extends 
// class Horse implements Animal,Herbivore{
//    public void walk(){
//     System.out.println("Walk on 4 legs");
//    }
// }

// public class OOPS{
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.walk();
//     }
// }







// ===============================================================================================


//Static keyword


class Student{
    String name;
    static String school;

    public static void chnageSchool(){
        school = "newschool";
    }
}

public class OOPS{
    public static void main(String[] args) {
        Student.school = "ABV";
        Student student1 = new Student();
        student1.name = "joy";
        System.out.println(student1.school);
    }
}